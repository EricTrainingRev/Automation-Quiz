package com.ravature.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ravature.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageTwo {
    @Given("Selenium has pulled up page two")
public void selenium_has_pulled_up_page_two() {
    TestRunner.driver.get("File://C:/Users/duong/Desktop/Automation-Quiz/quiz/src/test/resources/web-pages/PageTwo.html");
}

@When("Selenium enters some text into the first input when it is visible")
public void selenium_enters_some_text_into_the_first_input_when_it_is_visible() {
    TestRunner.page2.enterInputOne("Automation Testing 1 ");
}

@When("Selenium enters some text into the second input when it is visible")
public void selenium_enters_some_text_into_the_second_input_when_it_is_visible() {
    TestRunner.page2.enterInputTwo("Automation Testing 2");
}

@When("Selenium enters some text into the third input when it is visible")
public void selenium_enters_some_text_into_the_third_input_when_it_is_visible() {
    TestRunner.page2.enterInputThree("Automation Testing 3 ");
}

@When("Selenium enters some text into the fourth input when it is visible")
public void selenium_enters_some_text_into_the_fourth_input_when_it_is_visible() {
    TestRunner.page2.enterInputFour("Automation Testing 4");
}

@When("Selenium clicks the submit button for page two")
public void selenium_clicks_the_submit_button_for_page_two() {
    TestRunner.page2.submitButton();
}

@Then("An alert should pop up with a success message for page two")
public void an_alert_should_pop_up_with_a_success_message_for_page_two() {
    TestRunner.wait.until(ExpectedConditions.alertIsPresent());
    String text = TestRunner.driver.switchTo().alert().getText();
    Assert.assertEquals("Mission Assigned!", text);
    TestRunner.driver.switchTo().alert().accept();
}
}
