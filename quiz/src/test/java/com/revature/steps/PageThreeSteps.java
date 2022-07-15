package com.revature.steps;

import org.openqa.selenium.support.ui.ExpectedConditions;

import com.revature.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageThreeSteps {
    
    // DONE
    @Given("Selenium has pulled up page three")
        public void Selenium_has_pulled_up_page_three() {
            // When telling Selenium to get a local file, you have to add File:// to the start of the URL
            TestRunner.driver.get("File://C:/Users/orian/Automation-Quiz/quiz/src/test/resources/web-pages/PageThree.html");
        }
    
    @When("Selenium enters 100 characters into the input while working around the alerts")
        public void Selenium_enters_100_characters_into_the_input_while_working_around_the_alerts() {
            TestRunner.pageThree.enterInputHere("I am attempting to defeat your evil alerts. So much later that the old narrator got tired of waiting and they had to hire a new one.");
        }

    // DONE
    @When("Selenium clicks the submit button for page three")
        public void Selenium_clicks_the_submit_button_for_page_three() {
            TestRunner.pageThree.submitInputButton();
        }
    
    // DONE
    @Then("An alert should pop up with a success message for page three")
        public void An_alert_should_pop_up_with_a_success_message_for_page_three() {
            TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        }

}
