package Runner;


import org.junit.runner.RunWith;
import StepDefinitions.BaseClass;
import Utility.ScreenCapture;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features/HomePage.feature",
		glue="StepDefinitions",
		dryRun=false,
	    plugin= {"pretty", "html:test-output" },
		monochrome=true
)
public class TestRunner  {

}
