package page.objects;


import driver.manager.DriverManager;
import logger.manager.LoggerManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class QuickLinksAnimalPage {

    //elements on page
    @FindBy(xpath = "//div[@id='QuickLinks']//a[1]//img[1]")
    WebElement fishLink;

    public QuickLinksAnimalPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public FishListPage clickOnTheFishLink() {
        fishLink.click();
        LoggerManager.setLoggerInfo("Clicked on the Fish link in Quick Links");
        return new FishListPage();
    }


}
