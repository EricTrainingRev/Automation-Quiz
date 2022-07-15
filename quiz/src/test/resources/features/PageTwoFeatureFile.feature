Feature: You should be able to get selenium to wait for elements to be interactable

    Scenario: Using selenium to wait for elements to be interactable

        Given Selenium has pulled up page two
        When  Selenium enters some text into the first input when it is visible
        When  Selenium enters some text into the second input when it is visible
        When  Selenium enters some text into the third input when it is visible
        When  Selenium enters some text into the fourth input when it is visible
        When  Selenium clicks the submit button for page two
        Then  An alert should pop up with a success message for page two