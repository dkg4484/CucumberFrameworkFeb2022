package stepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {

	static WebDriver driver;

	@Given("the user passes the url {string}")
	public void the_user_passes_the_url(String url) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

	}

	@When("the user clicks the signIn button")
	public void the_user_clicks_the_sign_in_button() {

		driver.findElement(By.id("nav-link-accountList")).click();

	}

	@Then("the user should see the signIn page")
	public void the_user_should_see_the_sign_in_page() {

		Assert.assertTrue(driver.findElement(By.id("createAccountSubmit")).isDisplayed());

	}

	@Given("the user clicks createAmazon Account")
	public void the_user_clicks_create_amazon_account() {

		driver.findElement(By.id("createAccountSubmit")).click();

	}

	@When("the user sending the username {string}")
	public void the_user_sending_the_username(String username) {

		driver.findElement(By.name("customerName")).sendKeys(username);

	}

	@When("the user pass mobileNumber {string} Password {string} and Confirm Password {string}")
	public void the_user_pass_mobile_number_password_and_confirm_password(String mob, String pwd, String confirm) {

		driver.findElement(By.id("ap_email")).sendKeys(mob);
		driver.findElement(By.id("ap_password")).sendKeys(pwd);
		driver.findElement(By.id("ap_password_check")).sendKeys(confirm);

	}

	@When("the user clicking the continue button")
	public void the_user_clicking_the_continue_button() {

		driver.findElement(By.id("continue")).click();

	}

}
