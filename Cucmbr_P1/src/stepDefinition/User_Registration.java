package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class User_Registration 
{
	@When("User enter valid mobile number")
	public void user_enter_valid_mobile_number() 
	{
		System.out.println("Valid mobile number entered");
	    
	}
	
	@When("Wait for OTP")
	public void wait_for_otp() 
	{
	    System.out.println("Time out for OTP to generate");
	}
	
	@When("Enter valid OTP")
	public void enter_valid_otp() 
	{
	   System.out.println("OTP is entered");
	}
	
	@When("Click on create account button")
	public void click_on_create_account_button()
	{
		System.out.println("Create account button clicked");
	    
	}
	@Then("Verify registration successful message displayed")
	public void verify_registration_successful_message_displayed() 
	{
	    System.out.println("Registration successful message displayed");
	}

}
