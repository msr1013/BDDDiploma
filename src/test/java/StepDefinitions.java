import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import pageObject.LoginPage;

public class StepDefinitions {
    public Platform platform;
    public LoginPage loginPage;

    @Before
    public void init() {
        platform = new Platform();
        loginPage = new LoginPage(platform.getDriver());
    }

    @After
    public void tearDown() {
        platform.getDriver().quit();
    }

    @Given("user opens orange hrm website")
    public void user_opens_orange_hrm_website() {
        // Write code here that opens the Orange HRM website
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Given("user opens the browser")
    public void user_opens_the_browser() {
        // Write code here that opens the browser
        WebDriver driver = new ChromeDriver();
    }



    @And("User opens orangehrm")
    void sumTest() {
        platform.hitURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @And("^user enters username (.*) and password admin123$")
    public void loginToOrangeHrm(String username, String password) {
        loginPage.loginToApplication(username, password);
    }
}
