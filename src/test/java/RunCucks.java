import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"StepDefinitions"},
        tags = "@smoke and @regression",plugin = "json:target/cucumber-reports/CucumberTestReport.json")
public class RunCucks {
}
