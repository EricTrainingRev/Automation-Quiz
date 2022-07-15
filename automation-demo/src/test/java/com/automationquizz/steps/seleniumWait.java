package com.automationquizz.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automationquizz.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class seleniumWait {

    @Given("Selenium has pulled up page two")
    public void selenium_has_pulled_up_page_two() {
        TestRunner.driver.get("File:///Users/mauricekabeireho/Automation-Quiz/automation-demo/src/test/resources/webPages/PageTwo.html");
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    } @When("Selenium enters some text into the first input when it is visible")
    public void selenium_enters_some_text_into_the_first_input_when_it_is_visible() {
        TestRunner.EnterText.clickButton("name");
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @When("Selenium enters some text into the second input when it is visible")
    public void selenium_enters_some_text_into_the_second_input_when_it_is_visible() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @When("Selenium enters some text into the third input when it is visible")
    public void selenium_enters_some_text_into_the_third_input_when_it_is_visible() {
        TestRunner.seleniumWait.clickButton("name");
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @When("Selenium enters some text into the fourth input when it is visible")
    public void selenium_enters_some_text_into_the_fourth_input_when_it_is_visible() {
        TestRunner.seleniumWait.clickButton("name");
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();

    }

    // Selenium clicks the submit button for page one
    @When("Selenium clicks the submit button for page two")
    public void selenium_clicks_the_submit_button_for_page_two() {
        TestRunner.seleniumWait.clickButton();
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }

    @Then("An alert should pop up with a success message for page two")
    public void an_alert_should_pop_up_with_a_success_message_for_page_two() {
        TestRunner.Wait.until(ExpectedConditions.titleIs("pagetwo"));
        String title = TestRunner.driver.getTitle();
        Assert.assertEquals("pagetwo", title);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

}


