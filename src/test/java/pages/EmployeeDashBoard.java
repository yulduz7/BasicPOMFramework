package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeDashBoard extends TestBase {

    public EmployeeDashBoard(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "page-title")
    public WebElement dashboardTitle;
    @FindBy (xpath="//li[@id='menu_admin_viewAdminModule']");


}
