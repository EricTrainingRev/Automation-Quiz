package com.revature.steps;

public class PageThree {
    
    @Given ("Selenium has pulled up page three")
    public void Selenium_has_pulled_up_page_three (){
        TestRunner.driver.get("C:\Users\18623\Desktop\Quiz Automation/Automation-Quiz/quiz/src/test/esources/web-pages/PageThree.html");
    }
    
    @When ("Selenium enters 100 characters into the input while working around the alerts")
    public  void Selenium_enters_100_characters_into_the_input_while_working_around_the_alerts (){

    }

    @When  ("Selenium clicks the submit button for page three")
    public void Selenium_clicks_the_submit_button_for_page_three (){

    }

    @Then  ("An alert should pop up with a success message for page three")
    public void An_alert_should_pop_up_with_a_success_message_for_page_three () {

    }



}
