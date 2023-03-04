package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.elements.HeaderElements;

public class HomePage extends ParentPage {
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }
    private HeaderElements headerElements = new HeaderElements(webDriver);
    public HeaderElements getHeaderElements() {return headerElements;};

    @FindBy(xpath = ".//a[@class='nav-link active']")
    private WebElement linkTrack;
    @FindBy(xpath = ".//a[@class='nav-link ups-analytics ' and @href = 'https://wwwapps.ups.com/calTimeCost?loc=en_CA']")
    private WebElement linkQuote;
    @FindBy(xpath = ".//a[@class='nav-link ups-analytics ' and @href = 'https://www.ups.com/ship?loc=en_CA']")
    private WebElement linkShip;
    @FindBy(xpath = ".//a[@class='nav-link ups-analytics ' and @href = '/ca/en/business-solutions/ups-billing.page']")
    private WebElement linkBilling;
    @FindBy(xpath = ".//input[@id = 'ups-track--qs']")
    private WebElement inputTrackingNumber;
    @FindBy(xpath = ".//button[@id = 'stApp_widgetTrkNumBtn']")
    private WebElement buttonTrack;
    @FindBy(xpath = ".//span[@id = 'stApp_widgetHelpLbl']")
    private WebElement buttonHelp;
    @FindBy(xpath = ".//button[@id= 'ups-search-toggle' ]")
    private WebElement buttonSearch;
    @FindBy(xpath = ".//span[@class= 'icon ups-icon-user' ]")
    private WebElement spanLoginSignup;
    @FindBy(xpath = ".//a[@class = 'widget-footer-link ups-link']")
    private WebElement linkGetHelp;



    public HomePage openHomePage() {

        try {
            webDriver.get("https://www.ups.com/");
            clickOnElement(".//*[text() = 'Canada - English']");
            logger.info("Home Page was opened");
        } catch (Exception e) {
            logger.error("Can not open Home Page " + e);
            Assert.fail("Can not open Home Page " + e);
        }
        return this;
    }





}
