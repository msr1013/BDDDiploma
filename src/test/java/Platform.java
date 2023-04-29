import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import pageObject.DashboardPage;
import pageObject.LoginPage;

public class Platform {


    public WebDriver driver;

    private LoginPage loginPage;

    private Util util;
    private DashboardPage dashboardPage;
    private DriverFactory driverFactory;

    public Platform(){
        driverFactory= new DriverFactory();
        driver=driverFactory.createDriver("CHROME");
        if (driver!=null){
            util=new Util();
            util.myImplicitWait(driver,15);
            loginPage=new LoginPage(driver);
            dashboardPage= new DashboardPage(driver);
        }
        else {
            System.out.println("Driver value you sent is invalid");
        }


    }

    public WebDriver getDriver(){
        return driver;
    }

    public void waitForElementInSeconds(int seconds){
        try {
            // Code to be executed by the thread goes here
            Thread.sleep(5000); // Simulate some work being done
            System.out.println("Thread finished work");
        } catch (InterruptedException e) {
            // Handle the exception if the thread is interrupted while sleeping
            e.printStackTrace();
        }
    }

    public void hitURL(String urlValue){
        driver.get(urlValue);
    }


    public void loginToApplication (String username,String password){
        loginPage.getUserName().sendKeys("Admin");
        loginPage.getPassword().sendKeys("admin123");
        loginPage.getLoginButton().click();
        waitForElementInSeconds(5);
    }

    public void verifyErrorMessageInLoginPage(String expectedMessage){
        String textName = loginPage.getErrorMessage().getText();
        Assert.assertEquals(expectedMessage,textName);
    }

    public void clickOnLink(String linkValue){
        dashboardPage.getDashboardElement();
    }

    public void validateLandingPage(){

            String textName = dashboardPage.getDashboardElement().getText();
            Assert.assertEquals(pageName,textName);


    }




}
