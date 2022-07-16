package com.automationquizz.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class seleniumWait {
    private WebDriver driver;

    @FindBy (id="one")
   
    public WebElement Input;

    @FindBy (id="submit")
    public WebElement submitButton;


    
    public seleniumWait(WebDriver driver){
        this.driver = driver;
       
        PageFactory.initElements(driver,this);
}



    // public void clickButton() {
    // }



    public void submitButton() {
    }



    public void clickButton(String string){
        // to click on an element you just use for the click() method
        this.submitButton.click();
    }



    public void submitButton(String string) {
    }



    public void EnterText(String string) {
        this.Input.submit();
    }
}

