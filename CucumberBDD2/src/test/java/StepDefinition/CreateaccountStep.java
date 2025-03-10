package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateaccountStep {
	@Given("I navigate to the home page")
	public void i_navigate_to_the_home_page() {
	    System.out.println("navigated to home page");
	}

	@When("I click the create-account button")
	public void i_click_the_create_account_button() {
	    System.out.println("clicked account creation button");
	}

	@When("enter {string} in the Fullname field")
	public void enter_in_the_fullname_field(String string) {
	   System.out.println("Fullname entered");
	}

	@When("enter {string} in the rediffmailid field")
	public void enter_in_the_rediffmailid_field(String string) {
	    System.out.println("Rediffmailid enterd");
	}
	
	@When("enter {string} in the password field")
	public void enter_in_the_password_field(String string) {
	    System.out.println("Typed password");
	}

	@When("enter {string} in the retype field")
	public void enter_in_the_retype_field(String string) {
	    System.out.println("Retyped password");
	}

	@When("enter {string} in the alternate email field")
	public void enter_in_the_alternate_email_field(String string) {
	   System.out.println("Alternate mail id entered");
	}

	@When("enter {string} in the mobile number field")
	public void enter_in_the_mobile_number_field(String string) {
	    System.out.println("Mobile number entered");
	}

	@When("choose date of birth")
	public void choose_date_of_birth() {
	    System.out.println("Date of birth choosen");
	}
	@When("choose I live  in")
	public void choose_i_live_in() {
	    System.out.println("I live in choosen");
	}

	@When("enter captcha")
	public void enter_captcha() {
	    System.out.println("Captcha entered");
	}

	@When("click the create account button")
	public void click_the_create_account_button() {
	    System.out.println("Clicked create account button");
	}

	@Then("user account should be created successfully")
	public void user_account_should_be_created_successfully() {
	    System.out.println("Account created succesfully");
	}

}
