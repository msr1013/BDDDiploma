import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

    public WebDriver createDriver(String driverName){
        switch (driverName.toLowerCase()){
            case "chrome":
                ChromeOptions options=new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                options.addArguments("--incognito");
                return new ChromeDriver(options);

            case "firefox":
                return new FirefoxDriver();

            case "in":
                return new InternetExplorerDriver();

            case "safari":
                return new SafariDriver();

            default:
                System.out.println("The driver you entered "+driverName+" is not identified by browser");
                break;
        }
        return null;
    }
}
