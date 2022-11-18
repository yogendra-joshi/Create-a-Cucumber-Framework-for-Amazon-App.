package stepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver = BaseClass.driver;
	
	@Given("I have opened the application in browser")
	public void i_have_opened_the_application_in_browser() throws InterruptedException {

		driver.get("https://www.simplilearn.com/");
		Thread.sleep(5000);	
	}
	
	@When("I click on the Login link")
	public void i_click_on_the_login_link() {
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
	}
	
	@When("I enter username")
	public void i_enter_username() {

		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("Abcd@xyz.com");
	}
	
	@When("I enter password")
	public void i_enter_password() {
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Abcd@123");
	}
	
	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		
		WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		LoginBtn.click();
	}
	
	@Then("I should be logged in successful and land on home page")
	public void i_should_be_logged_in_successful_and_land_on_home_page() {
		
	    System.out.println("Inside home page");
	}
	
	@When("I enter username {string}")
	public void i_enter_username(String username) {

		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys(username);		
	}
	
	@When("I enter password {string}")
	public void i_enter_password(String password) {
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(password);
	}
	
	@Then("I should be getting error message as {string}")
	public void i_should_be_getting_error_message_as(String expectedMsg) {
		
		WebElement ErrorMsg = driver.findElement(By.id("msg_box"));
		String ActualMsg = ErrorMsg.getText();		
		Assert.assertEquals(ActualMsg, expectedMsg);
	}
}
