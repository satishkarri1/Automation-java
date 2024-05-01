
/*
package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.loginPage;

import org.testng.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class POMLoginStepDefinitions {
	
	WebDriver driver;
	loginPage login;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/v1/");
		
		   
	}

	//@When("User enters valid username and password")
	//public void user_enters_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	
	@When("User enters valid {string} and {string}")
		public void user_enters_valid_username_and_password(String username, String password) {
		//driver.findElement(By.id("user-name")).sendKeys("problem_user");
		//driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		login = new loginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		   
	}

	@And("Clicks on login Button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		login.clickLogin();	
		
	}

	@Then("User is navigated to Home page")
	public void user_is_navigated_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		//Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0,"User enters valid username and password");
		
		login.isLogoDisplay();
	}

	@And("Close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
		driver.quit();
	}


}

*/
