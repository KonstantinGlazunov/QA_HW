package org.ait.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class BrowserWindowsPage extends BasePage{
    public BrowserWindowsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id="tabButton")
    WebElement newTab;
    public BrowserWindowsPage switchToNewTab(int index) {
        click(newTab);
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));
        return this;
    }


    @FindBy(id = "sampleHeading")
    WebElement sampleHeading;
    public  BrowserWindowsPage verifyNewTitle (String text) {
        Assert.assertTrue(isTextPresent(sampleHeading, text));
        return this;
    }

    @FindBy(id="windowButton")
    WebElement newWindowButton;
    public BrowserWindowsPage switchToNewWindows(int index) {
        click(newWindowButton);
        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(index));
        return this;
    }




}
