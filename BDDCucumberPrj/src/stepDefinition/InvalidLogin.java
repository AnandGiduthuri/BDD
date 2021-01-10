package stepDefinition;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidLogin {
WebDriver driver;
	
	@Given("^User is on Signin page$")
	public void user_is_on_Signin_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","G:\\Tools\\SeleniumCertificationSoftware\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		System.out.println("Application opened");
	}

	@When("^user enters valid email and invalid password$")
	public void user_enters_valid_email_and_invalid_password() throws Throwable {
		driver.findElement(By.cssSelector("input#Email")).sendKeys("rekhabr1@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("rekharn");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}

	@Then("^user should see a error message$")
	public void user_should_see_a_error_message() throws Throwable {
	   boolean view= driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful')]")).isDisplayed();
	   Assert.assertTrue(view);
	}
}
