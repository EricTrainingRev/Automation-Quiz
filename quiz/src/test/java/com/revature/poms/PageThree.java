package com.revature.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageThree {
    private WebDriver driver;

    @FindBy(id = "input")
    public WebElement input;

    @FindBy(id = "button")
    public WebElement button;

    public PageThree(WebDriver driver){
        this.driver = driver;   //This initializes private field

        //PageFactory from selenium, we provide the initElements() with the driver above 
        PageFactory.initElements(driver,this);
    }

    public void enterString(){
        this.input.sendKeys("nAbEWyAJeVvCXjqHbcBSSiH5j37Pp63VubtOZAX9xUlj5qS2456oitsQxge3lMYHmhysaC4gPwNQRAKNrm4FTu4pudxrpCKVvEONq");

    }
    public void clickButton(){
        this.button.click();
    }
}
