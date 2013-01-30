package org.andidev.webdriverextension.examples.google;

import static org.andidev.webdriverextension.WebDriverAssert.*;
import org.andidev.webdriverextension.WebElement;
import org.andidev.webdriverextension.WebPage;
import org.andidev.webdriverextension.annotation.PageObject;
import org.openqa.selenium.support.FindBy;

@PageObject
public class SearchPage extends WebPage {

    // Web Elements
    @FindBy(css = "[name='q']")
    public WebElement searchQuery;
    @FindBy(css = "#gbqfba")
    public WebElement googleSearch;
    @FindBy(css = "#gbqfbb")
    public WebElement imFeelingLucky;

    @Override
    public void open() {
        getDriver().get("http://www.google.com");
    }

    @Override
    public void assertIsOpen() throws Error {
        assertIsDisplayed(searchQuery);
        assertIsDisplayed(googleSearch);
        assertIsDisplayed(imFeelingLucky);
    }
}