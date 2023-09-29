package org.ait.theinternet.pages;

import org.ait.theinternet.pages.frames_sliders.HorizontalSliderPage;
import org.ait.theinternet.pages.frames_sliders.IFramesPage;
import org.ait.theinternet.pages.frames_sliders.NestedFramesPage;
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

    @FindBy(xpath = "//a[.='Frames']")
    WebElement frames;
    @FindBy(xpath = "//a[.='Nested Frames']")
    WebElement nestedFrames;
    @FindBy(xpath = "//a[.='iFrame']")
    WebElement iFrames;

    public NestedFramesPage getNestedFramesPage() {
        click(frames);
        click(nestedFrames);
        return new NestedFramesPage(driver);
    }

    public IFramesPage getIFramesPage() {
        click(frames);
        click(iFrames);
        return new IFramesPage(driver);
    }


    @FindBy(xpath = "//a[.='Horizontal Slider']")
    WebElement horizontalSlider;

    public HorizontalSliderPage getHorizontalSliderPage() {
        click(horizontalSlider);
        return new HorizontalSliderPage(driver);
    }
}
