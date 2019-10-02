package tests;

import org.testng.annotations.Test;
import page.objects.*;
import test.base.TestBase;

import static org.testng.AssertJUnit.assertEquals;

public class ShoppingCartTest extends TestBase {

    @Test
    public void asNotLoggedInUserIShallNotProceedToCheckout() {

        WelcomePage landingPage = new WelcomePage();
        String warningMessage = landingPage
                .clickOnEtnerStoreLinkRedirect()
                .clickOnTheFishLink()
                .clickOnTheAngelFish()
                .clickOnAddToCartSmallAngelFish()
                .clickOnProceedToCheckoutButton()
                .getWarningMessage();
        assertEquals(warningMessage, "You must sign on before attempting to check out. Please sign on and try checking out again.");

    }
}
