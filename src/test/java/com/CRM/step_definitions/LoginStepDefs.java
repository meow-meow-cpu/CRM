package com.CRM.step_definitions;

import com.CRM.pages.LoginPage;
import com.CRM.utilities.ConfigurationReader;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginStepDefs extends LoginPage {

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @And("user enters valid credentials for {string} {string} and {string}")
    public void userEntersValidForAnd(String userType, String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);


    }


    @When("user clicks log-in button")
    public void user_clicks_log_in_button() {
        loginButton.click();
    }
    @Then("user lands on the homepage")
    public void user_lands_on_the_homepage() {

        String title = Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains("Portal"));
    }


    @And("user enters {string} credentials for {string} {string} and {string}")
    public void userEntersCredentialsForAnd(String validInvalid, String userType, String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
    }

    @Then("following message should be displayed:Incorrect username or password")
    public void followingMessageShouldBeDisplayedIncorrectUsernameOrPassword() {

        Assert.assertEquals(errorText.getText(), "Incorrect login or password");
    }
}