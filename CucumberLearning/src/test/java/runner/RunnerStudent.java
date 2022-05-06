package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles/Background.feature",glue= {"stepDefinitions","hooks"},
					tags="@Background",monochrome=true)

public class RunnerStudent {

}
