package tests;

import driver.manager.DriverUtils;
import org.testng.annotations.Test;
import page.objects.LoginPage;
import test.base.TestBase;

import static log.helper.LogHelper.getINVALIDPASSWORD;
import static log.helper.LogHelper.getINVALIDUSERNAME;
import static navigation.ApplicationURLs.LOGIN_URL;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FailedLoginTest extends TestBase {
    @Test
    public void asUserTryToLogInWithIncorrectLoginAndPassword() {

        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        String isWarningMassageDisplayed = loginPage
                .typeInToUserNameField(getINVALIDUSERNAME())
                .typeInToPasswordField(getINVALIDPASSWORD())
                .clickOnTheLoginButton()
                .getWarningMessage();
        assertEquals(isWarningMassageDisplayed, "Invalid username or password. Signon failed.");






    }

}
