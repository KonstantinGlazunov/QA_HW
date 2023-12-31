package org.ait.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = ".top-card:nth-child(6)")
    WebElement bookStore;
    public SidePanel getBookStore() {
        clickWithJSExecutor(bookStore, 0, 300);
        return new SidePanel(driver);
    }

    @FindBy(xpath = "//h5[contains(text(),'Alerts')]")
    WebElement alertsCard;
    public SidePanel getAlertsWindow() {
        click(alertsCard);
        return new SidePanel(driver);
    }

}
