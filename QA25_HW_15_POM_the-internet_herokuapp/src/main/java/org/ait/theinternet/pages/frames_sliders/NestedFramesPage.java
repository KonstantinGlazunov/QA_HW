package org.ait.theinternet.pages.frames_sliders;

import org.ait.theinternet.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NestedFramesPage extends BasePage {
    public NestedFramesPage(WebDriver driver) {
        super(driver);
    }

@FindBy (tagName = "frame")
List<WebElement> frames;
    public NestedFramesPage returnListOfFrames() {
        System.out.println("The total numbers of frames: " + frames.size());
        return this;
    }

    @FindBy(css = "body")
    WebElement bottomHeadName;
    public NestedFramesPage switchToIframeByName(String name) {
        driver.switchTo().frame(name);
        System.out.println("Text of the iframe: " + bottomHeadName.getText());
        return this;
    }




}
