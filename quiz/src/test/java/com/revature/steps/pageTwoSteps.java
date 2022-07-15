package com.revature.steps;


import com.revature.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class pageTwoSteps {



    @Given("Selenium has pulled up page three")
    public void selenium_has_pulled_up_page_three() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.driver.get("File://C:\Quizz\Automation-Quiz\quiz\src\test\resources\web-pages\PageOne.html");
    }
    

    @When("Selenium enters some text into the first input when it is visible")
    public void selenium_enters_some_text_into_the_first_input_when_it_is_visible() {
        // Write code here that turns the phrase above into concrete actions
    //    throw new io.cucumber.java.PendingException();
    TestRunner.Pg2.enterFirstInput("VietNguyen");

    }
    @When("Selenium enters some text into the second input when it is visible")
    public void selenium_enters_some_text_into_the_second_input_when_it_is_visible() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        TestRunner.Pg2.enterSecondInput("VietNguyen");

    }
    @When("Selenium enters some text into the third input when it is visible")
    public void selenium_enters_some_text_into_the_third_input_when_it_is_visible() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        TestRunner.Pg2.enterThirdInput("VietNguyen");
  
}
    @When("Selenium enters some text into the fourth input when it is visible")
    public void selenium_enters_some_text_into_the_fourth_input_when_it_is_visible() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        TestRunner.Pg2.enterFourthInput("VietNguyen");

    }
    @When("Selenium clicks the submit button for page two")
    public void selenium_clicks_the_submit_button_for_page_two() {
        // Write code here that turns the phrase above into concrete actions
      //  throw new io.cucumber.java.PendingException();
      TestRunner.Pg2.clickButton();

    }
    @Then("An alert should pop up with a success message for page two")
    public void an_alert_should_pop_up_with_a_success_message_for_page_two() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}