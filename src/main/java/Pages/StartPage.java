package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class StartPage extends BasePage1 {

    @FindBy(xpath = "//div[@class='a4bIc']")
    private WebElement searchField;

    @FindBy(xpath = "//title")
    private WebElement titleHead;

    public StartPage(WebDriver driver) {
        super(driver);
    }

    public StartPage EnterTheRandomWordOnTheSearchField(String randomWord) {
        searchField.sendKeys(randomWord, Keys.ENTER);
        return this;
    }
    public StartPage GetTextWithTitle(){
        titleHead.getText();
        return  this;
    }
}
