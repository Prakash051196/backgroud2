package step_defination;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Testscript {
	public static  WebDriver driver;
	
	
	
	@Given("I navigate to the login page")
	public void i_navigate_to_the_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\cucumber project\\com.cucumber_practice5\\src\\main\\java\\resourse\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("http://localhost:8080/TestMeApp");
	driver.findElement(By.linkText("SignIn")).click();  
	}

	@When("I submit username and password")
	public void i_submit_username_and_password() {
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.name("password")).sendKeys("password123");
		driver.findElement(By.name("Login")).click();
	    
	}

	@Then("I should be logged in")
	public void i_should_be_logged_in() {
		WebElement SignOut = driver.findElement(By.linkText("SignOut"));
		assertTrue(SignOut.isDisplayed());    
	}

	@Given("User search for Lenovo Laptop")
	public void user_search_for_Lenovo_Laptop() {
	    
	}

	@When("Add the first laptop that appears in the search result to the basket")
	public void add_the_first_laptop_that_appears_in_the_search_result_to_the_basket() {
	   
	}

	@Then("User basket should display with added item")
	public void user_basket_should_display_with_added_item() {
	    

	}

	@Given("User navigate for Lenovo Laptop")
	public void user_navigate_for_Lenovo_Laptop() {
	    
	}

	
	@When("Add the laptop to the basket")
	public void add_the_laptop_to_the_basket() {
	
	}
}
