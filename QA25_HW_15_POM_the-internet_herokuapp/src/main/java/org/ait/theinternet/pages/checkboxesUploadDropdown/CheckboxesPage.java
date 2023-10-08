package org.ait.theinternet.pages.checkboxesUploadDropdown;

import org.ait.theinternet.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CheckboxesPage extends BasePage {
    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[type='checkbox']:nth-of-type(1)")
    WebElement checkbox1;
    @FindBy(css = "[type='checkbox']:nth-of-type(2)")
    WebElement checkbox2;

    public CheckboxesPage clickCheckbox1() {
        click(checkbox1);
        return this;
    }
    public CheckboxesPage isCheckbox1Checked() {
        Assert.assertTrue(checkbox1.isSelected());
        return this;
    }

    public CheckboxesPage clickCheckbox2() {
        click(checkbox2);
        return this;
    }
    public CheckboxesPage isCheckbox2UnChecked() {
        Assert.assertTrue(!checkbox2.isSelected());
        return this;
    }

}
