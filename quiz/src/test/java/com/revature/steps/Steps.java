package com.revature.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.revature.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Steps {
    @Given("Selenium has pulled up page one")
    public void selenium_has_pulled_up_page_one() {
    TestRunner.driver.get("file:///C:/Users/Dulce/Desktop/Automation-Quiz/quiz/src/test/resources/web-pages/PageOne.html");
    }
//this was running? now it's not??
    

    // @When("Selenium takes the random name and enters it in the input element")
    // public void
    // selenium_takes_the_random_name_and_enters_it_in_the_input_element() {

    // By randomStringLocator = By.id("randomString");
    // WebElement randomStringElement =
    // TestRunner.driver.findElement(randomStringLocator);

    // By inputFieldLocator = By.id("nameInput");
    // WebElement firstInputField =
    // TestRunner.driver.findElement(inputFieldLocator);
    // firstInputField.sendKeys();
    // }  
     //this works but need step 2
    @When("Selenium clicks the submit button for page one")
    public void selenium_clicks_the_submit_button_for_page_one() {
    By submitButtonLocator = By.id("submitButton");
    WebElement submitButton = TestRunner.driver.findElement(submitButtonLocator);
    submitButton.click();
    try {
    Thread.sleep(5000);
    } catch (InterruptedException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
    }
 
    // }
// @Given("Selenium has pulled up page two")
//     public void selenium_has_pulled_up_page_two() {
//         TestRunner.driver
//                 .get("file:///C:/Users/Dulce/Desktop/Automation-Quiz/quiz/src/test/resources/web-pages/PageTwo.html");
//     }
    }
}
