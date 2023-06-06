package com.CRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChatAndCallsPage extends BasePage{

    @FindBy(xpath = "//a[@class='bx-im-fullscreen-popup-back-link']")
    public WebElement closeButton;
}
