package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;


public class StartPage extends BasePage {
    WebDriver driver;
    @FindBy(xpath ="//input[@class='gLFyf gsfi']")
    private WebElement searchField;

    @FindBy(xpath = "//title")
    private WebElement titleHead;

    public StartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public StartPage enterTheRandomWordOnTheSearchField(String randomWord) {
        implicitWait(10);
        searchField.sendKeys(randomWord);
        searchField.submit();

        return this;
    }
    public StartPage someMethod(){
        ArrayList<Integer> some=new ArrayList<>();
        for (int a:some
             ) {

            System.out.println(some);
        }
        WebElement element=driver.findElement(By.xpath(""));
        element.click();
        element.getText();
        return  this;


    }
}
