package page.objects;

import driver.manager.DriverManager;
import logger.manager.LoggerManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;



public class TopMenuPage {

    //elements on the page
    @FindBy(css = "#MenuContent a[href*='signonForm']")
    WebElement signInLink;

    @FindBy(id = "Logo")
    private WebElement JPetStoreLogo;

    public TopMenuPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public LoginPage clickOnSignInLink() {
        signInLink.click();
        LoggerManager.setLoggerInfo("Clicked to Sign in link");
        return new LoginPage();
    }

    public boolean isLogoDisplayed() {
        WaitForElement.waitUntilElementIsVisible(JPetStoreLogo);
        boolean elementDisplayed = JPetStoreLogo.isDisplayed();
        return elementDisplayed;
    }
}
