package com.automation.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageTwoSteps {

    @Given("Selenium has pulled up page two")
    public void on_the_name_input_page() {
        TestRunner.driver.get("file:///C:/Users/James%20Zhang/OneDrive/Desktop/Revature/Quiz/Automation-Quiz/quiz/src/test/resources/web-pages/PageTwo.html");
    }

    @When("Selenium clicks the submit button for page two")
    public clicks_submit_button() {
        TestRunner.submit.clickButton();
    }

    @When("Selenium enters some text into the first input when it is visible")
    public void enters_input_one() {
        TestRunner.submit.enterInputOne("one");
    }

    @When("Selenium enters some text into the second input when it is visible")
    public void enters_input_two() {
        TestRunner.submit.enterInputTwo("two");
    }

    @When("Selenium enters some text into the third input when it is visible")
    public void enters_input_three() {
        TestRunner.submit.enterInputThree("three");
    }

    @When("Selenium enters some text into the fourth input when it is visible")
    public void enters_input_four() {
        TestRunner.submit.enterInputFour("four");
    }
    
    @Then("An alert should pop up with a success message for page two")
        public void recieves_alert(){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            TestRunner.pagetwo.GetAlertText();

        }
    
    
}