package steps;

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

    //    @Given("user is on {string}")
//    public void user_is_on(String page) {
//        switch (page.toLowerCase()) {
//            case HOME_PAGE -> {
//                driver = Hook.getDriver();
//                toolTipPage = new ToolTipPage(driver);
//            }
//        }
//    }
//    @When("they reach to the ToolTip page")
//    public void they_reach_to_the_tool_tip_page() {
//
//    }
//
//    @Then("they can see the {string}")
//    public void theyCanSeeThe(String text) {
//        System.out.println(toolTipPage.heading());
//    }
//   /* @Then("they can see the ToolTip")
//    public void they_reach_to(){
//
//    }*/
    @Given("user is on home-page")
    public void userIsOnHomePage() {
        driver = Hook.getDriver();
        homePage = new HomePage(driver);

        Assert.assertEquals("Automate, Analyze, Achieve", homePage.getTextFromHomePage());

    }

    @When("they reach to the ToolTip page")
    public void they_reach_to_the_tool_tip_page() {
        homePage.clickOnToolTip();

    }

    @Then("they can see the {string}")
    public void they_can_see_the(String text) {
        toolTipPage = new ToolTipPage(driver);
        switch (text) {
            case "Vienna, Austria" -> Assert.assertEquals(text, toolTipPage.getToolTipText());
            case "Tooltip" -> Assert.assertEquals(text, toolTipPage.heading());
        }

    }

}
