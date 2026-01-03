package PIMModuleTesting;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.listeners.BaseClass;
import com.crm.listeners.TestListener;
import com.crm.pom.LoginPage;
import com.crm.pom.PIMPage;

@Listeners(TestListener.class)
public class PIMAllTestsCases extends BaseClass {

    // Smoke Test
    @Test(priority = 1)
    public void openPIMModuleTest() {

        LoginPage login = new LoginPage(driver);
        login.loginToApplication("Admin", "admin123");

        PIMPage pim = new PIMPage(driver);
        pim.clickPIMMenu();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
    }

    // Smoke Test
    @Test(priority = 2)
    public void openEmployeeListTest() {

        LoginPage login = new LoginPage(driver);
        login.loginToApplication("Admin", "admin123");

        PIMPage pim = new PIMPage(driver);
        pim.clickPIMMenu();
        pim.clickEmployeeList();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
    }

    // Smoke Test
    @Test(priority = 3)
    public void openAddEmployeePageTest() {

        LoginPage login = new LoginPage(driver);
        login.loginToApplication("Admin", "admin123");

        PIMPage pim = new PIMPage(driver);
        pim.clickPIMMenu();
        pim.clickAddEmployee();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/pim/addEmployee");
    }

    // Integration Test
    @Test(priority = 4)
    public void addEmployeeWithBasicDetailsTest() {

        LoginPage login = new LoginPage(driver);
        login.loginToApplication("Admin", "admin123");

        PIMPage pim = new PIMPage(driver);
        pim.clickPIMMenu();
        pim.clickAddEmployee();
        pim.enterFirstName("Test");
        pim.enterLastName("User");
        pim.clickSave();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails");
    }

    // Negative Test
    @Test(priority = 5)
    public void saveEmployeeWithoutDetailsTest() {

        LoginPage login = new LoginPage(driver);
        login.loginToApplication("Admin", "admin123");

        PIMPage pim = new PIMPage(driver);
        pim.clickPIMMenu();
        pim.clickAddEmployee();
        pim.clickSave();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/pim/addEmployee");
    }

    // Functional Test
    @Test(priority = 6)
    public void searchEmployeeTest() {

        LoginPage login = new LoginPage(driver);
        login.loginToApplication("Admin", "admin123");

        PIMPage pim = new PIMPage(driver);
        pim.clickPIMMenu();
        pim.clickEmployeeList();
        pim.clickSearch();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
    }

    // Integration Test
    @Test(priority = 7)
    public void navigateBetweenAddAndListTest() {

        LoginPage login = new LoginPage(driver);
        login.loginToApplication("Admin", "admin123");

        PIMPage pim = new PIMPage(driver);
        pim.clickPIMMenu();
        pim.clickAddEmployee();
        pim.clickEmployeeList();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
    }

    // Negative Test
    @Test(priority = 8)
    public void openPIMWithoutLoginTest() {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    // Negative Test
    @Test(priority = 9)
    public void openAddEmployeeWithoutLoginTest() {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/addEmployee");

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    // Functional Test
    @Test(priority = 10)
    public void refreshPIMPageTest() {

        LoginPage login = new LoginPage(driver);
        login.loginToApplication("Admin", "admin123");

        driver.navigate().refresh();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
    }
}
