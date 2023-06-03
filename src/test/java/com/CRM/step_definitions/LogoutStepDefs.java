package com.CRM.step_definitions;

import com.CRM.pages.BasePage;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LogoutStepDefs extends BasePage {

    @When("user clicks on profile icon")
    public void user_clicks_on_profile_icon() {
    profile.click();

    }
    @Then("the Log Out option from the homepage should be displayed")
    public void theLogOutOptionFromTheHomepageShouldBeDisplayed() {
    String actual = logout.getText();
    String expected = "Log out";
        Assert.assertEquals(actual,expected);
    }
    @When("user clicks log out button")
    public void user_clicks_log_out_button() {
    logout.click();
    }
    @Then("user is back on the login page")
    public void user_is_back_on_the_login_page() {
    String actual = Driver.getDriver().getTitle();
    String expected = "Authorization";
     Assert.assertEquals(actual,expected);

    }


}
