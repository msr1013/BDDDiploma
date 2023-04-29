package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {
    public String textDashboard = "//h6[text()=\"Dashboard\"]";

    public String linkAdmin = "//span[text()='%s']";

    private WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver=driver;
    }

    public WebElement getDashboardElement(){
        return driver.findElement(By.xpath(textDashboard));
    }

    public WebElement getLeftNavigationLink(String linkText){
        return driver.findElement(By.xpath(linkText.replace("%s",linkText)));
    }


}
