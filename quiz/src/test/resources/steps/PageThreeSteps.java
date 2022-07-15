package com.automation.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageOneSteps {

    @Given("Selenium has pulled up page three")
    public void on_page_three() {
        TestRunner.driver.get("file:///C:/Users/James%20Zhang/OneDrive/Desktop/Revature/Quiz/Automation-Quiz/quiz/src/test/resources/web-pages/PageThree.html");
    }

    @When("Selenium clicks the submit button for page three")
    public clicks_submit_button() {
        TestRunner.submit.clickButton();
    }

    @When("Selenium enters 100 characters into the input while working around the alerts")
    public void enters_text_input() {
        TestRunner.submit.enterTextInput("input");
    }

    @Then("An alert should pop up with a success message for page three")
        public void recieves_alert(){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            TestRunner.pagethree.GetAlertText();

        }
    
    
}