package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import

import java.time.Duration;


public class LoginPage {
    public Util util;
    private WebDriver driver;
    public String inputUsername = "//input[@placeholder=\"Username\"]";
    public String inputPassword = "//input[@name=\"password\"]";
    public String buttonLogin = "//button[text()=\" Login \"]";
    public String textInvalidCredit = "//p[text()=\"Invalid credentials\"]";

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public WebElement getUserName(){
        return driver.findElement(By.xpath());

    }

    public WebElement getPassword(){
        return driver.findElement(By.xpath());

    }

    public WebElement getLoginButton(){
        return driver.findElement(By.xpath(buttonLogin));
    }

    public WebElement getErrorMessage(){
        return driver.findElement(By.xpath(textInvalidCredit));
    }

    public void waitForElementInSeconds(int seconds){
        
    }



}
