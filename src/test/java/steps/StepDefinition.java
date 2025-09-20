package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.DatePickerPage;
import pages.HomePage;
import pages.ToolTipPage;

import static constants.Constants.HOME_PAGE;

public class StepDefinition {


    private final WebDriver driver = Hook.getDriver();

    private final HomePage homePage = new HomePage(driver);
    private final DatePickerPage datePickerPage = new DatePickerPage(driver);
    private final ToolTipPage toolTipPage = new ToolTipPage(driver);

    @Given("user is on {string}")
    public void user_is_on(String page) {
        switch (page.toLowerCase()) {
            case HOME_PAGE -> Assert.assertEquals("Automate, Analyze, Achieve", homePage.getTextFromHomePage());
        }
    }

    @When("they reach to the DatePicker page")
    public void they_reach_to_the_date_picker_page() {
        new HomePage(driver).clickOnDatePicker();
    }

    @And("they provide {string} date")
    public void theyProvideDate(String date) {
        datePickerPage.getDate(date);
    }

    @And("they provide {string} date {string} month and {string} year")
    public void theyProvideDateMonthAndYear(String date, String month, String year) {
        datePickerPage.clickOnDropDownDatePicker(date, month, year);
    }

    @And("they provide {string} date for IconTrigger")
    public void theyProvideDateForIconTrigger(String dateValue) {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
        datePickerPage.IconTriggerTest(dateValue);
    }

    @When("they reach to the {string}")
    public void theyReachToThe(String page) {
        switch (page) {
            case "ToolTip page" -> homePage.clickOnToolTip();
            case "DatePicker page" -> homePage.clickOnDatePicker();
        }
    }

    @And("they click on Form Based tab")
    public void getToolTipTextForFormBasedTab() {
        toolTipPage.clickOnAToolTipTab();
    }

    @Then("they can see the provided {string} date value in the {string} date")
    public void they_can_see_the_provided_date_value_in_the_date(String dateValue, String date) {
        Assert.assertEquals(date, datePickerPage.getActualDate());
    }

    @Then("they should see date as {string}")
    public void theyShouldSeeDateAs(String date) {
        Assert.assertEquals(date, datePickerPage.getActualDate());
    }

    @Then("they can see the {string}")
    public void they_can_see_the(String text) {
        switch (text) {
            case "Vienna, Austria" -> Assert.assertEquals(text, toolTipPage.getToolTipTextForImageBasedTab());
            case "Tooltip" -> Assert.assertEquals(text, toolTipPage.heading());
            case "firstname" -> Assert.assertEquals(text, toolTipPage.getToolTipTextForFormBasedTab());
            case "lastname" -> Assert.assertEquals(text, toolTipPage.getToolTipTextFormBasedTab2());
        }
    }
}
