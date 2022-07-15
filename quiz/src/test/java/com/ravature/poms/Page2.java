package com.ravature.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page2 {
    @FindBy(id = "one")
    public WebElement one;

    @FindBy(id = "two")
    public WebElement two;

    @FindBy(id = "three")
    public WebElement three;

    @FindBy(id = "four")
    public WebElement four;


    @FindBy(id = "submit")
    public WebElement submitButton;

    public Page2(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void enterInputOne(String stringone){
        this.one.sendKeys(stringone);
    }
    
    public void enterInputTwo(String stringtwo){
        this.two.sendKeys(stringtwo);
    }
    
    public void enterInputThree(String stringthree){
        this.three.sendKeys(stringthree);
    }
    
    public void enterInputFour(String stringfour){
        this.four.sendKeys(stringfour);
    }

    public void submitButton(){
        this.submitButton.click();
    }

    
}

   
    

