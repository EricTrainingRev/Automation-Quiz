package com.automationquizz.steps;

import java.util.EventListener;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automationquizz.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class selenium_towork {
    @Given("Selenium has pulled up page three")
    public void selenium_has_pulled_up_page_three() {
        TestRunner.driver.get("File:///Users/mauricekabeireho/Automation-Quiz/automation-demo/src/test/resources/webPages/PageThree.html");
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    
    @When("Selenium enters 100 characters into the input while working around the alerts")
    public void Selenium_enters_100_characters_into_the_imput_while_working_around_the_alerts() {
        TestRunner.seleniumToWork.clickButton(); // EnterText will created in the poms file
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    
    //Selenium clicks the submit button for page one
    @When("Selenium clicks the submit button for page three")
    public void selenium_clicks_the_submit_button_for_page_three() {
        TestRunner.seleniumToWork.clickButton();
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    
    @Then("An alert should pop up with a success message for page three")
    public void An_alert_should_pop_up_with_a_success_message_for_page_three() {
        TestRunner.Wait.until(ExpectedConditions.alertIsPresent());
            String alert =TestRunner.driver.getWindowHandle();
            Assert.assertEquals("SUCCESS!!!", alert);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
}
