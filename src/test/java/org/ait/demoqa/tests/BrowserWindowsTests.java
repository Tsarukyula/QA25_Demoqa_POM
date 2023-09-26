package org.ait.demoqa.tests;

import org.ait.demoqa.pages.AlertsPage;
import org.ait.demoqa.pages.BrowserWindowsPage;
import org.ait.demoqa.pages.HomePage;
import org.ait.demoqa.pages.SidePanel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserWindowsTests extends TestBase{

    @BeforeMethod
    public void precondition() {
            new HomePage(driver).getAlertsFrameWindows();
            new SidePanel(driver).selectBrowserWindows();
    }


    @Test
    public void acceptNewTab(){
        // click New Tab Button
        // result 'This is a sample page'
        new BrowserWindowsPage(driver).clickOnNewTabButton();
    }


    @Test
    public void acceptNewWindow(){
        // click New Window Button
        new BrowserWindowsPage(driver).clickOnNewWindowButton();
    }

}
