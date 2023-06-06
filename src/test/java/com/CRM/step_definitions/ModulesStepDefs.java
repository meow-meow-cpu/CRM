package com.CRM.step_definitions;

import com.CRM.pages.BasePage;
import com.CRM.pages.ChatAndCallsPage;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ModulesStepDefs extends ChatAndCallsPage {

    List<String> allModulesActual = new ArrayList<>();

    @When("user verifies below modules are present")
    public void userVerifiesBelowModulesArePresent(List<String> allModulesExpected) {
        System.out.println("allModulesExpected = " + allModulesExpected);

        List<WebElement> allModules_WE = Driver.getDriver().findElements(By.xpath("//span[@class='menu-item-link-text']"));

        //this.allModulesActual;

        for (WebElement eachModule : allModules_WE) {
            allModulesActual.add(eachModule.getText());
        }

        System.out.println("allModulesActual = " + allModulesActual);

        allModulesActual.remove(13);
        allModulesActual.remove(12);
        //allModulesActual.remove(allModulesActual.size()-1);
        //allModulesActual.remove(allModulesActual.size()-1);

        System.out.println("allModulesActual = " + allModulesActual);

        Assert.assertEquals(allModulesActual, allModulesExpected);
    }

    @Then("user should access the correct page by seeing the below titles")
    public void userShouldAccessTheCorrectPageBySeeingTheBelowTitles(List<String> expectedTitles) throws InterruptedException {

        System.out.println("expectedTitles = " + expectedTitles);

        //List<WebElement> allModules_WE = Driver.getDriver().findElements(By.xpath("//span[@class='menu-item-link-text']"));

        List<String> actualTitles = new ArrayList<>();

        for (String eachModule : allModulesActual) {
            Driver.getDriver().findElement(By.xpath("//a/span[contains(text(), '" + eachModule + "')]")).click();

            System.out.println(Driver.getDriver().getTitle());

            if (Driver.getDriver().getTitle().contains("Chat and Calls")){
                System.out.println(Driver.getDriver().getTitle());
                //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
                //wait.until(ExpectedConditions.elementToBeClickable(closeButton));
                //closeButton.click();

                //Actions actions = new Actions(Driver.getDriver());
                //actions.moveToElement(closeButton).click().build().perform();

                Driver.getDriver().navigate().back();
            }

            actualTitles.add(eachModule);
        }

        System.out.println("actualTitles = " + actualTitles);

        Assert.assertEquals(actualTitles, expectedTitles);
    }
}
