package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackgroundDefi {
	@Given("^the student finshed school$")
	public void the_student_finshed_school() throws Throwable {
	System.out.println("Schooling is first");
	}

	@Given("^the student finished higher secondary$")
	public void the_student_finished_higher_secondary() throws Throwable {
		System.out.println("Schooling is second");
	
	}

	@Given("^the student apply council$")
	public void the_student_apply_council() throws Throwable {
		System.out.println("medical is first");
	
	}

	@When("^student clear Entrance$")
	public void student_clear_Entrance() throws Throwable {
		System.out.println("medical is second");

	}

	@Then("^student can join medical$")
	public void student_can_join_medical() throws Throwable {
		System.out.println("medical third");

	}

	@Given("^the student apply councilling$")
	public void the_student_apply_councilling() throws Throwable {
		System.out.println("engineering is first");

	}

	@When("^student sayable cutoff$")
	public void student_sayable_cutoff() throws Throwable {
		System.out.println("engineering is second");

	}

	@Then("^eligible for join engineering$")
	public void eligible_for_join_engineering() throws Throwable {
		System.out.println("engineering is third");
	}

}
