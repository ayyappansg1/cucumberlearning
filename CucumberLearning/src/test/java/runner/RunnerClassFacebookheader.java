package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles/FacebookDataTablewithheader.feature",glue="stepDefinitions")

public class RunnerClassFacebookheader {
	

}
