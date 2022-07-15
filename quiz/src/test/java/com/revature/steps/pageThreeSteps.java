package com.revature.steps;
//package com.revature.steps;


import com.revature.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class pageThreeSteps {
    
    @When("Selenium enters {int} characters into the input while working around the alerts")
    public void selenium_enters_characters_into_the_input_while_working_around_the_alerts(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }
    @When("Selenium clicks the submit button for page three")
    public void selenium_clicks_the_submit_button_for_page_three() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("An alert should pop up with a success message for page three")
    public void an_alert_should_pop_up_with_a_success_message_for_page_three() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }


}
