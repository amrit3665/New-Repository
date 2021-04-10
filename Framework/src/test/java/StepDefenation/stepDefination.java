package StepDefenation;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {
	@Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
		
		System.out.println("Logged in successfully");
        
    }

    @When ("^User login to application with username and password$")
    public void user_login_to_application_with_username_and_password() throws Throwable {
    	
    	System.out.println("Correct credentials");
        
        
    }
 
    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Home Page");
        
        
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	
    	System.out.println("Cards Displayed");
        
        
    }

}
	


