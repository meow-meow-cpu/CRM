package com.CRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class LoginPage extends BasePage{

    @FindBy(name = "USER_LOGIN")
    public WebElement usernameField;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordField;

    @FindBy(className = "login-btn")
    public WebElement loginButton;

    @FindBy(className = "errortext")
    public WebElement errorText;



    public void login(String userType){
        String username = "";
        String password = "";
        switch (userType){
            case "helpdesk":
               username="helpdesk45@cybertekschool.com";
               password="UserUser";
                usernameField.sendKeys(username);
                passwordField.sendKeys(password);
                loginButton.click();
                break;
            case "humanResource":
                username="hr45@cybertekschool.com";
                password="UserUser";
                usernameField.sendKeys(username);
                passwordField.sendKeys(password);
                loginButton.click();
                break;
            case "marketing":
                username="marketing45@cybertekschool.com";
                password="UserUser";
                usernameField.sendKeys(username);
                passwordField.sendKeys(password);
                loginButton.click();
                break;
        }
//        usernameField.sendKeys(username);
//        passwordField.sendKeys(password);
//        loginButton.click();
    }
}
