package com.quiztime.steps;

import org.junit.Assert;
import org.junit.runner.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.quiztime.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class pageThreeSteps {
    
    @Given("Selenium has pulled up page three")
public void selenium_has_pulled_up_page_three() {
    TestRunner.driver.get("File:///C:/Users/mimil/Desktop/Automation-Quiz/quiz/src/test/resources/web-pages/PageThree.html");
}

@When("Selenium enters {int} characters into the input while working around the alerts")
public void selenium_enters_characters_into_the_input_while_working_around_the_alerts(Integer int1) {
    TestRunner.pagethree.createTextInput("Wish I had more time on this quiz...");
}

@When("Selenium clicks the submit button for page three")
public void selenium_clicks_the_submit_button_for_page_three() {
    By theSubmitButton = By.id("button"); 
        WebElement theButton= TestRunner.driver.findElement(theSubmitButton); 
        theButton.click();
}

@Then("An alert should pop up with a success message for page three")
public void an_alert_should_pop_up_with_a_success_message_for_page_three() {
    TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = TestRunner.driver.switchTo().alert();
        Assert.assertEquals("SUCCESS!!!", alert.getText());
       alert.accept();
}
}
