package com.revature.steps;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.revature.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QuizSteps {


    //Page one steps
    @Given("Selenium has pulled up page one")
    public void selenium_has_pulled_up_page_one() {
        TestRunner.driver.get("File://C:/Users/nixen/OneDrive/Desktop/q2/quiz/src/test/resources/webpages/PageOne.html");
    }
    @When("Selenium takes the random name and enters it in the input element")
    public void selenium_takes_the_random_name_and_enters_it_in_the_input_element() {
        TestRunner.pageOne.enterName();   
    }
    @When("Selenium clicks the submit button for page one")
    public void selenium_clicks_the_submit_button_for_page_one() {
        TestRunner.pageOne.clickButton();   
    }
    @Then("An alert should pop up with a success message for page one")
    public void an_alert_should_pop_up_with_a_success_message_for_page_one() {
        boolean alertExists;
        if (TestRunner.wait.until(ExpectedConditions.alertIsPresent()) == null){
            alertExists = false;
        } else {
            alertExists = true;
            Alert alert = TestRunner.driver.switchTo().alert();
            alert.accept();
        }
        Assert.assertEquals(true, alertExists); 
    }


    //Page two steps
    @Given("Selenium has pulled up page two")
    public void selenium_has_pulled_up_page_two() {
        TestRunner.driver.get("File://C:/Users/nixen/OneDrive/Desktop/q2/quiz/src/test/resources/webpages/PageTwo.html");
    }
    @When("Selenium enters some text into the first input when it is visible")
    public void selenium_enters_some_text_into_the_first_input_when_it_is_visible() {
        TestRunner.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("one")));
        TestRunner.pageTwo.enterOne("one");   
    }
    @When("Selenium enters some text into the second input when it is visible")
    public void selenium_enters_some_text_into_the_second_input_when_it_is_visible() {
        TestRunner.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("two")));
        TestRunner.pageTwo.enterTwo("two");  
    }
    @When("Selenium enters some text into the third input when it is visible")
    public void selenium_enters_some_text_into_the_third_input_when_it_is_visible() {
        TestRunner.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("three")));
        TestRunner.pageTwo.enterThree("three");  
    }
    @When("Selenium enters some text into the fourth input when it is visible")
    public void selenium_enters_some_text_into_the_fourth_input_when_it_is_visible() {
        TestRunner.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("four")));
        TestRunner.pageTwo.enterFour("four");  

  
    }

    
    @When("Selenium clicks the submit button for page two")
    public void selenium_clicks_the_submit_button_for_page_two() {
        TestRunner.pageTwo.clickButton(); 
    }
    @Then("An alert should pop up with a success message for page two")
    public void an_alert_should_pop_up_with_a_success_message_for_page_two() {
        boolean alertExists;
        if (TestRunner.wait.until(ExpectedConditions.alertIsPresent()) == null){
            alertExists = false;
        } else {
            alertExists = true;
            Alert alert = TestRunner.driver.switchTo().alert();
            alert.accept();
        }
        Assert.assertEquals(true, alertExists); 
    }



    //Page three steps 
    @Given("Selenium has pulled up page three")
    public void selenium_has_pulled_up_page_three() {
        TestRunner.driver.get("File://C:/Users/nixen/OneDrive/Desktop/q2/quiz/src/test/resources/webpages/PageThree.html");
    }

    @When("Selenium enters {int} characters into the input while working around the alerts")
    public void selenium_enters_characters_into_the_input_while_working_around_the_alerts(Integer int1) {
        TestRunner.pageThree.enterAllText("a");  
    }
    @When("Selenium clicks the submit button for page three")
    public void selenium_clicks_the_submit_button_for_page_three() {
        TestRunner.pageThree.clickButton(); 
    }
    @Then("An alert should pop up with a success message for page three")
    public void an_alert_should_pop_up_with_a_success_message_for_page_three() {
        boolean alertExists;
        if (TestRunner.wait.until(ExpectedConditions.alertIsPresent()) == null){
            alertExists = false;
        } else {
            alertExists = true;
            Alert alert = TestRunner.driver.switchTo().alert();
            alert.accept();
        }
        Assert.assertEquals(true, alertExists); 
    }



    
}
