package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckLogin {
WebDriver driver;
	
	@Given("^User is on Login page$")
	public void user_is_on_Login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","G:\\Tools\\SeleniumCertificationSoftware\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		System.out.println("Application opened");
	}

	@When("^user enters email and password$")
	public void user_enters_email_and_password() throws Throwable {
		driver.findElement(By.cssSelector("input#Email")).sendKeys("rekhabr1@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("rekhab");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		System.out.println("User logged in successfully");
	}

	@Then("^user should see logout link$")
	public void user_should_see_logout_link() throws Throwable {
		
		boolean view=driver.findElement(By.linkText("Log out")).isDisplayed();
		Assert.assertTrue(view);
		driver.findElement(By.linkText("Log out")).click();
		System.out.println("signed out");
		driver.close();
	}

	
		
	}

