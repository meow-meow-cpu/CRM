package com.CRM.step_definitions;

import com.CRM.pages.BasePage;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class ProfileOptionsStepDefs extends BasePage {
    @Then("user sees five options:")
    public void userSeesFiveOptions(List<String> expectedOptions) {

        List<WebElement> actualOptionsAsWebElement = Driver.getDriver().findElements(By.xpath("//*[@class='menu-popup-item-text']"));
        List<String> actualOptions = new ArrayList<>();
        for (WebElement each : actualOptionsAsWebElement) {
            actualOptions.add(each.getText());
        }
        Assert.assertTrue(expectedOptions.containsAll(actualOptions));
    }
}
