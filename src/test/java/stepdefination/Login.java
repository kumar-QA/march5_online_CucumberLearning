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
	
	@When("user click on logoutBtn")
	public void user_click_on_logout_btn() {
	  WebElement  logoutbtn=driver.findElement(By.xpath("//a[@href=\"https://practicetestautomation.com/practice-test-login/\"]"));
	  logoutbtn.click();
	}

	@Then("it should navigate to LoginTestPage and verify pageHeader")
	public void it_should_navigate_to_login_test_page_and_verify_page_header() {
	    WebElement  pageHeader=driver.findElement(By.xpath("//h2"));
	    String Expected="Test login";
	    String Actual=pageHeader.getText();
	    Assert.assertEquals(Expected,Actual);
	}
	
	@Then("close the browser")
	public void  close_the_browser() {
		driver.close();
	}
	
	@When("user enter")
	public void user_enter() {
	   System.out.println("hi");
	}


		@When("^user enter (.*) value$")
		public void user_enter_username(String name) throws InterruptedException {
			WebElement uname = driver.findElement(By.id("username"));
			Thread.sleep(2000);
			uname.sendKeys(name);
		}
	
		@When("^user enter (.*) data$")
		public void user_enter_password(String password) throws InterruptedException {
			WebElement pwd = driver.findElement(By.id("password"));
			Thread.sleep(2000);
			pwd.sendKeys(password);
		}
	
		@Then("result should be displayed")
		public void result_should_be_displayed() {
		    System.out.println("executed");
		}
}

