package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.DatePickerPage;
import pages.HomePage;

import static constants.Constants.HOME_PAGE;

public class StepDefinition {
    private WebDriver driver ;

    //private WebDriver driver;


    @Given("user is on {string}")
    public void user_is_on(String page) {
        switch (page.toLowerCase()) {
            case HOME_PAGE -> {
                driver = Hook.getDriver();
            }
        }//
    }

   /* @Given("user is on {string}")
    public void user_is_on(String page) {
        switch (page.toLowerCase()) {
            case HOME_PAGE -> {
                driver = Hook.getDriver();
            }
        }// now it's guaranteed that Hook.setUp() ran
    }*/

    @When("they reach to the DatePicker page")
    public void they_reach_to_the_date_picker_page() {
        new HomePage(driver).clickOnDatePicker();
    }

    @Then("they can see the {string}")
    public void they_can_see_the(String text)  {
        Assert.assertEquals(text, new DatePickerPage(driver).getHeading());
    }

    @Then("they can see the provided {string} date value in the {string} date")
    public void they_can_see_the_provided_date_value_in_the_date(String dateValue, String date) {
    Assert.assertEquals(date,new DatePickerPage(driver).getDate(dateValue));
    }
}
