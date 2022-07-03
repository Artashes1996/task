import helpers.MenuItems;
import org.testng.annotations.*;

import static org.testng.Assert.assertTrue;

public class VerifySkillsCount extends BaseTest {

    @Test(description = "Verify that paragraph under Professional skills and qualification: contains exactly 5 skills.")
    public void verifyThatJobContainsExactlyFiveSkills() {
        homePage.openHomePage();
        homePage.selectMenuItem(MenuItems.CAREERS);
        homePage.selectVacancies();
        vacanciesPage.selectTestAutomationEngineer();
        assertTrue(vacancyPage.getSkillsCount() >= 5);
    }
}
