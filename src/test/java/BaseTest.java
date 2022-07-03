import helpers.BaseUIHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import pages.HomePage;
import pages.VacanciesPage;
import pages.VacancyPage;

import static configuration.Config.BASE_URL;

public class BaseTest {
    public ThreadLocal<WebDriver> driver;
    public HomePage homePage;
    public VacanciesPage vacanciesPage;
    public VacancyPage vacancyPage;

    protected WebDriver webDriver() {
        return driver.get();
    }


    @BeforeClass(alwaysRun = true, description = "Before class")
    public void setup() {
        this.driver = new ThreadLocal<>();
        this.driver.set(BaseUIHelper.getDriver());
        this.driver.get().manage().window().maximize();
        homePage = PageFactory.initElements(webDriver(), HomePage.class);
        vacanciesPage = PageFactory.initElements(webDriver(), VacanciesPage.class);
        vacancyPage = PageFactory.initElements(webDriver(), VacancyPage.class);
        webDriver().navigate().to(BASE_URL);
    }

    @AfterClass(alwaysRun = true, description = "After method")
    public void tearDown() {
        if (driver.get() != null) {
            driver.get().quit();
        }
    }
}