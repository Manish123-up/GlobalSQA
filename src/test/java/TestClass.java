import pages.DatePickerPage;
import steps.Hook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class TestClass {

    private static WebDriver driver;
    public static void main(String[] args) {

       driver= Hook.getDriver();
        WebElement element = driver.findElement(By.cssSelector("#menu-item-2822>a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        WebElement demoSiteLink = driver.findElement(By.cssSelector("#menu-item-2823>a"));
        actions.moveToElement(demoSiteLink);
        WebElement datePicker = driver.findElement(By.cssSelector("#menu-item-2827>a"));
        actions.moveToElement(datePicker).click().build().perform();
        DatePickerPage datePickerPage = new DatePickerPage(driver);
       // datePickerPage.clickOnDropDownDatePicker();


       /* WebElement pageHeading = driver.findElement(By.cssSelector(".page_heading"));
        System.out.println(pageHeading.getText());
        Assert.assertEquals("DatePicker", pageHeading.getText());


        WebElement simpleDateFrame = driver.findElement(By.cssSelector("[src*='datepicker/default.html']"));
        driver.switchTo().frame(simpleDateFrame);
        WebElement datePickerTextBox = driver.findElement(By.cssSelector("#datepicker"));
        datePickerTextBox.click();
        WebElement nextButton = driver.findElement(By.cssSelector("[class ='ui-icon ui-icon-circle-triangle-e']"));
        nextButton.click();
        List<WebElement> datesElements = driver.findElements(By.cssSelector("[data-handler ='selectDay']"));
        for(WebElement date:datesElements){
           if(date.getText().equals("20")){
               date.click();
           }
        }



        System.out.println(datePickerTextBox.getAttribute("value"));;
        Assert.assertEquals("10/20/2025",datePickerTextBox.getAttribute("value"));

       // driver.close();*/

    }
}
