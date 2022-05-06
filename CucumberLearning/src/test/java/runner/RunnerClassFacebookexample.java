package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles/FacebookDataTablewithexample.feature",
						glue="stepDefinitions",
						strict=true,monochrome=true,
plugin= {"html:report/test.html","json:report/josntest.json","junit:report/sangar.xml"})



public class RunnerClassFacebookexample {
	

}
