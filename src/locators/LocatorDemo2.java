package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo2 extends BaseTest {

    String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemo2(){
        // Link Text Locator
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //Partial Link Text
        driver.findElement(By.partialLinkText("Regi")).click();
    }

    @After
    public void tearDown(){
//        closeBrowser();
    }

}
