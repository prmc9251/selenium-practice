package junit;

import org.junit.*;

/**
 * Created by Jay Vaghani
 */
public class JUnitIntroduction {

    @BeforeClass
    public static void connectWithDB() {
        System.out.println("DB connection");
    }

    @AfterClass
    public static void closedDBConnection() {
        System.out.println("Close DB connection");
    }

    @Before
    public void openBrowser(){
        System.out.println("Opining Browser");
    }

    @After
    public void closeBrowser(){
        System.out.println("Closing Browser");
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        System.out.println("Navigate to Login page");
        String expectedText = "Welcome, Please Sign In!";
        String actualText = "Welcome, Please Sign In!";
        Assert.assertEquals("Not navigate to login page", expectedText, actualText);
    }

    @Test
    public void test(){
        System.out.println("This is test method");
    }

}
