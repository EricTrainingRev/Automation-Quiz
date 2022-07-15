package com.revature.steps;

import com.revature.runner.TestRunner;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class PageOneSteps {
    @Given("Selenium has pulled up page one")
    public void selenium_has_pulled_up_page_one() {
         TestRunner.driver.get("C:/Users/Tkoo/Desktop/Revature_VisualCode/Class/Automation-Quiz/quiz/src/test/resources/web-pages/PageOne.html");
    }
    @When("Selenium takes the random name and enters it in the input element")
    public void selenium_takes_the_random_name_and_enters_it_in_the_input_element() {
    TestRunner.pageOne.enterName(TestRunner.pageOne.randomString.getText());
    }
    @When("Selenium clicks the submit button for page one")
    public void selenium_clicks_the_submit_button_for_page_one() {
        TestRunner.pageOne.submitButton();
    }
    @Then("An alert should pop up with a success message for page one")
    public void an_alert_should_pop_up_with_a_success_message_for_page_one() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        Assert.assertEquals("SUCCESS!!!", TestRunner.driver.switchTo().alert().getText() );
        TestRunner.driver.switchTo().alert().accept();
    }
    
   
}
   