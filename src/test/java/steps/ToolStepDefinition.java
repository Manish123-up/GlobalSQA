package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.ToolTipPage;

public class ToolStepDefinition {
    private WebDriver driver;
    private HomePage homePage;
    private ToolTipPage toolTipPage;

    @Given("user is on home-page")
    public void userIsOnHomePage() {
        driver = Hook.getDriver();
        homePage = new HomePage(driver);
        toolTipPage = new ToolTipPage(driver);
        Assert.assertEquals("Automate, Analyze, Achieve", homePage.getTextFromHomePage());

    }

    @When("they reach to the ToolTip page")
    public void they_reach_to_the_tool_tip_page() {
        homePage.clickOnToolTip();

    }

    @And("they click on Form Based tab")
    public void theyClickOnFormBasedTab() {
        toolTipPage.clickOnAToolTipTab();
    }

    @Then("they can see the {string}")
    public void they_can_see_the(String text) {
        switch (text) {
            case "Vienna, Austria" -> Assert.assertEquals(text, toolTipPage.getToolTipTextForImageBasedTab());
            case "Tooltip" -> Assert.assertEquals(text, toolTipPage.heading());
            case "firstname" -> Assert.assertEquals(text, toolTipPage.getToolTipTextForFormBasedTab());
        }
    }
}
