package org.ait.theinternet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href='/javascript_alerts']")
    WebElement alertsLink;

    public AlertsPage getAlerts() {
        click(alertsLink);
        return new AlertsPage(driver);
    }

    @FindBy(xpath = "//a[.='Multiple Windows']")
    WebElement windowsLink;

    public WindowPage getMultipleWindows() {
        click(windowsLink);
        return new WindowPage(driver);
    }

    @FindBy(xpath = "//a[.='Form Authentication']")
    WebElement formLink;

    public JSExecutor getFormAuthantication() {
        click(formLink);
        return new JSExecutor(driver);
    }

    @FindBy(xpath = "//a[.='Broken Images']")
    WebElement brokenImagesLink;

    public BrokenImagesPage getBrokenImagesPage() {
        click(brokenImagesLink);
        return new BrokenImagesPage(driver);
    }
}
