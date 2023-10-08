package org.ait.theinternet.pages.checkboxesUploadDropdown;

import org.ait.theinternet.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropdownListPage extends BasePage {
    public DropdownListPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "dropdown")
    WebElement dropdown;

    public DropdownListPage selectOption(String option) {
        Select select = new Select(dropdown);
        select.selectByVisibleText(option);
        String actualValue = select.getFirstSelectedOption().getText();
        Assert.assertEquals(actualValue, option);
        return this;
    }
}
