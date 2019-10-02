package page.objects;

import driver.manager.DriverManager;
import logger.manager.LoggerManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

    //elements on the landing page
    @FindBy(css = "#Content a")
    private WebElement enterStoreLink;



    public WelcomePage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public TopMenuPage clickOnEnterStoreLink() {
        enterStoreLink.click();
        LoggerManager.setLoggerInfo("Clicked on Enter Store Link");
        return new TopMenuPage();
    }

    public QuickLinksAnimalPage clickOnEtnerStoreLinkRedirect() {
        enterStoreLink.click();
        LoggerManager.setLoggerInfo("Clicked on Enter Store Link");
        return new QuickLinksAnimalPage();
    }

}
