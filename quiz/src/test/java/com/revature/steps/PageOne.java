package com.revature.steps;

import com.revature.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageOne {
     

    WebDriver driver;

    @Given("Selenium has pulled up page one")
    public void Selenium_has_pulled_up_page_one(){
        TestRunner.driver.get("C:/Users/18623/Desktop/Quiz Automation/Automation-Quiz/quiz/src/test/resources/web-pages/PageOne.html");
    }

    @When ("Selenium takes the random name and enters it in the input element")
    public void Selenium_takes_the_random_name_and_enters_it_in_the_input_element(){
        By rando = By.id("randomString");
        WebElement name = TestRunner.driver.findElement(rando);
        name.sendKeys("joe");
    }

    @When ("Selenium clicks the submit button for page one")
    public void Selenium_clicks_the_submit_button_for_page_one(){
        By submit = By.id("submitButton");
        WebElement button = TestRunner.driver.findElement(submit);
        button.click();
    }

    @Then ("An alert should pop up with a success message for page one")
    public void An_alert_should_pop_up_with_a_success_message_for_page_one(){
        TestRunner.driver.switchTo().alert().accept();
    }

}
