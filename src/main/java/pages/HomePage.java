package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnDatePicker() {
        WebElement element = driver.findElement(By.cssSelector("#menu-item-2822>a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        WebElement demoSiteLink = driver.findElement(By.cssSelector("#menu-item-2823>a"));
        actions.moveToElement(demoSiteLink);
        WebElement datePicker = driver.findElement(By.cssSelector("#menu-item-2827>a"));
        actions.moveToElement(datePicker).click().build().perform();
    }
}
