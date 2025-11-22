package utilities;

import browsertesting.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Jay Vaghani
 */
public class Utility extends BaseTest {

    /**
     * This method will click on element
     */
    public void clickOnElement(By by) {
        WebElement element = driver.findElement(by);
        element.click();
    }

    public void clickOnElement(WebElement element) {
        element.click();
    }

    /**
     * This method will get text from the element
     */
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public String getTextFromElement(WebElement element) {
        return element.getText();
    }


    /**
     * This method will send text to element
     */
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public void sendTextToElement(WebElement element, String text) {
        element.sendKeys(text);
    }

//***************************** Alert Methods **************************************************

    /**
     * Switch to Alert and return alert object
     */
    public Alert switchToAlert() {
        return driver.switchTo().alert();
    }

    //acceptAlert()
    //dismissAlert()
    //getTextFromAlert()
    //sendTextToAlert()

    //*************************** Select Class Methods ***********************************************


    /**
     * Select drop down by value
     */
    public void selectByValueFromDropDown(By by, String value){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    //selectByIndexFromDropDown(By by, int index)
    //selectByVisibleTextFromDropDown(By by, String text)
    //selectByContainsTextFromDropDown(By by, String text)

//****************************** Actions Class Methods *************************************************
    // mouseHoverToElement(By by);
    // mouseHoverToElementAndClick(By by);

}