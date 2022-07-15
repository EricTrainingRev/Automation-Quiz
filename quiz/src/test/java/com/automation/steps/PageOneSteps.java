package com.automation.steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageOneSteps {


    @Given("Selenium has pulled up page one")
    public void selenium_has_pulled_up_page_one() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.driver.get("File:///Users/cameronhauser/Documents/GitHub/Projectone/Automation-Quiz/quiz/src/test/resources/web-pages/PageOne.html");

    }
    
    
    
    @When("Selenium takes the random name and enters it in the input element")
    public void selenium_takes_the_random_name_and_enters_it_in_the_input_element() {
        String heading = TestRunner.driver.findElement(By.xpath("//*[@id='randomString']")).getText();

        // Write code here that turns the phrase above into concrete actions
       TestRunner.pageonepom.enterUsername(heading);
    }
    @When("Selenium clicks the submit button for page one")
    public void selenium_clicks_the_submit_button_for_page_one() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.pageonepom.clickSubmitButton();
        }
    @Then("An alert should pop up with a success message for page one")
    public void an_alert_should_pop_up_with_a_success_message_for_page_one() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        String checkIfCreated = TestRunner.driver.switchTo().alert().getText();
        Assert.assertEquals("SUCCESS!!!", checkIfCreated);
        TestRunner.driver.switchTo().alert().dismiss();
    }
    
    
    @Given("Selenium has pulled up page two")
    public void selenium_has_pulled_up_page_two() {
        // Write code here that turns the phrase above into concrete actions
    TestRunner.driver.get("File:///Users/cameronhauser/Documents/GitHub/Projectone/Automation-Quiz/quiz/src/test/resources/web-pages/PageTwo.html");
    }
    
    
    
    @When("Selenium enters some text into the first input when it is visible")
    public void selenium_enters_some_text_into_the_first_input_when_it_is_visible() {
        
        
        TestRunner.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("one"))).sendKeys("test");;
        
        

    }
    @When("Selenium enters some text into the second input when it is visible")
    public void selenium_enters_some_text_into_the_second_input_when_it_is_visible() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("two"))).sendKeys("test");;

    }
    @When("Selenium enters some text into the third input when it is visible")
    public void selenium_enters_some_text_into_the_third_input_when_it_is_visible() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("three"))).sendKeys("test");;

        }
    @When("Selenium enters some text into the fourth input when it is visible")
    public void selenium_enters_some_text_into_the_fourth_input_when_it_is_visible() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("four"))).sendKeys("test");;

    }
    @When("Selenium clicks the submit button for page two")
    public void selenium_clicks_the_submit_button_for_page_two() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.driver.findElement(By.id("submit")).click();

    }
    @Then("An alert should pop up with a success message for page two")
    public void an_alert_should_pop_up_with_a_success_message_for_page_two() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        String checkIfCreated = TestRunner.driver.switchTo().alert().getText();
        Assert.assertEquals("SUCCESS!!!", checkIfCreated);
        TestRunner.driver.switchTo().alert().dismiss();
    }
    
    
    @Given("Selenium has pulled up page three")
    public void selenium_has_pulled_up_page_three() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.driver.get("File:///Users/cameronhauser/Documents/GitHub/Projectone/Automation-Quiz/quiz/src/test/resources/web-pages/PageThree.html");        
    }
    
    
    
    @When("Selenium enters {int} characters into the input while working around the alerts")
    public void selenium_enters_characters_into_the_input_while_working_around_the_alerts(Integer int1) {
        TestRunner.driver.findElement(By.id("input")).sendKeys("1");

        TestRunner.driver.switchTo().alert().dismiss();


        // Write code here that turns the phrase above into concrete actions
        TestRunner.driver.findElement(By.id("input")).sendKeys("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elem");;
        TestRunner.driver.switchTo().alert().dismiss();
    }
    @When("Selenium clicks the submit button for page three")
    public void selenium_clicks_the_submit_button_for_page_three() {
        TestRunner.driver.switchTo().alert().dismiss();

        TestRunner.driver.findElement(By.id("button")).click();

        TestRunner.driver.switchTo().alert().dismiss();

        // Write code here that turns the phrase above into concrete actions
        TestRunner.driver.findElement(By.id("button")).click();

    }
    @Then("An alert should pop up with a success message for page three")
    public void an_alert_should_pop_up_with_a_success_message_for_page_three() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        String checkIfCreated = TestRunner.driver.switchTo().alert().getText();
        Assert.assertEquals("SUCCESS!!!", checkIfCreated);
        TestRunner.driver.switchTo().alert().dismiss();
        
    }
}
