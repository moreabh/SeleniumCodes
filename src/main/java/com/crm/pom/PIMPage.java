package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPage {

    @FindBy(xpath = "//span[text()='PIM']")
    private WebElement pimMenu;

    @FindBy(xpath = "//a[text()='Add Employee']")
    private WebElement addEmployee;

    @FindBy(xpath = "//a[text()='Employee List']")
    private WebElement employeeList;

    @FindBy(name = "firstName")
    private WebElement firstName;

    @FindBy(name = "lastName")
    private WebElement lastName;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement saveButton;

    @FindBy(xpath = "//button[text()=' Search ']")
    private WebElement searchButton;

    public PIMPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickPIMMenu() {
        pimMenu.click();
    }

    public void clickAddEmployee() {
        addEmployee.click();
    }

    public void clickEmployeeList() {
        employeeList.click();
    }

    public void enterFirstName(String fname) {
        firstName.sendKeys(fname);
    }

    public void enterLastName(String lname) {
        lastName.sendKeys(lname);
    }

    public void clickSave() {
        saveButton.click();
    }

    public void clickSearch() {
        searchButton.click();
    }
}
