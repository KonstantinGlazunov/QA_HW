package org.ait.theinternet.pages.frames_sliders;

import org.ait.theinternet.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HorizontalSliderPage extends BasePage {

    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@type='range']")
    WebElement sliderContainer;

    public HorizontalSliderPage moveSliderInHorizontalDirection() {
        pause(500);
        new Actions(driver).dragAndDropBy(sliderContainer, 65, 0).perform();
        return this;
    }


    @FindBy(id = "range")
    WebElement sliderValue;

    public HorizontalSliderPage assertSliderValue(String number) {
        Assert.assertEquals(sliderValue.getText(), number);
        return this;
    }

}
