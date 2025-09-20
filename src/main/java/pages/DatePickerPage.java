package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DatePickerPage extends BasePage {


    public DatePickerPage(WebDriver driver) {
        super(driver);
    }

    public void getDateValue(String dateValue) {
        List<WebElement> datesElements = driver.findElements(By.cssSelector("[data-handler ='selectDay']"));
        for (WebElement date : datesElements) {
            if (date.getText().equals(dateValue)) {
                date.click();
            }
        }
    }

    public void getDate(String dateValue) {
        WebElement simpleDateFrame = driver.findElement(By.cssSelector("[src*='datepicker/default.html']"));
        driver.switchTo().frame(simpleDateFrame);
        WebElement datePickerTextBox = driver.findElement(By.cssSelector("#datepicker"));
        datePickerTextBox.click();
        WebElement nextButton = driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e"));
        nextButton.click();
        getDateValue(dateValue);
    }

    public void clickOnDropDownDatePicker(String dateValue, String month, String year) {
        WebElement dropDownDatePickerTab = driver.findElement(By.id("DropDown DatePicker"));
        dropDownDatePickerTab.click();
        WebElement dropDownFrame = driver.findElement(By.cssSelector("[src*='datepicker/dropdown']"));
        driver.switchTo().frame(dropDownFrame);
        WebElement datePickerTextBox = driver.findElement(By.cssSelector("#datepicker"));
        datePickerTextBox.click();
        WebElement monthList = driver.findElement(By.cssSelector("[data-handler ='selectMonth']"));
        Select selectMonth = new Select(monthList);
        selectMonth.selectByValue(month);
        WebElement yearList = driver.findElement(By.cssSelector("[data-handler ='selectYear']"));
        Select listYear = new Select(yearList);
        listYear.selectByValue(year);
        getDateValue(dateValue);
    }

    public String getActualDate() {
        WebElement datePickerTextBox = driver.findElement(By.cssSelector("#datepicker"));
        return datePickerTextBox.getAttribute("value");
    }

    public void IconTriggerTest(String dateValue) {
        WebElement icontrigger = driver.findElement(By.id("Icon Trigger"));
        icontrigger.click();
        WebElement dropDownFrame = driver.findElement(By.cssSelector("[src*='datepicker/icon-trigger.html']"));
        driver.switchTo().frame(dropDownFrame);
        WebElement iconTriggerBox = driver.findElement(By.cssSelector(".ui-datepicker-trigger"));
        iconTriggerBox.click();
        WebElement nextButton = driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e"));
        nextButton.click();
        getDateValue(dateValue);
    }
}
