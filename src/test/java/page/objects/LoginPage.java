package page.objects;

import driver.manager.DriverManager;
import logger.manager.LoggerManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class LoginPage {

    //elements on the page
    @FindBy(css = "#Catalog input[name = 'username']")
    WebElement userNameInput;
    @FindBy(css = "#Catalog input[name = 'password']")
    WebElement passwordInput;
    @FindBy(css = "#Catalog input[name = 'signon']")
    WebElement loginButton;
    @FindBy(css = ".messages li")
    WebElement warningMessage;


    public LoginPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public LoginPage typeInToUserNameField(String userName) {
        userNameInput.clear();
        userNameInput.sendKeys(userName);
        LoggerManager.setLoggerInfo("Typed in to user name field {}", userName);
        return this;
    }

    public LoginPage typeInToPasswordField(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password);
        LoggerManager.setLoggerInfo("Typed in to password field {}", password);
        return this;
    }

    public LoginPage clickOnTheLoginButton() {
        loginButton.click();
        LoggerManager.setLoggerInfo("Click on Login button");
        return this;
    }

    public FooterMainPage clickOnTheLoginButtonRedirect() {
        loginButton.click();
        LoggerManager.setLoggerInfo("Click on Login button");
        return new FooterMainPage();
    }

    public String getWarningMessage(){
        WaitForElement.waitUntilElementIsVisible(warningMessage);
        String warningText = warningMessage.getText();
        LoggerManager.setLoggerInfo("Returned warning message was: {} ", warningText);
        return warningText;
    }


}
