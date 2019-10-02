package page.objects;

import driver.manager.DriverManager;
import logger.manager.LoggerManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

    //elements on side
    @FindBy(linkText = "Proceed to Checkout")
    WebElement proceedToCheckoutButton;


    public ShoppingCartPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public LoginPage clickOnProceedToCheckoutButton() {
        proceedToCheckoutButton.click();
        LoggerManager.setLoggerInfo("Clicked on the Proceed to Checkout");
        return new LoginPage();
    }

}
