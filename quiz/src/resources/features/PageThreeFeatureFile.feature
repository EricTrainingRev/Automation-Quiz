Feature: You should be able to get selenium to work around alerts

    Scenario: Using selenium to interact with alerts

        Given Selenium has pulled up page three
        When  Selenium enters 100 characters into the input while working around the alerts
        When  Selenium clicks the submit button for page three
        Then  An alert should pop up with a success message for page three