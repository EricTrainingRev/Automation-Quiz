package com.revature.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageTwo {
    private WebDriver driver;

    @FindBy(id = "one")
    public WebElement one;

    @FindBy(id = "two")
    public WebElement two;

    @FindBy(id = "three")
    public WebElement three;

    @FindBy(id = "four")
    public WebElement four;

    @FindBy(id = "submit")
    public WebElement submit;

    public PageTwo(WebDriver driver){
        this.driver = driver;   //This initializes private field

        //PageFactory from selenium, we provide the initElements() with the driver above 
        PageFactory.initElements(driver,this);
    }

    public void enterTextForOne(String textinput){
        this.one.sendKeys(textinput);
    }
    public void enterTextForTwo(String textinput){
        this.two.sendKeys(textinput);
    }
    public void enterTextForThree(String textinput){
        this.three.sendKeys(textinput);
    }
    public void enterTextForFour(String textinput){
        this.four.sendKeys(textinput);
    }
    public void clickSubmit(){
        this.submit.click();
    }
}
