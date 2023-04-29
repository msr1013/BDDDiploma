package pageObject;

import org.openqa.selenium.WebDriver;

public class AdminPage {

    public WebDriver driver;

    public String userManagementPageTitle = "//h6";



    public AdminPage(WebDriver driver){
        this.driver=driver;
    }
}
