package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class StartPage extends BasePage1 {

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
}
