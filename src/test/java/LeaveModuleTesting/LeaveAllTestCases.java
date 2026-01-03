package LeaveModuleTesting;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClass;
import com.crm.pom.LeavePage;
import com.crm.pom.LoginPage;

@Listeners(com.crm.listeners.TestListener.class)
public class LeaveAllTestCases extends BaseClass {

    // Smoke Test
    @Test(priority = 1)
    public void openLeaveModuleTest() {

        LoginPage login = new LoginPage(driver);
        login.loginToApplication("Admin", "admin123");

        LeavePage leave = new LeavePage(driver);
        leave.clickLeaveMenu();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList");
    }

    // Smoke Test
    @Test(priority = 2)
    public void openApplyLeaveTest() {

        LoginPage login = new LoginPage(driver);
        login.loginToApplication("Admin", "admin123");

        LeavePage leave = new LeavePage(driver);
        leave.clickLeaveMenu();
        leave.clickApplyLeave();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/leave/applyLeave");
    }

    // Integration Test
    @Test(priority = 3)
    public void openLeaveListTest() {

        LoginPage login = new LoginPage(driver);
        login.loginToApplication("Admin", "admin123");

        LeavePage leave = new LeavePage(driver);
        leave.clickLeaveMenu();
        leave.clickLeaveList();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList");
    }

    // Integration Test
    @Test(priority = 4)
    public void openAssignLeaveTest() {

        LoginPage login = new LoginPage(driver);
        login.loginToApplication("Admin", "admin123");

        LeavePage leave = new LeavePage(driver);
        leave.clickLeaveMenu();
        leave.clickAssignLeave();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/leave/assignLeave");
    }

    // Integration Test
    @Test(priority = 5)
    public void openMyLeaveTest() {

        LoginPage login = new LoginPage(driver);
        login.loginToApplication("Admin", "admin123");

        LeavePage leave = new LeavePage(driver);
        leave.clickLeaveMenu();
        leave.clickMyLeave();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewMyLeaveList");
    }

    // Functional Test
    @Test(priority = 6)
    public void searchLeaveWithDatesTest() {

        LoginPage login = new LoginPage(driver);
        login.loginToApplication("Admin", "admin123");

        LeavePage leave = new LeavePage(driver);
        leave.clickLeaveMenu();
        leave.enterFromDate("2024-01-01");
        leave.enterToDate("2024-12-31");
        leave.clickSearch();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList");
    }

    // Functional Test
    @Test(priority = 7)
    public void resetLeaveSearchTest() {

        LoginPage login = new LoginPage(driver);
        login.loginToApplication("Admin", "admin123");

        LeavePage leave = new LeavePage(driver);
        leave.clickLeaveMenu();
        leave.clickReset();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList");
    }

    // Negative Test
    @Test(priority = 8)
    public void openLeaveModuleWithoutLoginTest() {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList");

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    // Negative Test
    @Test(priority = 9)
    public void openApplyLeaveWithoutLoginTest() {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/leave/applyLeave");

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    // Negative Test
    @Test(priority = 10)
    public void openAssignLeaveWithoutLoginTest() {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/leave/assignLeave");

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
}

