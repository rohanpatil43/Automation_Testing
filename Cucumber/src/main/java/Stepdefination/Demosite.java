package Stepdefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class Demosite {
	WebDriver driver;

	@Given("opencart website should be lanuched")
	public void lanuched_website() {
		driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register&register_token=03d8b1a1a8aa42052aff87fc0f");
		driver.manage().window().maximize();

	}

	@When("Enter username , fristname ,last name")
	public void enter_deatils() {
	
		driver.findElement(By.id("input-username")).sendKeys("Tuka");
		// frist name
		driver.findElement(By.id("input-firstname")).sendKeys("Rohan");
		// last name
		driver.findElement(By.id("input-lastname")).sendKeys("patil");
	}

	@And("enter gmail ,country ,password")
	public void enter_gmail() {
		driver.findElement(By.id("input-email")).sendKeys("Adity123@gmail.com");
		// country
		Select sct = new Select(driver.findElement(By.id("input-country")));
		sct.selectByVisibleText("India");

		// password
		driver.findElement(By.name("password")).sendKeys("Rohan#4335");
	}

	@And("click on register button")
	public void click_register_button() {
		driver.findElement(By.xpath("//button[text()='Register']")).click();
	}

	@Then("User should create account and  register successfll with all deatils")
	public void verify() {
		System.out.println("Register successfull");
		
	}
 
	@When("click on landung page login button")
	public void click_on_login_button()
	{
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement login=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[contains(text(),'Login')]"))));
		login.click();
		

	}

	@And("Eter Email and password")
	public void eter_email_and_password() {

		driver.findElement(By.id("input-email")).sendKeys("Rohan@123");
		driver.findElement(By.id("input-password")).sendKeys("Rohan123");
	}

	@And("click on login button")
	public void login_btton() {
		driver.findElement(By.xpath("//button[text()='Login']")).click();

	}

	@Then("User should be login with valid credenatails")
	public void login() {
		System.out.println("login successfull");
			}

}