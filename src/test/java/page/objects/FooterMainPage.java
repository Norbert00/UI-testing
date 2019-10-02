package page.objects;

import driver.manager.DriverManager;
import logger.manager.LoggerManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterMainPage {

    //elements on side
    @FindBy(css = "#Banner img" )
    private WebElement bannerDogs;

    public FooterMainPage(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public boolean isBannerDisplayedAfterLogin() {
        boolean isDisplayed = bannerDogs.isDisplayed();
        LoggerManager.setLoggerInfo("Returning status banner after login {} ", isDisplayed);
        return isDisplayed;
    }

}
