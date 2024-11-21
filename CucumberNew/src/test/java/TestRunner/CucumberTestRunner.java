package TestRunner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		tags = "",
    features = "src/test/resources/Features", // Path to your feature files
    glue = "StepDefinitions", // Package where step definitions are located
    plugin = {"pretty", "html:target/htmlreport.html"}, // Reporting options
    monochrome = true // Console output readability
     // Specify tags if applicable
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
    // No additional code needed
}

