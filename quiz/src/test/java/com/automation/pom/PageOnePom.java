package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageOnePom {
    @FindBy(id = "nameInput")
    public WebElement usernameInput;

    @FindBy(id =  "submitButton")
    public WebElement submitButton;

    @FindBy(id = "one")
    public WebElement one;
    @FindBy(id = "two")
    public WebElement entertexttwotwo;
    @FindBy(id = "three")
    public WebElement entertexttwothree;
    @FindBy(id = "four")
    public WebElement entertexttwofour;

    @FindBy(id =  "submit")
    public WebElement submitButtontwo;
    




    public PageOnePom(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username) {
        usernameInput.sendKeys(username);
    }

    public void one(String text) {
        one.sendKeys(text);
    }
    public void entertexttwotwo(String username) {
        entertexttwotwo.sendKeys(username);
    }
    public void entertexttwothree(String username) {
        entertexttwothree.sendKeys(username);
    }
    public void entertexttwofour(String username) {
        entertexttwofour.sendKeys(username);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }
    public void submione() {
        submitButtontwo.click();
    }
}
