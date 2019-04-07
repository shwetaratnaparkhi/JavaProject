package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition  // ctrl+shift+o  == to import all files
{
	
	/*******************feature1********************************************/
		//this part is copied from console of feature1.feature
	
	@Given("^Application is up and running$")
	public void application_is_up_and_running() throws Throwable {
	   System.out.println("Application is fully up and running");
	}

	@When("^User enters valid credentials$")
	public void user_enters_valid_credentials() throws Throwable {
		System.out.println("Entered username and password");
	   
	}

	@Then("^Home page should be displayed$")
	public void home_page_should_be_displayed() throws Throwable {
		System.out.println("Home page is displayed successfully");
	  
	}

	/***********Feature 2*********/
	@Given("^Website is up and running$")
	public void website_is_up_and_running() throws Throwable {
		System.out.println("Website is fully up and running");
	  
	}

	@When("^User enters valid URL$")
	public void user_enters_valid_URL() throws Throwable {
	System.out.println("Entered valid URL");
	}

	@Then("^Website should be displayed$")
	public void website_should_be_displayed() throws Throwable {
		System.out.println("Website is displayed successfully");
	   	}

	/********************Feature 3****************/
	
	@And("^User is logged in successfully$")
	public void user_is_logged_in_successfully() throws Throwable {
		System.out.println("login successfull");
	    
	}

	@When("^When user clicks on compose option$")
	public void when_user_clicks_on_compose_option() throws Throwable {
		System.out.println("clicked on compose button");
	}
	@And("^User enters (.*?) and (.*?)$")
	public void user_enters_techbodhi_gmail_com_and_Resume_for_job(String email , String subject) throws Throwable {
		System.out.println(email+" "+subject);
	}

	@And("^User clicks on send button$")
	public void user_clicks_on_send_button() throws Throwable {
		System.out.println("clicked on send button");
	   
	}
	
	@Then("^Compose window is closed$")
	public void compose_window_is_closed() throws Throwable {
		System.out.println("compose window is closed");
	    
	}
	
	@And("^Message window pops up$")
	public void message_window_pops_up() throws Throwable {
		System.out.println("message window pop up");
	   
	}
	
}
