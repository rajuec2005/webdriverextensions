package com.github.webdriverextensions.internal;

import java.util.List;
import com.github.webdriverextensions.WebComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DefaultWebComponentListFactory implements WebComponentListFactory {

    private WebComponentFactory webComponentFactory;

    public DefaultWebComponentListFactory(WebComponentFactory webComponentFactory) {
        this.webComponentFactory = webComponentFactory;
    }

    @Override
    public <T extends WebComponent> List<T> create(Class<T> webComponentClass, List<WebElement> webElements, WebDriver driver) {
        return new WebComponentList<T>(webComponentClass, webElements, webComponentFactory, driver);
    }
}