package com.revature.steps;

import org.openqa.selenium.support.ui.ExpectedConditions;

import com.revature.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageTwoSteps {
    
    // DONE
    @Given("Selenium has pulled up page two")
        public void Selenium_has_pulled_up_page_two() {
            // When telling Selenium to get a local file, you have to add File:// to the start of the URL
            TestRunner.driver.get("File://C:/Users/orian/Automation-Quiz/quiz/src/test/resources/web-pages/PageTwo.html");
        }
    
    // DONE
    @When("Selenium enters some text into the first input when it is visible")
        public void Selenium_enters_some_text_into_the_first_input_when_it_is_visible() {
            TestRunner.pageTwo.enterInputOne("I am the first input!");
        }

    // DONE
    @When("Selenium enters some text into the second input when it is visible")
        public void Selenium_enters_some_text_into_the_second_input_when_it_is_visible() {
            TestRunner.pageTwo.enterInputTwo("I am the second input!");
        }

    // DONE
    @When("Selenium enters some text into the third input when it is visible")
        public void Selenium_enters_some_text_into_the_third_input_when_it_is_visible() {
            TestRunner.pageTwo.enterInputThree("I am the third input!");
        }

    // DONE
    @When("Selenium enters some text into the fourth input when it is visible")
        public void Selenium_enters_some_text_into_the_fourth_input_when_it_is_visible() {
            TestRunner.pageTwo.enterInputFour("I am the fourth input!");
        }

    // DONE
    @When("Selenium clicks the submit button for page two")
        public void Selenium_clicks_the_submit_button_for_page_two() {
            TestRunner.pageTwo.submitInputButton();
        }

    // DONE
    @Then("An alert should pop up with a success message for page two")
        public void An_alert_should_pop_up_with_a_success_message_for_page_two() {
        // this methods checks that my simulated manager has actually ended up on the manager page
            TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        }

}
