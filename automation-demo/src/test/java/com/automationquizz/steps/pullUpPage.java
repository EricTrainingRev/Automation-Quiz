package com.automationquizz.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automationquizz.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class pullUpPage {
    @Given("Selenium has pulled up page one")
    public void selenium_has_pulled_up_page_one() {
    TestRunner.driver.get("File:///Users/mauricekabeireho/Automation-Quiz/automation-demo/src/test/resources/webPages/PageOne.html");
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}
    //Selenium takes the random name and enters it in the input element
    @When("Selenium takes the random name and enters it in the input element")
    public void Selenium_takes_the_random_name_and_enters_it_in_the_input_element() {
        TestRunner.pullUpPage.submitButton(); // EnterText will created in the poms file
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    
    @When("Selenium clicks the submit button for page one")
    public void selenium_clicks_the_submit_button_for_page_one() {
    TestRunner.pullUpPage.clickButton("name");
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
    }
    @Then("An alert should pop up with a success message for page one")
    public void An_alert_should_pop_up_with_a_success_message_for_page_one() {
        TestRunner.Wait.until(ExpectedConditions.titleIs("pageone"));
            String title =TestRunner.driver.getTitle();
            Assert.assertEquals("pageone", title);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
}

