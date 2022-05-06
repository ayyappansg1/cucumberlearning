package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ThanosStepDefinitions {
	@Given("^This is first Step$")
	public void this_is_first_Step() throws Throwable {
		System.out.println("First Step");
		}

	@When("^This is Second Step$")
	public void this_is_Second_Step() throws Throwable {
		System.out.println("Second Step");
	}

	@Then("^This is Third Step$")
	public void this_is_Third_Step() throws Throwable {
		System.out.println("Third Step");
	}
}
