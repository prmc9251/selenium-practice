package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo3 extends BaseTest {

    String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemo3(){
        // Class Name Locator ----> To find multiple elements


        // Tag Name Locator -----> To find multiple elements

    }

    @After
    public void tearDown(){
        closeBrowser();
    }


}
