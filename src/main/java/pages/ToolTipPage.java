package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ToolTipPage extends BasePage {


    public ToolTipPage(WebDriver driver) {
        super(driver);
    }

    public String heading() {
        WebElement heading = driver.findElement(By.cssSelector("[class='page_heading']"));
        return heading.getText();
    }

    public String getToolTipText() {
        WebElement toolTipFrame1 = driver.findElement(By.cssSelector("[src*='tooltip/custom-content']"));
        driver.switchTo().frame(toolTipFrame1);
        Actions actions = new Actions(driver);
        List<WebElement> citiesNames = driver.findElements(By.cssSelector("[class='ui-widget-header ui-corner-all']>h3>a"));
        actions.moveToElement(citiesNames.get(0)).perform();
        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
        List<WebElement> city = driver.findElements(By.cssSelector("[class='ui-tooltip-content']>img"));
        return city.get(0).getAttribute("alt");
    }
}
