package com.revature.steps;

import org.openqa.selenium.support.ui.ExpectedConditions;

import com.revature.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageOneSteps {
    

    // DONE
    @Given("Selenium has pulled up page one")
        public void Selenium_has_pulled_up_page_one() {
            // When telling Selenium to get a local file, you have to add File:// to the start of the URL
            TestRunner.driver.get("File://C:/Users/orian/Automation-Quiz/quiz/src/test/resources/web-pages/PageOne.html");
        }
    
    // need to enter in the name of the random string, not just my random text oops!
    @When("Selenium takes the random name and enters it in the input element")
        public void Selenium_takes_the_random_name_and_enters_it_in_the_input_element() {
            TestRunner.pageOne.randomNameInput();
        }

    // DONE
    @When("Selenium clicks the submit button for page one")
        public void Selenium_clicks_the_submit_button_for_page_one() {
            TestRunner.pageOne.submitInputButton();
        }

    // DONE
    @Then("An alert should pop up with a success message for page one")
        public void An_alert_should_pop_up_with_a_success_message_for_page_one() {
        // this methods checks that my simulated manager has actually ended up on the manager page
            TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        }

}
