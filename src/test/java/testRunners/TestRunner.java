package testRunners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber-html-report"},
        features = {"src/test/resources/featureFiles/"},
        glue = {"stepDefinitions"}
        //tags = {"@Aregression"}
)
@Test
public class TestRunner extends AbstractTestNGCucumberTests {
}
