package com.quiztime.steps;

import com.quiztime.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class pageTwoSteps {
    
    @Given("Selenium has pulled up page two")
public void selenium_has_pulled_up_page_two() {
    TestRunner.driver.get("File:///C:/Users/mimil/Desktop/Automation-Quiz/quiz/src/test/resources/web-pages/PageTwo.html");
}

@When("Selenium enters some text into the first input when it is visible")
public void selenium_enters_some_text_into_the_first_input_when_it_is_visible() {
   
}

@When("Selenium enters some text into the second input when it is visible")
public void selenium_enters_some_text_into_the_second_input_when_it_is_visible() {
    
}
@When("Selenium enters some text into the third input when it is visible")
public void selenium_enters_some_text_into_the_third_input_when_it_is_visible() {
   
}

@When("Selenium enters some text into the fourth input when it is visible")
public void selenium_enters_some_text_into_the_fourth_input_when_it_is_visible() {
   
}

@When("Selenium clicks the submit button for page two")
public void selenium_clicks_the_submit_button_for_page_two() {
   
}

@Then("An alert should pop up with a success message for page two")
public void an_alert_should_pop_up_with_a_success_message_for_page_two() {
    
}


}
