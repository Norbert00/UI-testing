package tests;


import org.testng.annotations.Test;
import page.objects.WelcomePage;
import test.base.TestBase;

import static org.testng.Assert.assertTrue;

public class RedirectionWelcomePageToLoginPageTest extends TestBase {

    @Test
    public void positiveRedirectionWelcomePageToLoginPageTest() {

        WelcomePage welcomePage = new WelcomePage();
        boolean logoDisplayed = welcomePage
                .clickOnEnterStoreLink()
                .isLogoDisplayed();
        assertTrue(logoDisplayed);

    }

}
