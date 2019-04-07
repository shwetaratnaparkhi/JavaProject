package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//runner is used to handle feature files

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"FeatureFiles"},//give folder name in which feature files are available
		glue= {"Steps"}//give package name in which steps are written
		)

public class runner {

}
