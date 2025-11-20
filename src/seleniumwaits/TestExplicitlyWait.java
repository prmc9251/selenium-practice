package seleniumwaits;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class TestExplicitlyWait extends Utility {
    String baseUrl = "https://www.hyrtutorials.com/p/waits-demo.html";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void explicitlyWaitExample() {
        // Click on consent Button

        // Click on AddTextBox1 Button


        // Send text to TextBox1 field


        // Use Explicit wait


    }


    @After
    public void tearDown() {
//        closeBrowser();
    }

}
