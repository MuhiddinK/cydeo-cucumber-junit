package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleStepDefinitions {

    @When("user types apple and clicks enter")
    public void user_types_apple_and_clicks_enter() {

    }
    @Then("user sees apple in the google title")
    public void user_sees_apple_in_the_google_title() {

    }

    @When("user is on Google search page")
    public void user_is_on_google_search_page() {

        Driver.getDriver().get("https://www.google.com");

        //AgreeButton problem has been solved
        WebElement agreeButton = Driver.getDriver().findElement(By.id("L2AGLb"));
        agreeButton.click();

    }
    @Then("user should see title is Google")
    public void user_shoould_see_title_is_google() {
        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);

        Driver.closeDriver();
    }

}
