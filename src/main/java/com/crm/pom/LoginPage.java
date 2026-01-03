package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(name = "username")
    private WebElement username;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    @FindBy(xpath = "//p[contains(text(),'Forgot your password')]")
    private WebElement forgotPassword;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String data) {
        username.sendKeys(data);
    }

    public void enterPassword(String data) {
        password.sendKeys(data);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public void loginToApplication(String user, String pass) {
        enterUsername(user);
        enterPassword(pass);
        clickLogin();
    }

    public void clickForgotPassword() {
        forgotPassword.click();
    }
    
    public boolean isLoginButtonDisplayed() {
        return loginButton.isDisplayed();
    }

}
