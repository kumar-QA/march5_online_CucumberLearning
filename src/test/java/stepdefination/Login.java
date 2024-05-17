package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;

	@Given("openBrowser and Enter url")
	public void openBrowser_and_Enter_url() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
	}

	@When("user enter valid username")
	public void user_enter_valid_username() {
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("student");
	}

	@And("User enter valid password")
	public void User_enter_valid_password() {
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("Password123");
	}
	@When("user click on loginButton")
	public void user_click_on_loginButton() throws InterruptedException {
	WebElement	btn=driver.findElement(By.id("submit"));
	btn.click();
	Thread.sleep(2000);
	}

	@Then("it should naviaget to Successfullypage")
	public void it_should_naviaget_to_Successfullypage() {
	String	actualvalue=driver.getTitle();
	String expectedvalue="Logged In Successfully | Practice Test Automation";
	Assert.assertEquals(expectedvalue,actualvalue);
	}
	
	@When("User enter invalid username")
	public void User_enter_invalid_username() {
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("abcdef");
	}
	@When("user enter invlaid password")
	public void user_enter_invlaid_password() {
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("dummydata");
	}
	
	@Then("it should display error message")
	public void it_should_display_error_message() {
	String	actual=driver.findElement(By.id("error")).getText();
	String Expected="Your username is invalid!";
	Assert.assertEquals(Expected, actual);
	}
	
	@Then("it should display as invalid password")
	public void it_should_display_as_invalid_password() {
	    
	}

	@Then("it should display as invalid username")
	public void it_should_display_as_invalid_username() {
	    
	}

	@When("user click on loginButton Without credentials")
	public void user_click_on_login_button_without_credentials() {
	    
	}

	@Then("it should display error message Enter username and password")
	public void it_should_display_error_message_enter_username_and_password() {
	  
	}
}
