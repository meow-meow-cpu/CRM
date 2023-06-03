package com.CRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(name = "USER_LOGIN")
    public WebElement usernameField;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordField;

    @FindBy(className = "login-btn")
    public WebElement loginButton;

    @FindBy(className = "errortext")
    public WebElement errorText;
}
