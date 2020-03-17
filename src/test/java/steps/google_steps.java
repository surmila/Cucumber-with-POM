package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import main_java.Guru99_java;
import main_java.google_java;

public class google_steps {
	
 google_java google=new google_java();
 @Given("^the user launched the chrome browser$")
 public void the_user_launched_the_chrome_browser() throws Throwable {
     // Write code here that turns the phrase above into concrete actions
    google.url();
 }

 @When("^the user opens guru(\\d+) homepage$")
 public void the_user_opens_guru_homepage(int arg1) throws Throwable {
     // Write code here that turns the phrase above into concrete actions
    google.google_homepage();
 }

 @When("^selects cucumber testing from testing list$")
 public void selects_cucumber_testing_from_testing_list() throws Throwable {
     // Write code here that turns the phrase above into concrete actions
     google.verify();
 }

 @Then("^the user should navigate to cucumber tutorial$")
 public void the_user_should_navigate_to_cucumber_tutorial() throws Throwable {
     // Write code here that turns the phrase above into concrete actions
    google.submit();
 }



}
