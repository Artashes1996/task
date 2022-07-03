package pages;

import helpers.MenuItems;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import static configuration.Config.BASE_URL;

public class HomePage extends BasePage {

    @FindBy(linkText = "VACANCIES")
    private WebElement vacanciesElement;

    private final String PAGE_URL = BASE_URL;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void selectMenuItem(MenuItems menuItem) {
        click(driver.findElement(By.linkText(menuItem.name())));

    }

    public void selectVacancies() {
        click(vacanciesElement);
    }

    public void openHomePage() {
        driver.get(PAGE_URL);
    }
}
