package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.elements.HeaderElements;

public class HomePage extends ParentPage {
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }


    private HeaderElements headerElements = new HeaderElements(webDriver);
    public HeaderElements getHeaderElements() {return headerElements;};


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
