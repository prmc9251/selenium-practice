package switchwindows;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class TestSwitchWindow extends Utility {
    String baseUrl = "https://www.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void switchWindowExample() {
        //Get the Handle of the window

        //Click on open window tab

        //Get all window handles


        //Switch the focus of the driver to parent window

        // Send text to Name on Parent window

    }

    @After
    public void tearDown() {
//        closeBrowser();
    }

}
