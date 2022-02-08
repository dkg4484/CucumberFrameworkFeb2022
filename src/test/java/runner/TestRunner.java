package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "./src/test/resources/featureFile/amazon.feature", // To set the path of the feature file location
		glue = "stepDefinition", // Step defintion package Name
		dryRun = false, // if dryRun is true it will not allow us to execute the scripts instead it will
						// compare feature file steps with the Step definition steps. And also if there
						// is a missing snippets it will generate those steps in the failure trace
						// through Junit
		monochrome = true, // It will remove unwanted symbols from the console report
		plugin = { "pretty", "html:HTML_OP/op.html", "junit:JUNIT_OP/op.xml", "json:JSON_OP/op.json" }, // To generate
																										// the
		tags = "@SignIn" // To choose particular scenario from the feature file // different reports

)

public class TestRunner {

}
