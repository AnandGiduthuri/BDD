package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioOutlinedemo {
WebDriver driver;
	@Given("^User is demowebshop login page$")
	public void user_is_demowebshop_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","G:\\Tools\\SeleniumCertificationSoftware\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		System.out.println("Application opened");
	}

	@When("^user logs in with ([^\\\"]*) and ([^\\\"]*)$")
	public void user_logs_in_with_email_and_password(String email,String password) throws Throwable {
		driver.findElement(By.cssSelector("input#Email")).sendKeys(email);
		driver.findElement(By.name("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		System.out.println("User logged in successfully");
	}

	@Then("^user should view the logout link$")
	public void user_should_view_the_logout_link() throws Throwable {
		boolean view=driver.findElement(By.linkText("Log out")).isDisplayed();
		Assert.assertTrue(view);
		driver.findElement(By.linkText("Log out")).click();
		System.out.println("signed out");
		driver.close();
	}
}
