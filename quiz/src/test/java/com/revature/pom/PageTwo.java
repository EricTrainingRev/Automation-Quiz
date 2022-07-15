package com.revature.pom;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageTwo {

    private WebDriver driver;

    @FindBy(id = "one")
    public WebElement input;
    @FindBy(id = "two")
    public WebElement input2;
    @FindBy(id = "three")
    public WebElement input3;

    @FindBy(id = "four")
    public WebElement input4;
    @FindBy(id = "submit")
    public WebElement button;




    public PageTwo(WebDriver driver){
        this.driver = driver;


        PageFactory.initElements(driver, this);
    }


    //methods

    public void enterInput1(){
        this.input.sendKeys("input");
    }

    public void enterInput2(){
        this.input2.sendKeys("input");
    }

    public void enterInput3(){
        this.input3.sendKeys("input");
    }

    public void enterInput4(){
        this.input4.sendKeys("input");
    }

    public void clickButton(){
        this.button.click();
    }

    public void alert(){
        Alert alert = this.driver.switchTo().alert();
        Assert.assertTrue(alert.getText().contains("Success for page two"));
        alert.accept();

    }


    
}
