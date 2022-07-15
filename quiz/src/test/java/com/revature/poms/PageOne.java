package com.revature.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.utility.RandomString;

public class PageOne {
    
        // these web elements need to be referenced in our steps so they are public
        @FindBy(id = "nameInput")    // this tells the PageFactory to find the element with the id username and assign it to this field
        public WebElement nameInput; 
    

        // this tells the PageFactory to find the element with the id login-button and assign it to this field
        // you can also do (tagName = "button") and it would find the first button on the page
        @FindBy(id = "submitButton")
        public WebElement submitButton;
    
        public PageOne(WebDriver driver){
            /*
             * The PageFactory class is provided by Selenium and it abstracts away from us the code that handles initializing our WebElement fields.
             * We simply provide the initElements() method with the private driver we intialize above, and the PageFactory class handles the rest
             */
            PageFactory.initElements(driver, this);
        }
    
        /*
         * These methods are public so we can access them in the steps, and their return type is void because the functions do not return any
         * values: they just interact with the web page
         */
    
        @FindBy(id = "randomString")
        public WebElement randomString;

        // gotta get my string to be the value of randomString hmmm
        public void randomNameInput(String tryThis){
            tryThis = randomString;
            this.nameInput.sendKeys(tryThis);
        }
    
        // this method will make Selenium click on our login button
        public void submitInputButton(){
    
            // to click on an element, you just use the click() method
            this.submitButton.click();
        }
}
