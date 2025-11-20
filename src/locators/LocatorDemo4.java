package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo4 extends BaseTest {

    String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemo4(){
        //Relative xpath
        //tagName[@attribute='value']

        // xpath with or
        //tagName[@attribute='value' or @attribute = 'value']

        // xpath with and
        //tagName[@attribute='value' and @attribute = 'value']

        // xpath with starts-with()
        //tagName[starts-with(@attribute, 'value')]

        // xpath with contains()
        //tagName[contains(@attribute, 'value')]

        //xpath with text()
        //tagName[text() = 'value']

        // xpath with chained
        //tagName[@attribute = 'value']//tagName[@attribute = 'value']

    }

    @After
    public void tearDown(){
//        closeBrowser();
    }


}
