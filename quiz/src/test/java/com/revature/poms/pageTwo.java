package com.revature.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageTwo {
    private WebDriver driver;    
    @FindBy(id = "one") 
    public WebElement FirstInput;


    @FindBy(id = "two") 
    public WebElement SecondInput;

        
    @FindBy(id = "three") 
    public WebElement ThirdInput;
    
    @FindBy(id = "four") 
    public WebElement FourthInput;

    @FindBy(id = "submit" )
    public WebElement loginButton;

    public pageTwo(WebDriver driver){
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
    public void enterFirstInput(String ms1){

       // to enter a username into the input element we use the sendKeys() method
       this.FirstInput.sendKeys("Test1");

    }
    public void enterSecondInput(String msg2){

        // to enter a username into the input element we use the sendKeys() method
        this.SecondInput.sendKeys(msg2);
 
     }
     public void enterThirdInput(String msg3){

        // to enter a username into the input element we use the sendKeys() method
        this.ThirdInput.sendKeys(msg3);
 
     }
     public void enterFourthInput(String msg4){

        // to enter a username into the input element we use the sendKeys() method
        this.FourthInput.sendKeys(msg4);
 
     }
   
     public void clickButton(){

        // to click on an element you just use the click() method
        this.loginButton.click();
 
     }
 
}
