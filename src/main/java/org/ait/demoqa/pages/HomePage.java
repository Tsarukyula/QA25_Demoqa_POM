package org.ait.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".top-card:nth-child(6)")
    WebElement bookStore;

    public SidePanel getBookStore() {
        clickWithJSExecutor(bookStore,0,300);
        return new SidePanel(driver);
    }


    @FindBy(xpath = "//span[contains(text(),'Alerts')]")
    WebElement alertsLink;

    public AlertsPage getAlerts() {
        // click on Alerts link
        click(alertsLink);
        return new AlertsPage(driver);
    }


    @FindBy(xpath = "//span[@class='text' and text()='Browser Windows']")
    WebElement browserWindowsLink;
    public BrowserWindowsPage getBrowserWindows() {
        // click on BrowserWindowsPage link
        click(browserWindowsLink);
        return new BrowserWindowsPage(driver);
    }


    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    WebElement alertsFrameWindows;

    public SidePanel getAlertsFrameWindows() {
        clickWithJSExecutor(alertsFrameWindows,0,300);
        return new SidePanel(driver);
    }


    @FindBy(css = ".top-card:nth-child(1)")
    WebElement elements;

    public SidePanel getElements() {
        clickWithJSExecutor(elements, 0, 200);
        return new SidePanel(driver);
    }


    @FindBy(css = ".top-card:nth-child(4)")
    WebElement widgets;

    public SidePanel getWidgets() {
        clickWithJSExecutor(widgets, 0, 300);
        return new SidePanel(driver);
    }


    @FindBy(css = ".top-card:nth-child(2)")
    WebElement forms;

    public SidePanel getForms() {
        clickWithJSExecutor(forms, 0, 500);
        return new SidePanel(driver);
    }


    @FindBy(css = ".top-card:nth-child(5)")
    WebElement interactions;

    public SidePanel getInteractions() {
        clickWithJSExecutor(interactions, 0, 200);
        return new SidePanel(driver);
    }
}








