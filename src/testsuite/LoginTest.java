package testsuite;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Jay Vaghani
 */
public class LoginTest extends BaseTest {
    String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        //Find the login link element and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        String expectedText = "Welcome, Please Sign In!";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals("Not redirected to login page", expectedText, actualText);
    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials(){
        //Find the login link element and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //Find the email field and type email address to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("primetest123@gmail.com");
        //Find the password field and type password into password field
        driver.findElement(By.name("Password")).sendKeys("Pass123");
        //Find login button element and click on it
        WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Log in']"));
        loginBtn.click();
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualErrorMessage = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getText();
        Assert.assertEquals("Error message not displayed", expectedErrorMessage, actualErrorMessage);
    }

    @After
    public void tearDown() {
//        closeBrowser();
    }

}
