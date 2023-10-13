package org.ait.demoqa.tests.alertsFramesWindows;

import org.ait.demoqa.pages.AlertsFrameWindowsPage;
import org.ait.demoqa.pages.AlertsPage;
import org.ait.demoqa.pages.HomePage;
import org.ait.demoqa.pages.SidePanel;
import org.ait.demoqa.tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getAlertsFrameWindows();
        new SidePanel(driver).selectAlerts();
    }

    @Test
    public void acceptAlert() {
        // click Button to see alert
        //click on OK
        //assert text result 'You clicked a button'
        new AlertsPage(driver).clickOnAlertsButton()
                .acceptAlert();
        }


    @Test
    public void accept5SecAlert() {
        // click alert after 5 seconds Button
        //click on OK
        //assert text result 'This alert appeared after 5 seconds'
        new AlertsPage(driver).clickOnAlert5SecButton()
                .accept5SecAlert();
    }


    @Test
    public void acceptConfirmBoxAlert() {
        // click confirm box Button
        //select ok | cancel
        //assert text result 'You selected Ok | You selected Cancel
        new AlertsPage(driver).clickOnConfirmBoxButton()
                .selectConfirmBox("Cancel")
                .verifyConfirmResult("Cancel");
    }


    @Test
    public void sendMessageToAlertTest() {
        // click prompt box appear Button
        //enter 'Hello!'
        //click on OK
        //assert text result 'You entered Hello!'
        new AlertsPage(driver).clickOnPromptButton()
                .enterMessageToAlert("Hello!")
                .acceptAlert()
                .verifyPromptResult("You entered Hello!");
    }
}

