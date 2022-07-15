package com.automation.poms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Submit {

     private WebDriver driver;

     @FindBy(id = "one") 
     public WebElement inputOne;

     @FindBy(id = "two") 
     public WebElement inputTwo;

     @FindBy(id = "three") 
     public WebElement inputThree;

     @FindBy(id = "four") 
     public WebElement inputFour;

     @FindBy(tagName = "submit" )
     public WebElement submitButton;

     public Submit(WebDriver driver){
        this.driver = driver;

        PageFactory.initElements(driver,this);
     }

     public void enterInputOne(String one){

        this.inputOne.sendKeys(one);

     }

     public void enterInputTwo(String two){

        this.inputTwo.sendKeys(two);

     }

     public void enterInputThree(String three){

        this.inputThree.sendKeys(three);

     }

     public void enterInputFour(String four){

        this.inputFour.sendKeys(four);

     }

     public void clickButton(){

        this.submitButton.click();

     }

}