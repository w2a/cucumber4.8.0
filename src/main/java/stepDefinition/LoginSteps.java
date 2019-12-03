package stepDefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Before
	public void setUp() {
		
		System.out.println("@Before hook -- Launching browser ");
		
	}
	
	@After
	public void tearDown() {
		
		System.out.println("@After hook --- quitting browser ");
	}
	
	@BeforeStep
	public void beforeStep() {
		
		System.out.println("Executing Before Step");
	}
	
	@AfterStep
	public void afterStep() {
		
		System.out.println("Executing After Step");
	}
	
	
	@Given("^user navigates to facebook website$")
	public void user_navigates_to_facebook_website() {
	 
		System.out.println("@Given -- User Navigates to Facebook Website ");
	}

	
	@When("^user validates the homepage title$")
	public void user_validates_the_homepage_title() {
	 
		System.out.println("@When -- user validates the homepage title");

	}

	@Then("^user entered \"([^\"]*)\" username$")
	public void user_entered_valid_username(String username) {
		
		System.out.println("@Then -- user entered "+username+" username");
	  
	}

	@Then("^user entered \"([^\"]*)\" password$")
	public void user_entered_valid_password(String password) {
	 
		System.out.println("@Then -- user entered "+password+" password");
		
	}

	@Then("^user \"([^\"]*)\" succesfully logged in$")
	public void user_shouldbe_succesfully_logged_in(String validateLogin) {
		
		System.out.println("@Then -- user "+validateLogin+" succesfully logged in");
	  
	}
	
	
	@And("^user select the age category$")
	public void user_select_the_age_category(DataTable table) {
		
		List<Map<String,String>> data = table.asMaps(String.class, String.class);
		System.out.println("@And -- user select the age category : "+data.get(1).get("Age")+"  --selected location as : "+data.get(1).get("Location"));
		
	}
	
	
}
