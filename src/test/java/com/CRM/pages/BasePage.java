package com.CRM.pages;

import com.CRM.utilities.Driver;
import org.openqa.selenium.By;
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

    @FindBy(xpath = "//*[@class='menu-popup-item-text']")
    public WebElement profileOptions;

    @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement messageTab;

    public WebElement activityTabs (String tabName){
        WebElement tab = Driver.getDriver().findElement(By.xpath("//div[@id='feed-add-post-form-tab']/span[.='" + tabName + "']"));
        return tab;
    }

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageBox;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "//span[@class='feed-add-info-text']")
    public WebElement errorMessage;
}


