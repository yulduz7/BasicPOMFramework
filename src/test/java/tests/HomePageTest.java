package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EmployeeDashBoard;
import pages.HomePage;
import utils.SeleniumUtils;

public class HomePageTest extends TestBase {
    HomePage homePage;
    EmployeeDashBoard employeeDashBoard;

    @BeforeMethod
    public void setUp(){
        initializer();
        homePage=new HomePage();
        employeeDashBoard=new EmployeeDashBoard();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void verifyHomeTitle(){
        SeleniumUtils.waitForVisibilityOfElement(homePage.login_btn);
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }
    @Test
    public void testLogihBtn(){
        SeleniumUtils.click(homePage.login_btn);
        String expectedTitle="Dashboard";
        Assert.assertEquals(SeleniumUtils.getText(employeeDashBoard.dashboard), expectedTitle);

    }

}
