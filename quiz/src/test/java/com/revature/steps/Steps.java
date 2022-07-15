package com.revature.steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.revature.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
//PAGEONE
@Given("Selenium has pulled up page one")
    public void selenium_has_pulled_up_page_one() {
        TestRunner.driver.get("C:/Users/lyndo/Revature-Training/AutoTest/Automation-Quiz/quiz/src/test/resources/web-pages/PageOne.html");
}
@When("Selenium takes the random name and enters it in the input element")
    public void selenium_takes_the_random_name_and_enters_it_in_the_input_element() {
        TestRunner.pageone.copyPasteName();
}
@When("Selenium clicks the submit button for page one")
    public void selenium_clicks_the_submit_button_for_page_one() {
        TestRunner.pageone.clickSubmit();
}
@Then("An alert should pop up with a success message for page one")
    public void an_alert_should_pop_up_with_a_success_message_for_page_one() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        String alertText = TestRunner.driver.switchTo().alert().getText();
        assertEquals("SUCCESS!!!", alertText);
        TestRunner.driver.switchTo().alert().accept();
}

// PAGETWO
@Given("Selenium has pulled up page two")
public void selenium_has_pulled_up_page_two() {
    TestRunner.driver.get("C:/Users/lyndo/Revature-Training/AutoTest/Automation-Quiz/quiz/src/test/resources/web-pages/PageTwo.html");
}
@When("Selenium enters some text into the first input when it is visible")
    public void selenium_enters_some_text_into_the_first_input_when_it_is_visible() {
    TestRunner.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("one")));
    TestRunner.pagetwo.enterTextForOne("NOT FAST ENOUGH");
}
@When("Selenium enters some text into the second input when it is visible")
    public void selenium_enters_some_text_into_the_second_input_when_it_is_visible() {
    TestRunner.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("two")));
    TestRunner.pagetwo.enterTextForTwo("NOT FAST ENOUGH");
}
@When("Selenium enters some text into the third input when it is visible")
    public void selenium_enters_some_text_into_the_third_input_when_it_is_visible() {
    TestRunner.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("three")));
    TestRunner.pagetwo.enterTextForThree("NOT FAST ENOUGH");
}
@When("Selenium enters some text into the fourth input when it is visible")
    public void selenium_enters_some_text_into_the_fourth_input_when_it_is_visible() {
    TestRunner.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("four")));
    TestRunner.pagetwo.enterTextForFour("NOT FAST ENOUGH");
}
@When("Selenium clicks the submit button for page two")
    public void selenium_clicks_the_submit_button_for_page_two() {
    TestRunner.pagetwo.clickSubmit();
}
@Then("An alert should pop up with a success message for page two")
    public void an_alert_should_pop_up_with_a_success_message_for_page_two() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        String alertText = TestRunner.driver.switchTo().alert().getText();
        assertEquals("SUCCESS!!!", alertText);
        TestRunner.driver.switchTo().alert().accept();
}


// //PAGE THREE
// @Given("Selenium has pulled up page three")
//     public void selenium_has_pulled_up_page_three() {
//     // Write code here that turns the phrase above into concrete actions
//     throw new io.cucumber.java.PendingException();
// }
// @When("Selenium enters {int} characters into the input while working around the alerts")
//     public void selenium_enters_characters_into_the_input_while_working_around_the_alerts(Integer int1) {
//     // Write code here that turns the phrase above into concrete actions
//     throw new io.cucumber.java.PendingException();
// }
// @When("Selenium clicks the submit button for page three")
//     public void selenium_clicks_the_submit_button_for_page_three() {
//     // Write code here that turns the phrase above into concrete actions
//     throw new io.cucumber.java.PendingException();
// }
// @Then("An alert should pop up with a success message for page three")
//     public void an_alert_should_pop_up_with_a_success_message_for_page_three() {
//     // Write code here that turns the phrase above into concrete actions
//     throw new io.cucumber.java.PendingException();
// }

}
