package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles/Facebook.feature",glue="stepDefinitions",
		monochrome=true,dryRun=true,
					tags= {"@Simple","@Sangar"}
					)

public class RunnerClass {
	

}
