import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.annotations.BeforeTest;


public class StepDefinitions {
    public Platform platform;

    @Before
    public void init(){
        platform=new Platform();
    }

    @After
    public void tearDown() {platform.getDriver().quit();}


    @And("User opens google")
    void sumTest(){
        platform.hitURL("https://www.google.com");
    }

    @And("^user enters username (.*) and password admin123$")
    public void loginToOrangeHrm(String username,String password){
        loginPage.loginToApplication(username,password);
    }


    @And()



}
