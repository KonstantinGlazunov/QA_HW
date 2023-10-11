package org.ait.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ToolTipsPage extends BasePage {
    public ToolTipsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id="toolTipTextField")
    WebElement toolTipTextField;
    @FindBy(css="[aria-describedly]")
    WebElement attribute;
    public ToolTipsPage hoverToolTips() {
        pause(1000);
        new Actions(driver).moveToElement(toolTipTextField).perform();
        pause(1000);
       // System.out.println(attribute.getAttribute(attribute));
        return this;
    }

    public ToolTipsPage assertToolTips(String value) {
        Assert.assertEquals(getValueAttribute(toolTipTextField, "aria-describedby"), value);
        return this;
    }
}
