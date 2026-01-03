package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage {

    // Leave main menu
    @FindBy(xpath = "//span[text()='Leave']")
    private WebElement leaveMenu;

    // Sub menu items
    @FindBy(xpath = "//a[text()='Apply']")
    private WebElement applyLeave;

    @FindBy(xpath = "//a[text()='Leave List']")
    private WebElement leaveList;

    @FindBy(xpath = "//a[text()='Assign Leave']")
    private WebElement assignLeave;

    @FindBy(xpath = "//a[text()='My Leave']")
    private WebElement myLeave;

    // Leave List filters
    @FindBy(xpath = "//input[@placeholder='From Date']")
    private WebElement fromDate;

    @FindBy(xpath = "//input[@placeholder='To Date']")
    private WebElement toDate;

    // Buttons
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchButton;

    @FindBy(xpath = "//button[text()=' Reset ']")
    private WebElement resetButton;

    public LeavePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickLeaveMenu() {
        leaveMenu.click();
    }

    public void clickApplyLeave() {
        applyLeave.click();
    }

    public void clickLeaveList() {
        leaveList.click();
    }

    public void clickAssignLeave() {
        assignLeave.click();
    }

    public void clickMyLeave() {
        myLeave.click();
    }

    public void enterFromDate(String date) {
        fromDate.sendKeys(date);
    }

    public void enterToDate(String date) {
        toDate.sendKeys(date);
    }

    public void clickSearch() {
        searchButton.click();
    }

    public void clickReset() {
        resetButton.click();
    }
}
