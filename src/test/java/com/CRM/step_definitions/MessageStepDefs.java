package com.CRM.step_definitions;

import com.CRM.pages.BasePage;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MessageStepDefs extends BasePage {

    @When("user clicks the {string} tab")
    public void userClicksTheTab(String tabName) {
        activityTabs(tabName).click();
    }


    String message = "";
    @And("the user writes the message body")
    public void theUserWritesTheMessageBody(String message) {

        this.message = message;
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//div[@id ='bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm']/iframe")));
        messageBox.sendKeys(message);
        Driver.getDriver().switchTo().defaultContent();
    }

    @Then("user sends the message")
    public void userSendsTheMessage() {
        sendButton.click();
    }

    @And("verifies message is sent successfully")
    public void verifiesMessageIsSentSuccessfully() {

        String actual = Driver.getDriver().findElement(By.xpath("//div[@class='feed-post-text-block-inner-inner']")).getText();

        Assert.assertEquals(actual, this.message);
    }

    @Then("user should see the following message: The message title is not specified")
    public void userShouldSeeTheFollowingMessageTheMessageTitleIsNotSpecified() {
        String actual = errorMessage.getText();
        String expected = "The message title is not specified";

        Assert.assertEquals(actual, expected);
    }


    @And("the user doesn't write a message body")
    public void theUserDoesnTWriteAMessageBody() {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//div[@id ='bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm']/iframe")));
        messageBox.sendKeys("");
        Driver.getDriver().switchTo().defaultContent();
    }
}
