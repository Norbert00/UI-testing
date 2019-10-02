package page.objects;

import driver.manager.DriverManager;
import logger.manager.LoggerManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AngelFishPage {

    //elements on page
    @FindBy(css = "a[href='/jpetstore/actions/Cart.action?addItemToCart=&workingItemId=EST-2']")
    WebElement addToCartSmallAngelFish;

    public AngelFishPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public ShoppingCartPage clickOnAddToCartSmallAngelFish() {
        addToCartSmallAngelFish.click();
        LoggerManager.setLoggerInfo("Clicked on add to cart Small Angelfish");
        return new ShoppingCartPage();
    }

}
