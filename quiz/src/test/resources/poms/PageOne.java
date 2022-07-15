package com.automation.poms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Submit {

     private WebDriver driver;

     @FindBy(id = "nameInput") 
     public WebElement nameInput;

     @FindBy(tagName = "submitButton" )
     public WebElement submitButton;

     public Submit(WebDriver driver){
        this.driver = driver;

        PageFactory.initElements(driver,this);
     }

     public void enterName(String name){

        this.nameInput.sendKeys(name);

     }

     public void clickButton(){

        this.submitButton.click();

     }

}