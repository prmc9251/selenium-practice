package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class LoginTest extends Utility {
    String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    public void clickOnElement(WebElement element){
        element.click();
    }



    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        //Find the login link element and click on login link
       /* WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();*/
        clickOnElement(By.linkText("Log in"));
        String expectedText = "Welcome, Please Sign In!";
//        WebElement actualTextElement = driver.findElement(By.xpath("//h1"));
        String actualText = getTextFromElement(By.xpath("//h1"));
        Assert.assertEquals("Not redirected to login page", expectedText, actualText);
    }


    @Test
    public void verifyErrorMessageWithInvalidCredentials(){
        //Find the login link element and click on login link
        clickOnElement(By.linkText("Log in"));
        //Find the email field and type email address to email field
        /*WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("primetest123@gmail.com");*/
        sendTextToElement(By.id("Email"), "primetest123@gmail.com");
        //Find the password field and type password into password field
//        driver.findElement(By.name("Password")).sendKeys("Pass123");
        sendTextToElement(By.name("Password"), "Pass123");
        //Find login button element and click on it
        /*WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Log in']"));
        loginBtn.click();*/
        clickOnElement(By.xpath("//input[@value='Log in']"));
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
//        String actualErrorMessage = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getText();
        String actualErrorMessage = getTextFromElement(By.xpath("//div[@class='validation-summary-errors']"));
        Assert.assertEquals("Error message not displayed", expectedErrorMessage, actualErrorMessage);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
