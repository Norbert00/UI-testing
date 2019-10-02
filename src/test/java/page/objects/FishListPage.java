package page.objects;

import driver.manager.DriverManager;
import logger.manager.LoggerManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FishListPage {

    //elements on side
    @FindBy(css = "a[href='/jpetstore/actions/Catalog.action?viewProduct=&productId=FI-SW-01']")
    WebElement angelFish;

    public FishListPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public AngelFishPage clickOnTheAngelFish() {
        angelFish.click();
        LoggerManager.setLoggerInfo("Clicked on the Angelfish");
        return new AngelFishPage();
    }

}
