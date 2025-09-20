package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.DatePickerPage;
import pages.HomePage;

import static constants.Constants.HOME_PAGE;

public class StepDefinition {


    private WebDriver driver;
    private DatePickerPage datePickerPage;

    @Given("user is on {string}")
    public void user_is_on(String page) {
        switch (page.toLowerCase()) {
            case HOME_PAGE -> {
                driver = Hook.getDriver();
                datePickerPage = new DatePickerPage(driver);
            }
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

    @Then("they can see the provided {string} date value in the {string} date")
    public void they_can_see_the_provided_date_value_in_the_date(String dateValue, String date) {
        Assert.assertEquals(date, datePickerPage.getActualDate());
    }

    @Then("they should see date as {string}")
    public void theyShouldSeeDateAs(String date) {
        Assert.assertEquals(date, datePickerPage.getActualDate());
    }


    @And("they provide {string} date for IconTrigger")
    public void theyProvideDateForIconTrigger(String dateValue) {
        datePickerPage.IconTriggerTest(dateValue);
    }
}
