package Tests;

import Pages.StartPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class MainPageTests extends BaseTest {

    private String RANDOMWORD="word";

    @Test
    public void checkIfItemAddedToCart() {

        StartPage startPage = new StartPage(driver);
        startPage.enterTheRandomWordOnTheSearchField(RANDOMWORD);
        //String sometext=startPage.getTextWithTitle();
        String pageTitle=driver.getTitle();
        Assert.assertTrue(pageTitle.contains(RANDOMWORD));
    }

}
