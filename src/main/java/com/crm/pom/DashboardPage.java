package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    @FindBy(xpath = "//input[@placeholder='Search']")
    private WebElement searchInput;

    @FindBy(xpath = "//button[@title='Assign Leave']")
    private WebElement assignLeave;

    @FindBy(xpath = "//button[@title='Leave List']")
    private WebElement leaveList;

    @FindBy(xpath = "//button[@title='Apply Leave']")
    private WebElement applyLeave;

    @FindBy(xpath = "//button[@title='My Leave']")
    private WebElement myLeave;

    @FindBy(xpath = "//button[@title='My Timesheet']")
    private WebElement myTimesheet;

    @FindBy(css = ".oxd-icon-button--warn.orangehrm-report-icon")
    private WebElement approveTimesheet;

    @FindBy(xpath = "//span[text()='Admin']")
    private WebElement adminMenu;

    @FindBy(xpath = "//span[text()='PIM']")
    private WebElement pimMenu;

    @FindBy(xpath = "//span[text()='Leave']")
    private WebElement leaveMenu;

    @FindBy(xpath = "//span[text()='Time']")
    private WebElement timeMenu;

    @FindBy(xpath = "//span[text()='Recruitment']")
    private WebElement recruitmentMenu;

    @FindBy(xpath = "//span[text()='My Info']")
    private WebElement myInfoMenu;

    @FindBy(xpath = "//span[text()='Dashboard']")
    private WebElement dashboardMenu;

    @FindBy(xpath = "//span[text()='Directory']")
    private WebElement directoryMenu;

    @FindBy(xpath = "//span[text()='Maintenance']")
    private WebElement maintenanceMenu;

    @FindBy(xpath = "//span[text()='Claim']")
    private WebElement claimMenu;

    @FindBy(xpath = "//span[text()='Buzz']")
    private WebElement buzzMenu;

    @FindBy(className = "oxd-userdropdown-name")
    private WebElement userDropdown;

    @FindBy(xpath = "//a[text()='Logout']")
    private WebElement logout;

    @FindBy(css = ".oxd-glass-button.orangehrm-upgrade-button")
    private WebElement upgradeButton;

    public DashboardPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickAdmin() {
        adminMenu.click();
    }

    public void openUserDropdown() {
        userDropdown.click();
    }

    public void logout() {
        logout.click();
    }

    public boolean isDashboardVisible() {
        return dashboardMenu.isDisplayed();
    }

    public void dashboardMenu() {
        dashboardMenu.click();
    }
    
    public void clickPIM() {
        pimMenu.click();
    }

    public void clickLeave() {
        leaveMenu.click();
    }

}
