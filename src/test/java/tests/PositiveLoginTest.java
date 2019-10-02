package tests;

import driver.manager.DriverUtils;
import org.testng.annotations.Test;
import page.objects.LoginPage;
import test.base.TestBase;

import static log.helper.LogHelper.getPASSWORD;
import static log.helper.LogHelper.getUSERNAME;
import static navigation.ApplicationURLs.LOGIN_URL;
import static org.testng.Assert.assertTrue;

public class PositiveLoginTest extends TestBase {

    @Test
    public void asUserTryToLogInWithCorrectLoginAndPassword() {

        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        boolean isBannerAfterLoginDisplayed = loginPage
                .typeInToUserNameField(getUSERNAME())
                .typeInToPasswordField(getPASSWORD())
                .clickOnTheLoginButtonRedirect()
                .isBannerDisplayedAfterLogin();
        assertTrue(isBannerAfterLoginDisplayed);


    }
}
