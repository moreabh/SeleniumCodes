package LoginModuleTesting;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClass;
import com.crm.pom.DashboardPage;
import com.crm.pom.LoginPage;

@Listeners(com.crm.listeners.TestListener.class)
public class LoginAllTests extends BaseClass {

    @Test(priority = 1)
    public void validLoginTest() {

        LoginPage login = new LoginPage(driver);
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
    }

    @Test(priority = 2)
    public void loginButtonTest() {

        LoginPage login = new LoginPage(driver);
        login.clickLogin();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test(priority = 3)
    public void loginDashboardIntegrationTest() {

        LoginPage login = new LoginPage(driver);
        login.loginToApplication("Admin", "admin123");

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
    }

    @Test(priority = 4)
    public void loginLogoutIntegrationTest() {

        LoginPage login = new LoginPage(driver);
        login.loginToApplication("Admin", "admin123");

        DashboardPage dashboard = new DashboardPage(driver);
        dashboard.openUserDropdown();
        dashboard.logout();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test(priority = 5)
    public void invalidPasswordTest() {

        LoginPage login = new LoginPage(driver);
        login.enterUsername("Admin");
        login.enterPassword("wrong123");
        login.clickLogin();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test(priority = 6)
    public void emptyCredentialsTest() {

        LoginPage login = new LoginPage(driver);
        login.clickLogin();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test(priority = 7)
    public void loginPageTitleTest() {

        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }

    @Test(priority = 8)
    public void usernameFieldTest() {

        LoginPage login = new LoginPage(driver);
        login.enterUsername("Admin");

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test(priority = 9)
    public void passwordFieldTest() {

        LoginPage login = new LoginPage(driver);
        login.enterPassword("admin123");

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test(priority = 10)
    public void completeLoginFlowTest() {

        LoginPage login = new LoginPage(driver);
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

        Assert.assertEquals(
                driver.getCurrentUrl(),
                "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
    }
}
