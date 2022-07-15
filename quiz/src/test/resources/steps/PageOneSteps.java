package com.automation.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageOneSteps {

    @Given("Selenium has pulled up page one")
    public void on_the_name_input_page() {
        TestRunner.driver.get("file:///C:/Users/James%20Zhang/OneDrive/Desktop/Revature/Quiz/Automation-Quiz/quiz/src/test/resources/web-pages/PageOne.html");
    }

    @When("Selenium clicks the submit button for page three")
    public clicks_submit_button() {
        TestRunner.submit.clickButton();
    }

    @When("Selenium takes the random name and enters it in the input element")
    public void enters_name_input() {
        TestRunner.submit.enterName("nameInput");
    }

    @Then("An alert should pop up with a success message for page one")
        public void recieves_alert(){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            TestRunner.pageone.GetAlertText();

        }
    
    
}