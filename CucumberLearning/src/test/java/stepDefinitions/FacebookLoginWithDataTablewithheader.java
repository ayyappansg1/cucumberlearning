package stepDefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLoginWithDataTablewithheader {
WebDriver driver;
@Given("^user is on login page of fb home$")
public void user_is_on_login_page_of_fb_home() throws Throwable {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

}

@When("^user enter below credentials and to login click$")
public void user_enter_below_credentials_and_to_login_click(DataTable datatable) throws Throwable {
	
	List<Map<String,String>> asMaps = datatable.asMaps(String.class, String.class);
	String username = asMaps.get(0).get("username");
	String password = asMaps.get(0).get("password");
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).sendKeys(password);
	driver.findElement(By.name("login")).click();
}


}
