package StepDefinition;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.SigninPage;

public class signinStep {
	public static Base base;
	SigninPage sp = new SigninPage();
	@Given("I navigate to the sign-in page")
	public void i_navigate_to_the_sign_in_page() {
	    System.out.println("navigated");
	}

	@When("I click the sig-in button")
	public void i_click_the_sig_in_button() {
		sp.signinbuttonclick();
	    System.out.println("sigin button");
	}

	@When("enter {string} in the username field")
	public void enter_in_the_username_field(String user) {
		sp.enterusername(user);
	    System.out.println("username");
	}

	@When("enter {string} in the password field")
	public void enter_in_the_password_field(String pass) {
		sp.enterpassword(pass);
	    System.out.println("password");
	}

	@When("clicks the signin button")
	public void clicks_the_signin_button() {
		sp.clicksubmit();
	    System.out.println("clicked");
	}

	@Then("user should be logged successfully")
	public void user_should_be_logged_successfully() {
	   System.out.println("logged in");
	}
}
