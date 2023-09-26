package org.ait.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class BrowserWindowsPage extends BasePage{
    public BrowserWindowsPage(WebDriver driver) {
        super(driver);
    }

    ///////////////////////////////////////////////////////////////////////////////

    @FindBy(css = "#tabButton")
    WebElement tabButton;

    public BrowserWindowsPage clickOnNewTabButton() {
        click(tabButton);
        return this;
    }

    ///////////////////////////////////////////////////////////////////////////////

    @FindBy(css = "#windowButton")
    WebElement windowButton;

    public BrowserWindowsPage clickOnNewWindowButton() {
        click(windowButton);
        return this;
    }

}
