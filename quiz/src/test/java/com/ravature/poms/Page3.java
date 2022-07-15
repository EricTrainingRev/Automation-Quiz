package com.ravature.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page3 {
    @FindBy(id = "input")
    public WebElement input;

    @FindBy(id = "button")
    public WebElement button;

    public Page3(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void enterInput(String input){
        this.input.sendKeys(input);
    }

    public void clickButton3(){
        this.button.click();
    }

}
