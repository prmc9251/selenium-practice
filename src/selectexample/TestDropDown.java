package selectexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class TestDropDown extends Utility {

    String baseUrl = "http://way2automation.com/way2auto_jquery/index.php";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void dropDownExample() {

        // Create the object of Select class

        // Select by visible text

        // Select by value

        // Select by Index



        // Get All the options

    }


    @After
    public void tearDown() {
//        closeBrowser();
    }
}
