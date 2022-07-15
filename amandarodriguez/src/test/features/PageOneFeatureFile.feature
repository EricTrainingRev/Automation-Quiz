Feature: You should be able to get selenium to enter text into an input and submit it

    Scenario: Using selenium to get text and enter it into an input

        Given Selenium has pulled up page one
        When  Selenium takes the random name and enters it in the input element
        When  Selenium clicks the submit button for page one
        Then  An alert should pop up with a success message for page one