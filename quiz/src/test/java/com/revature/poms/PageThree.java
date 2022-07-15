package com.revature.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PageThree {
    
    
        // these web elements need to be referenced in our steps so they are public
        @FindBy(id = "input")    // this tells the PageFactory to find the element with the id username and assign it to this field
        public WebElement inputHere; 
    
        // this tells the PageFactory to find the element with the id login-button and assign it to this field
        // you can also do (tagName = "button") and it would find the first button on the page
        @FindBy(id = "button")
        public WebElement submitButton;

        private WebDriver driver;
    
        public PageThree(WebDriver driver){
            /*
             * The PageFactory class is provided by Selenium and it abstracts away from us the code that handles initializing our WebElement fields.
             * We simply provide the initElements() method with the private driver we intialize above, and the PageFactory class handles the rest
             */
            PageFactory.initElements(driver, this);
        }
    

        public void enterInputHere (String inputText){
            for(ExpectedConditions.alertIsPresent()){
                Alert alertTesterLogout = driver.switchTo().alert();
                alertTesterLogout.accept();
            }
            this.inputHere.sendKeys(inputText);
        }

    
        // this method will make Selenium click on our login button
        public void submitInputButton(){
    
            // to click on an element, you just use the click() method
            this.submitButton.click();
        }

}
