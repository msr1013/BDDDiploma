import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Util {

    public void myImplicitWait(WebDriver driver,int timeInSeconds){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public WebElement myExplicitWait(WebDriver driver,WebElement webElement,int timeInSeconds){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        return wait.until(ExpectedConditions.visibilityOf(webElement));
    }
}
