package com.CRM.step_definitions;

import com.CRM.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class MoreActivityTabs {

    @Then("user should be able to four additional options")
    public void userShouldBeAbleToFourAdditionalOptions(List<String> moreOptions) {
        List<WebElement> actualMoreOptionsAsWebElement = Driver.getDriver().findElements(By.xpath("//div[@class='menu-popup-items']/span/span[2]"));
        List<String> actualMoreOptions = new ArrayList<>();
        for (WebElement each : actualMoreOptionsAsWebElement) {
            actualMoreOptions.add(each.getText());
        }
        Assert.assertTrue(moreOptions.containsAll(actualMoreOptions));
    }
}
