package com.automation.poms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Submit {

     private WebDriver driver;

     @FindBy(id = "input") 
     public WebElement textInput;

     @FindBy(tagName = "button" )
     public WebElement submitButton;

     public Submit(WebDriver driver){
        this.driver = driver;

        PageFactory.initElements(driver,this);
     }

     public void enterName(String input){

        this.textInput.sendKeys(input);

     }

     public void clickButton(){

        this.submitButton.click();

     }

}