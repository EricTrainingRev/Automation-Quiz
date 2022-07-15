package com.revature.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageTwo {

    
        // these web elements need to be referenced in our steps so they are public
        @FindBy(id = "one")    // this tells the PageFactory to find the element with the id username and assign it to this field
        public WebElement inputOne; 

        @FindBy(id = "two")
        public WebElement inputTwo;

        @FindBy(id = "three")
        public WebElement inputThree;
        
        @FindBy(id = "four")
        public WebElement inputFour;
        
    
        // this tells the PageFactory to find the element with the id login-button and assign it to this field
        // you can also do (tagName = "button") and it would find the first button on the page
        @FindBy(id = "submit")
        public WebElement submitButton;

        private WebDriver driver;
    
        public PageTwo(WebDriver driver){
            /*
             * The PageFactory class is provided by Selenium and it abstracts away from us the code that handles initializing our WebElement fields.
             * We simply provide the initElements() method with the private driver we intialize above, and the PageFactory class handles the rest
             */
            PageFactory.initElements(driver, this);
        }
    

        public void enterInputOne (String inputOneText){
            WebDriverWait waitUntilOnePresent = new WebDriverWait(driver,10);
            waitUntilOnePresent.until(ExpectedConditions.elementToBeClickable(inputOne));
            this.inputOne.sendKeys(inputOneText);
        }

        public void enterInputTwo (String inputTwoText){
            WebDriverWait waitUntilTwoPresent = new WebDriverWait(driver,10);
            waitUntilTwoPresent.until(ExpectedConditions.elementToBeClickable(inputTwo));
            this.inputTwo.sendKeys(inputTwoText);
        }

        public void enterInputThree (String inputThreeText){
            WebDriverWait waitUntilThreePresent = new WebDriverWait(driver,10);
            waitUntilThreePresent.until(ExpectedConditions.elementToBeClickable(inputThree));
            this.inputTwo.sendKeys(inputThreeText);
        }

        public void enterInputFour (String inputFourText){
            WebDriverWait waitUntilFourPresent = new WebDriverWait(driver,10);
            waitUntilFourPresent.until(ExpectedConditions.elementToBeClickable(inputFour));
            this.inputTwo.sendKeys(inputFourText);
        }

    
        // this method will make Selenium click on our login button
        public void submitInputButton(){
    
            // to click on an element, you just use the click() method
            this.submitButton.click();
        }
    
}
