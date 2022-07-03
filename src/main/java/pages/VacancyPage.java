package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VacancyPage extends BasePage {

    //  Bad practice, but project not have a good locator
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div[9]/div/div/ul[1]/li")
    private List<WebElement> skillsContent;

    public VacancyPage(WebDriver webDriver) {
        super(webDriver);
    }

    public int getSkillsCount() {
        waitForElements(skillsContent);
        return skillsContent.size();
    }
}
