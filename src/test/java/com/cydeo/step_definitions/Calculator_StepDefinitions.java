package com.cydeo.step_definitions;

import com.cydeo.pages.CalculatorPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Calculator_StepDefinitions {

    @Given("User is on calculator page")
    public void user_is_on_calculator_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("calculator.url"));
    }
    @When("User clicks {string} on calculator")
    public void user_clicks_on_calculator(String string) {
        String button = string;
        new CalculatorPage().button(button).click();

    }
    @Then("result {string} should be displayed")
    public void result_should_be_displayed(String string) {
        String actualResult = new CalculatorPage().outPut.getText().trim();
        String expectedResult = string;
        Assert.assertEquals("Wrong Calculation", expectedResult, actualResult);
    }

}
