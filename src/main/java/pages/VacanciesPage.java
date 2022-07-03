package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class VacanciesPage extends BasePage {

    @FindBy(linkText = "TEST AUTOMATION ENGINEER")
    private WebElement testAutomationEngineerElement;

    public VacanciesPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void selectTestAutomationEngineer() {
        click(testAutomationEngineerElement);
    }
}
