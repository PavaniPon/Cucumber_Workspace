package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Test 
{
	@Given("Enter Facebook site url")
	public void enter_facebook_site_url() 
	{
	   System.out.println("Facebook page is opened");
	}
	@When("User enter valid username and password")
	public void user_enter_valid_username_and_password() 
	{
	   System.out.println("Valid username and password entered");
	}
	@When("click on Login button")
	public void click_on_login_button() 
	{
	    System.out.println("Login button is clicked");
	}
	@Then("verify LogIn successful message display")
	public void verify_log_in_successful_message_display() 
	{
		System.out.println("LogIn successful message is displayed");
	}

}
