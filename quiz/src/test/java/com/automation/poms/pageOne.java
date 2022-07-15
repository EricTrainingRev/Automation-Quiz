package com.automation.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageOne{

    private WebDriver driver;
    @FindBy(id = "nameInput") 
    public WebElement usernameInput;

    @FindBy(id = "submitButton" )
    public WebElement loginButton;

    public pageOne(WebDriver driver){
       this.driver = driver; // this initializes the private driver field

       /*
           The PageFactory class is provided by Selenium and it abstracts away from us the code that handles
           initializing our WebElement fields. We simpply provide the initElements() method with the privite driver
           we initialize above, and the PageFactory class handles the rest!
        */
       PageFactory.initElements(driver,this);
    }

    /*
       these methods are public so we can access them in the steps, and their return type is void because 
       the functions do not return any values: they just interact with the web page
    */

    // this method will allow both managers and testers to enter their usernames
    public void enterUsername(String username){

       // to enter a username into the input element we use the sendKeys() method
       this.usernameInput.sendKeys(username);

    }

    public void clickButton(){

        // to click on an element you just use the click() method
        this.loginButton.click();
 
     }
 
}