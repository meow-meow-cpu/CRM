package com.CRM.pages;

import com.CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
@FindBy(id = "user-name")
    public WebElement profile;

@FindBy(className = "menu-popup-item-text")
    public WebElement logout;
}
