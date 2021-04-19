package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFunctionality {
	System.setProperty("webdriver.chrome.driver","/Users/Gurjit/Desktop/chromedriver");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	
	
	@Given("user is in homepage")
	public void user_is_in_homepage() {
		
	}

	@When("user click the profile button")
	public void user_click_the_profile_button() {

	}

	@Then("user should see new profile buttons")
	public void user_should_see_new_profile_buttons() {
	 
	}

}
