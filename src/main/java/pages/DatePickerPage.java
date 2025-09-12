package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DatePickerPage extends BasePage {

    public DatePickerPage(WebDriver driver) {
        super(driver);
    }

    public String getHeading() {
        WebElement pageHeading = driver.findElement(By.cssSelector(".page_heading"));
        return pageHeading.getText();
    }

    public String getDate(String dateValue) {
        WebElement simpleDateFrame = driver.findElement(By.cssSelector("[src*='datepicker/default.html']"));
        driver.switchTo().frame(simpleDateFrame);
        WebElement datePickerTextBox = driver.findElement(By.cssSelector("#datepicker"));
        datePickerTextBox.click();
        WebElement nextButton = driver.findElement(By.cssSelector("[class ='ui-icon ui-icon-circle-triangle-e']"));
        nextButton.click();
        List<WebElement> datesElements = driver.findElements(By.cssSelector("[data-handler ='selectDay']"));
        for (WebElement date : datesElements) {
            if (date.getText().equals(dateValue)) {
                date.click();
            }
        }
        try{
            Thread.sleep(3000);
        }catch (Exception e){

        }
        return datePickerTextBox.getAttribute("value");
    }
}
