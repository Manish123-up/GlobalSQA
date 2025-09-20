package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    public String getToolTipTextForImageBasedTab() {
        WebElement toolTipFrame1 = driver.findElement(By.cssSelector("[src*='tooltip/custom-content']"));
        driver.switchTo().frame(toolTipFrame1);
        Actions actions = new Actions(driver);
        List<WebElement> citiesNames = driver.findElements(By.cssSelector("[class='ui-widget-header ui-corner-all']>h3>a"));
        actions.moveToElement(citiesNames.get(0)).perform();
        List<WebElement> city = driver.findElements(By.cssSelector("[class='ui-tooltip-content']>img"));
        return city.get(0).getAttribute("alt");
    }

    public void clickOnAToolTipTab(String tabName) {
        WebElement element = driver.findElement(By.cssSelector("[id*='" + tabName + "']"));
        element.click();
        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
    }

    public String getToolTipTextForFormBasedTab() {
        WebElement toolTipFrame2 = driver.findElement(By.cssSelector("[src*='tooltip/forms.html']"));
        driver.switchTo().frame(toolTipFrame2);
        Actions actions = new Actions(driver);
        WebElement firstName = driver.findElement(By.cssSelector("[id='firstname']"));
        actions.moveToElement(firstName).perform();
        WebElement firstNameToolTip = driver.findElement(By.cssSelector(".ui-tooltip-content"));
        return firstNameToolTip.getText();
    }

    public String getToolTipTextFormBasedTab2() {
        WebElement toolTipFrame2 = driver.findElement(By.cssSelector("[src*='tooltip/forms.html']"));
        driver.switchTo().frame(toolTipFrame2);
        Actions actions = new Actions(driver);
        WebElement lastName = driver.findElement(By.cssSelector("[id='lastname']"));
        actions.moveToElement(lastName).perform();
        WebElement firstNameToolTip = driver.findElement(By.cssSelector(".ui-tooltip-content"));
        return firstNameToolTip.getText();
    }

    public String getToolTipTextFormBasedTab3() {
        WebElement toolTipFrame3 = driver.findElement(By.cssSelector("[src*='tooltip/forms.html']"));
        driver.switchTo().frame(toolTipFrame3);
        Actions actions = new Actions(driver);
        WebElement addressName = driver.findElement(By.cssSelector("[id='address']"));
        actions.moveToElement(addressName).perform();
        WebElement addressNameToolTip = driver.findElement(By.cssSelector(".ui-tooltip-content"));
        return addressNameToolTip.getText();
    }

    public String getToolTipTextForVideoBased() {
        WebElement toolTipFrame = driver.findElement(By.cssSelector("[src*='tooltip/video-player.html']"));
        driver.switchTo().frame(toolTipFrame);
        Actions actions = new Actions(driver);
        WebElement likeIt = driver.findElement(By.cssSelector("[title='I like this']"));
        actions.moveToElement(likeIt).perform();
        WebElement list = driver.findElement(By.cssSelector("[class='ui-tooltip-content']"));
        return list.getText();
    }

    public String getToolTipTextForVideoBased2() {
        WebElement toolTipFrame = driver.findElement(By.cssSelector("[src*='tooltip/video-player.html']"));
        driver.switchTo().frame(toolTipFrame);
        Actions actions = new Actions(driver);
        WebElement likeIt = driver.findElement(By.cssSelector("[title='Add to Watch Later']"));
        actions.moveToElement(likeIt).perform();
        WebElement list = driver.findElement(By.cssSelector("[class='ui-tooltip-content']"));
        return list.getText();
    }

    public String getToolTipTextForVideoBased3() {
        WebElement toolTipFrame = driver.findElement(By.cssSelector("[src*='tooltip/video-player.html']"));
        driver.switchTo().frame(toolTipFrame);
        Actions actions = new Actions(driver);
        WebElement likeIt = driver.findElement(By.cssSelector("[title='Share this video']"));
        actions.moveToElement(likeIt).perform();
        WebElement list = driver.findElement(By.cssSelector("[class='ui-tooltip-content']"));
        return list.getText();
    }
}
