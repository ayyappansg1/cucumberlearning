package stepDefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class FacebookLogin {
WebDriver driver;
@Given("^user is on login page$")
public void user_is_on_login_page() throws Throwable {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}

@When("^user enter username \"([^\"]*)\"$")
public void user_enter_username(String username) throws Throwable {
	driver.findElement(By.id("email")).sendKeys(username);
}

@Given("^user is on login$")
public void user_is_on_login() throws Throwable {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}

@When("^user enter password as \"([^\"]*)\"$")
public void user_enter_password_as(String password) throws Throwable {
	driver.findElement(By.id("pass")).sendKeys(password);
}

	

}
