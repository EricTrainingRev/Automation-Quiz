package com.automation.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageThreeSteps {
    
    @Given("Selenium has pulled up page three")
    public void selenium_has_pulled_up_page_three() {
        TestRunner.driver.get("File://C:/git/Automation-Quiz/quiz/src/test/resources/web-pages/PageThree.html");
    }  
    
    @When("Selenium enters {int} characters into the input while working around the alerts")
    public void selenium_enters_characters_into_the_input_while_working_around_the_alerts(Integer int1) {
        TestRunner.pagethree.enterNums(int1);
    }

    @When("Selenium clicks the submit button for page three")
    public void selenium_clicks_the_submit_button_for_page_three() {
        TestRunner.pagethree.clickButton();
    }
    
    @Then("An alert should pop up with a success message for page three")
    public void an_alert_should_pop_up_with_a_success_message_for_page_three() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        String alertText = TestRunner.driver.switchTo().alert().getText();
        Assert.assertEquals("SUCCESS!!!", alertText);
        TestRunner.pagetwo.alert();
    }
}
