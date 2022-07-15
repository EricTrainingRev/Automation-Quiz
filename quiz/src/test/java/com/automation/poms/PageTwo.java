package com.automation.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageTwo {
    
    private WebDriver driver;

    @FindBy(id = "one")
    public WebElement firstInput;
    @FindBy(id = "two")
    public WebElement secondInput;
    @FindBy(id = "three")
    public WebElement thirdInput;
    @FindBy(id = "four")
    public WebElement fourthInput;
    @FindBy(id = "submit")
    public WebElement button;
    @FindBy(tagName = "alert")
    public WebElement alert;


    public PageTwo(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void enterFirstField(String one){
        this.firstInput.sendKeys(one);
    }

    public void enterSecondField(String two){
        this.secondInput.sendKeys(two);
    }

    public void enterThirdField(String three){
        this.thirdInput.sendKeys(three);
    }

    public void enterFourthField(String four){
        this.fourthInput.sendKeys(four);
    }

    public void clickButton(){
        this.button.click();
    }

    public void alert() {
        driver.switchTo().alert().accept();
    }
     
}