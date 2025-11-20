package javascriptexecutor;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class JavaScriptExecutorTest extends Utility {
    String baseUrl = "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void executeJavaScriptFunction() throws InterruptedException {
        //Accept the choice

        //Switch to the frame

        //Define the JavaScriptExecutor object reference

        //Execute the function (On Click Function)

        //Execute the script (How to Highlight the element)

    }

    @After
    public void tearDown() {
//        closeBrowser();
    }
}
