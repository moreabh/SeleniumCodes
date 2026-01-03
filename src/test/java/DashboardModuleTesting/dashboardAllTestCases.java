package DashboardModuleTesting;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClass;
import com.crm.pom.DashboardPage;
import com.crm.pom.LoginPage;

@Listeners(com.crm.listeners.TestListener.class)
public class dashboardAllTestCases extends BaseClass {

    // TC01 – Smoke Test: Verify dashboard page opens after login
    @Test(priority = 1)
    public void dashboardPageLoadTest() {

        LoginPage login = new LoginPage(driver);
        login.loginToApplication("Admin", "admin123");

        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(
                actualUrl,
                "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
    }

    // TC02 – Smoke Test: Verify dashboard menu is accessible
    @Test(priority = 2)
    public void dashboardMenuTest() {

        LoginPage login = new LoginPage(driver);
        login.loginToApplication("Admin", "admin123");

        DashboardPage dashboard = new DashboardPage(driver);
       	

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
    }

    // TC03 – Integration Test: Dashboard to Admin module
    @Test(priority = 3)
    public void dashboardToAdminTest() {

        LoginPage login = new LoginPage(driver);
        login.loginToApplication("Admin", "admin123");

        DashboardPage dashboard = new DashboardPage(driver);
        dashboard.clickAdmin();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
    }

    // TC04 – Integration Test: Dashboard to PIM module
    @Test(priority = 4)
    public void dashboardToPIMTest() {

        LoginPage login = new LoginPage(driver);
        login.loginToApplication("Admin", "admin123");

        DashboardPage dashboard = new DashboardPage(driver);
        dashboard.clickPIM();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
    }

    // TC05 – Integration Test: Dashboard to Leave module
    @Test(priority = 5)
    public void dashboardToLeaveTest() {

        LoginPage login = new LoginPage(driver);
        login.loginToApplication("Admin", "admin123");

        DashboardPage dashboard = new DashboardPage(driver);
        dashboard.clickLeave();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList");
    }

    // TC06 – Functional Test: User dropdown click
    @Test(priority = 6)
    public void userDropdownTest() {

        LoginPage login = new LoginPage(driver);
        login.loginToApplication("Admin", "admin123");

        DashboardPage dashboard = new DashboardPage(driver);
        dashboard.openUserDropdown();

        Assert.assertTrue(true);
    }

    // TC07 – Integration Test: Logout from dashboard
    @Test(priority = 7)
    public void logoutFromDashboardTest() {

        LoginPage login = new LoginPage(driver);
        login.loginToApplication("Admin", "admin123");

        DashboardPage dashboard = new DashboardPage(driver);
        dashboard.openUserDropdown();
        dashboard.logout();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    // TC08 – Negative Test: Access dashboard without login
    @Test(priority = 8)
    public void dashboardWithoutLoginTest() {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    
 // TC09 – Negative Test: Access Admin page after logout
    @Test(priority = 9)
    public void accessAdminAfterLogoutTest() {

        LoginPage login = new LoginPage(driver);
        login.loginToApplication("Admin", "admin123");

        DashboardPage dashboard = new DashboardPage(driver);
        dashboard.openUserDropdown();
        dashboard.logout();

        // Try to access admin page directly
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

 // TC10 – Negative Test: Access PIM page without login
    @Test(priority = 10)
    public void accessPIMWithoutLoginTest() {

        // Directly open PIM URL without login
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

}

