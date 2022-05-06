package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles/Thanos.feature",glue= {"stepDefinitions","hooks"},
monochrome=true)
public class RunnerHooks {

}
