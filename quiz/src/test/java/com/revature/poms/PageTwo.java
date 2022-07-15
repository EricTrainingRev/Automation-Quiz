package com.revature.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.revature.runner.TestRunner;

public class PageTwo {

    private WebDriver driver;

    @FindBy(id = "one")
    public WebElement inputOne;
    @FindBy(id = "two")
    public WebElement inputTwo;
    @FindBy(id = "three")
    public WebElement inputThree;
    @FindBy(id = "four")
    public WebElement inputFour;
    @FindBy(id = "submit")
    public WebElement submitButton;


    public PageTwo(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void enterOne(String s){
        this.inputOne.sendKeys(s);
    }

    public void enterTwo(String s){
        this.inputTwo.sendKeys(s);
    }

    public void enterThree(String s){
        this.inputThree.sendKeys(s);
    }

    public void enterFour(String s){
        this.inputFour.sendKeys(s);
    }

    public void clickButton(){
        this.submitButton.click();
    }

    
}
