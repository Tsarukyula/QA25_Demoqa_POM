package org.ait.demoqa.tests.alertsFramesWindows;

import org.ait.demoqa.pages.FramesPage;
import org.ait.demoqa.pages.HomePage;
import org.ait.demoqa.pages.NestedFramesPage;
import org.ait.demoqa.pages.SidePanel;
import org.ait.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IframesTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getAlertsFrameWindows();
        new SidePanel(driver).selectFrames();
    }

    @Test
    public void iframesTest() {
        new FramesPage(driver).returnListOfFrames().switchToIframeByIndex(2);
    }


    @Test
    public void switchToIframeByIDTest(){
        //new SidePanel(driver).selectFrames();
        new FramesPage(driver).switchToIframeByID();
    }


    @Test
    public void handleNestedIframeTest() {
        new SidePanel(driver).selectNestedFrames();
        new NestedFramesPage(driver).handleNestedIframes();
    }
}
