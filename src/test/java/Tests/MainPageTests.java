package Tests;

import Pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageTests extends BaseTest {


    private StartPage startPage;
    private String RANDOMWORD="word";


    @Test

    public void CheckIfItemAddedToCart() {
        startPage.EnterTheRandomWordOnTheSearchField(RANDOMWORD);
        Assert.assertTrue(startPage.GetTextWithTitle(RANDOMWORD));
    }

}
