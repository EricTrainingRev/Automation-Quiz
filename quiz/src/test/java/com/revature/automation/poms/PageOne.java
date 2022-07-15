package com.revature.automation.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageOne {
    private WebDriver driver;

    @FindBy(id = "randomString")
    public WebElement randomString;

    @FindBy(id = "nameInput")
    public WebElement nameInput;

    @FindBy(id = "submitButton")
    public WebElement submitButton;

    public PageOne(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void getRandomString(String randomString) {
        this.randomString.getText();
    }

    public void enterName(String name) {
        this.nameInput.sendKeys(name);
    }

    public void clickSubmitButton() {
        this.submitButton.click();
    }

    public void get(String string) {
    }


    
}
