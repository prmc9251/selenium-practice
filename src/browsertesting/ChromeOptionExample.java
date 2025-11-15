package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

/**
 * Created by Jay Vaghani
 */
public class ChromeOptionExample {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito"); // Open browser in private/incognito window
        options.addArguments("--headless"); // Headless browser

        String baseUrl = "https://demowebshop.tricentis.com/";
        // Browser Setup
        //Launch the Browser
        WebDriver driver = new ChromeDriver(options);
        // Open the URL into browser
        driver.get(baseUrl);
        // Maximise the browser window
        driver.manage().window().maximize();
        //We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Get the title of the page
        String title = driver.getTitle();
        System.out.println("The title of the page " + title);


        //Close the browser
//        driver.quit();
    }
}
