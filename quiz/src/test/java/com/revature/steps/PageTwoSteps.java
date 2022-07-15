package com.revature.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.revature.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class PageTwoSteps {
  
    @Given("Selenium has pulled up page two")
    public void selenium_has_pulled_up_page_two() {
    TestRunner.driver.get("C:/Users/Tkoo/Desktop/Revature_VisualCode/Class/Automation-Quiz/quiz/src/test/resources/web-pages/PageTwo.html");
    }
    
    @When("Selenium enters some text into the first input when it is visible")
    public void selenium_enters_some_text_into_the_first_input_when_it_is_visible() {
    //    TestRunner.wait.until(ExpectedConditions.visibilityOf(TestRunner.pageTwo.one));
        TestRunner.pageTwo.one.sendKeys("one");
    //    TestRunner.pageTwo.one("one");
    }
    @When("Selenium enters some text into the second input when it is visible")
    public void selenium_enters_some_text_into_the_second_input_when_it_is_visible() {
        TestRunner.wait.until(ExpectedConditions.visibilityOf(TestRunner.pageTwo.two));

        TestRunner.pageTwo.one("two");
    }
    @When("Selenium enters some text into the third input when it is visible")
    public void selenium_enters_some_text_into_the_third_input_when_it_is_visible() {
        WebElement three = TestRunner.pageTwo.three;
        TestRunner.wait.until(ExpectedConditions.visibilityOf(three));
        TestRunner.pageTwo.one("three");
    }
    @When("Selenium enters some text into the fourth input when it is visible")
    public void selenium_enters_some_text_into_the_fourth_input_when_it_is_visible() {
        WebElement four = TestRunner.pageTwo.four;
        TestRunner.wait.until(ExpectedConditions.visibilityOf(four));
        TestRunner.pageTwo.one("four");
    }
    @When("Selenium clicks the submit button for page two")
    public void selenium_clicks_the_submit_button_for_page_two() {
        TestRunner.pageTwo.submit();
    }
    @Then("An alert should pop up with a success message for page two")
    public void an_alert_should_pop_up_with_a_success_message_for_page_two() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        Assert.assertEquals("SUCCESS!!!", TestRunner.driver.switchTo().alert().getText() );
        TestRunner.driver.switchTo().alert().accept();
    }
}
