package tests;

import base.TestBase;
import org.testng.annotations.BeforeMethod;
import pages.EmployeeDashBoard;
import pages.HomePage;

public class EmployeeDashboardTest extends TestBase {
    EmployeeDashBoard employeeDashBoard;
    HomePage homePage;

    @BeforeMethod
    public void setUp(){
        initializer();
        homePage=new HomePage();
        employeeDashBoard=new EmployeeDashBoard();

    }

}
