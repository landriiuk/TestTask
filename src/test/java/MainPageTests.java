
import Pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class MainPageTests extends pagefactory.tests.BaseTest {


    private StartPage startPage;
    private String RANDOMWORD="word";


    @Test

    public void CheckIfItemAddedToCart() {
        startPage.EnterTheRandomWordOnTheSearchField("SomeText");
        Assert.assertEquals(startPage.GetTextWithTitle(),"слово");
    }

}
