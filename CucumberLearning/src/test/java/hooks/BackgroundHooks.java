package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackgroundHooks {
@Before
public void beforeSnapping() {
	System.out.println("You has to birth before Everything");
}
@After
public void afterSnapping() {
	System.out.println("You has to die after everything");
}

}
