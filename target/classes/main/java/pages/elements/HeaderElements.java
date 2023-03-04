package pages.elements;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.CommonActionsWithElements;

public class HeaderElements extends CommonActionsWithElements {

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


    public void  isLinkShippinDisaplyed (){
      Assert.assertTrue( getElementName(linkShipping) + " is not disaplyed ", isElementDisplayed(linkShipping));
       ;
    }

    public boolean isLinkTrackingDisaplyed (){
        return isElementDisplayed(linkTracking);
    }

    public boolean isLinkBusinessSolutionsDisaplyed (){
        return isElementDisplayed(linkBusinessSolutions);
    }

    public boolean isLinkSupportDisaplyed (){
        return isElementDisplayed(linkSupport);
    }

    public boolean isLinkAboutUPSDisaplyed (){
        return isElementDisplayed(linkAboutUPS);
    }

    public boolean isLinkLocationDisaplyed (){
        return isElementDisplayed(linkLocation);
    }

    public boolean isLinkLanuagesDisaplyed (){
        return isElementDisplayed(linkLocation);
    }
//
//    public WebDriver areHeaderElelementsDisaplyed (){
//        isLinkShippinDisaplyed();
//        isLinkTrackingDisaplyed();
//        isLinkBusinessSolutionsDisaplyed();
//        isLinkSupportDisaplyed();
//        isLinkLanuagesDisaplyed();
//        isLinkAboutUPSDisaplyed();
//        isLinkLocationDisaplyed();
//
//        return ;
//    }
}
