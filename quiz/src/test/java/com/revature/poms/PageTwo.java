package com.revature.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageTwo {
    private WebDriver driver;

    public PageTwo(WebDriver driver){
        this.driver = driver; // this initializes the private driver field
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="one")
    public WebElement one;

    @FindBy(id="two")
    public WebElement two;
    @FindBy(id="three")
    public WebElement three;
    @FindBy(id="four")
    public WebElement four;

    public void one(String one){

        // to enter a name into the input element we use sendKeys() 
        this.one.sendKeys(one);

    }
    public void two(String two){

        // to enter a name into the input element we use sendKeys() 
        this.two.sendKeys(two);

    }
    public void three(String three){

        // to enter a name into the input element we use sendKeys() 
        this.three.sendKeys(three);

    }
    public void four(String four){

        // to enter a name into the input element we use sendKeys() 
        this.four.sendKeys(four);

    }

    @FindBy(id="submit")
    public WebElement submit;

    public void submit(){
        this.submit.click();
    }
}
