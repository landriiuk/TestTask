
package pagefactory.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class BaseTest {

    private WebDriver driver;
    private static final String GOOGLE_URL = "https://www.google.com";


    @BeforeTest
    public void profileSetUp() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
    }

    @BeforeMethod
    public void testsSetUp() {
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

}
