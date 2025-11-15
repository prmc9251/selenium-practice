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
public class LocatorDemo1 extends BaseTest {

    String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemo1(){
        // Id Locator
        WebElement searchBox = driver.findElement(By.id("small-searchterms"));
        searchBox.sendKeys("Mobile");

        // Name Locator
        WebElement newsLetterBox = driver.findElement(By.name("NewsletterEmail"));
        newsLetterBox.sendKeys("PrimeTesting");

    }

    @After
    public void tearDown(){
//        closeBrowser();
    }

}
