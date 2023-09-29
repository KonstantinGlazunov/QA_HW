package org.ait.theinternet.pages.frames_sliders;

import org.ait.theinternet.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IFramesPage extends BasePage {
    public IFramesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//p[contains(text(),'Your content goes here.')]")
    WebElement textInIFrame;
    public IFramesPage switchToIframeById(String id) {
        driver.switchTo().frame(id);
        System.out.println("Text of the iframe: " + textInIFrame.getText());
        return this;
    }


}
