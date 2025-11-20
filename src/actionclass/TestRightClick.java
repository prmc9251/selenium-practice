package actionclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class TestRightClick extends Utility {
    String baseUrl = "http://swisnl.github.io/jQuery-contextMenu/demo.html";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void rightClickExample() {

        //Find the Button as a target element

        //Perform the Right click on the target element

        // Click on Copy Option
    }

    @After
    public void tearDown() {
//        closeBrowser();
    }
}
