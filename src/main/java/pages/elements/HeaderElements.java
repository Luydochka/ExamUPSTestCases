package pages.elements;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.CommonActionsWithElements;

public class HeaderElements extends CommonActionsWithElements {
    Logger logger = Logger.getLogger(getClass());

    public HeaderElements(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = ".//a[@id='mainNavDropdown1']")
    private WebElement linkShipping;
    @FindBy(xpath = ".//a[@id='mainNavDropdown2']")
    private WebElement linkTracking;
    @FindBy (xpath = ".//a[@id='mainNavDropdown3']")
    private WebElement linkBusinessSolutions;
    @FindBy (xpath = ".//a[@id='mainNavDropdown4']")
    private WebElement linkSupport;
    @FindBy (xpath = ".//a[@class= 'OneLinkKeepLinks ups-link']")
    private WebElement linkAboutUPS;
    @FindBy (xpath = ".//a[@class= 'ups-link' and @href = 'https://www.ups.com/dropoff?loc=en_CA']")
    private WebElement linkLocation;
    @FindBy (xpath = ".//a[@class= 'ups-link dropdown-toggle' ]")
    private WebElement linkLanuages;


    public HeaderElements  isLinkShippinDisaplyed (){
      Assert.assertTrue( getElementName(linkShipping) + " is not disaplyed ", isElementDisplayed(linkShipping));
       return this;
    }

    public HeaderElements  isLinkTrackingDisaplyed (){
        Assert.assertTrue( getElementName(linkTracking) + " is not disaplyed ", isElementDisplayed(linkTracking));
        return this;
    }

    public HeaderElements  isLinkBusinessSolutionsDisaplyed (){
        Assert.assertTrue( getElementName(linkBusinessSolutions) + " is not disaplyed ", isElementDisplayed(linkBusinessSolutions));
        return this;
    }

    public HeaderElements  isLinkSupportDisaplyed (){
        Assert.assertTrue( getElementName(linkSupport) + " is not disaplyed ", isElementDisplayed(linkSupport));
        return this;
    }

    public HeaderElements  isLinkAboutUPSDisaplyed (){
        Assert.assertTrue( getElementName(linkAboutUPS) + " is not disaplyed ", isElementDisplayed(linkAboutUPS));
        return this;
    }

    public HeaderElements  isLinkLocationDisaplyed (){
        Assert.assertTrue( getElementName(linkLocation) + " is not disaplyed ", isElementDisplayed(linkLocation));
        return this;
    }

    public HeaderElements  isLinkLanuagesDisaplyed (){
        Assert.assertTrue( getElementName(linkLanuages) + " is not disaplyed ", isElementDisplayed(linkLanuages));
        return this;
    }



    public HeaderElements areHeaderElelementsDisaplyed (){
        isLinkShippinDisaplyed();
        isLinkTrackingDisaplyed();
        isLinkBusinessSolutionsDisaplyed();
        isLinkSupportDisaplyed();
        isLinkLanuagesDisaplyed();
        isLinkAboutUPSDisaplyed();
        isLinkLocationDisaplyed();
        logger.info("All Header Elements are displayed");
        return this;
    }
}
