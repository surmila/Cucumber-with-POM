package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import main_java.Guru99_java;

public class guru99_steps {
	Guru99_java guru=new Guru99_java();

	@Given("^launch an chrome browser$")
	public void launch_an_chrome_browser() {
		guru.url();
	}
	    

	@When("^the user opens google homepage$")
	public void the_user_opens_google_homepage() {
		guru.homepage();
	}

	@Then("^verify textbox$")
	public void verify_textbox() {
		guru.cucumber();
	}

	@Then("^click the submit button$")
	public void click_the_submit_button() throws InterruptedException {
		guru.tutorial();
	}

}
