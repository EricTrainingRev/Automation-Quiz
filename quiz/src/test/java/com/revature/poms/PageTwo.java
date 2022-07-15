package com.revature.poms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageTwo {
    
private WebDriver driver;

@FindBy (id = "one")
public WebElement oneInput;

@FindBy (id = "two")
public WebElement twoInput;

@FindBy (id = "three")
public WebElement threeInput;

@FindBy (id = "four")
public WebElement fourInput;

@FindBy(tagName = "button")
public WebElement submitButton;

public PageTwo(WebDriver driver){
    this.driver = driver;

    PageFactory.initElements(driver, this);
}

public void enterOne(String one){
    this.oneInput.sendKeys(one);
}

public void enterTwo(String two){
    this.twoInput.sendKeys(two);
}

public void enterThree(String three){
    this.threeInput.sendKeys(three);
}

public void enterFour(String four){
    this.fourInput.sendKeys(four);
}

public void clickButton(){
    this.submitButton.click();
}



}
