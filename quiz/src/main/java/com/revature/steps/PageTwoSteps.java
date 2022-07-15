import com.revature.runner.TestRunner;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When

package com.revature.steps;

public class PageTwoSteps {


    @Given("Selenium has pulled up page one")
    public void Selenium_has_pulled_up_page_one() {
        TestRunner.driver.get(
                ":File://C:/Users/tareka/Desktop/Automation-Quiz/quiz/src/test/resources/web-pages/PageOne.html");
    }
}

@When("Selenium enters some text into the first input when it is visible")
    public void selenium_enters_some_text_into_the_first_input_when_it_is_visible() {
        TestRunner.PageOne.enterrandomString("Joe-0.5096793660620862");
    }

    @When("Selenium enters some text into the second input when it is visible")
    public void selenium_enters_some_text_into_second_input_when_it_is_visible() {
        TestRunner.PageOne.clickButton();
    }

    @When("Selenium enters some text into the third input when it is visible")
    public void selenium_enters_some_text_into_the_third_input_when_it_is_visible() {
        TestRunner.PageOne.enterrandomString("Joe-0.5096793660620862");
    }

    @When("elenium enters some text into the fourth input when it is visible")
    public void selenium_enters_some_text_into_the_fourth_input_when_it_is_visible() {
        TestRunner.PageOne.clickButton();

    @Then("An alert should pop up with a success message for page one")
    public void an_alert_should_pop_up_with_a_success_message_for_page_one() {
        TestRunner.wait.until(ExpectedConditions.titleIs("PageTwo.html"));
        boolean alertExists;
        if (TestRunner.wait.until(ExpectedConditions.alertIsPresent()) == null) {
            alertExists = false;
        } else {
            alertExists = true;
            Alert alert = TestRunner.driver.switchTo().alert();
            alert.accept();
        }
    }

    
}
