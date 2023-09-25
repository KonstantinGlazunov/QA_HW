package org.ait.demoqa.tests;

import org.ait.demoqa.pages.BrowserWindowsPage;
import org.ait.demoqa.pages.HomePage;
import org.ait.demoqa.pages.SidePanel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class BrowserWindowsTests extends TestBase{
    @BeforeMethod
    public void preconditions() {
        new HomePage(driver).getAlertsWindow();
        new SidePanel(driver).selectBrowserWindows();
    }

    @Test
public void newTabTest(){
        new BrowserWindowsPage(driver).switchToNewTab(1)
                .verifyNewTitle("This is a sample page");
}

@Test
    public void newWindowtest(){
    new BrowserWindowsPage(driver).switchToNewWindows(1)
            .verifyNewTitle("This is a sample page");
}

}
