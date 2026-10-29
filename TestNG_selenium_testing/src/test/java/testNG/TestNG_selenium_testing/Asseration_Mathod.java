package testNG.TestNG_selenium_testing;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Asseration_Mathod extends assscript {

	//to verify page is visible or not
	@Test(priority=-1)
	void tittle()
	{
		String title=driver.getTitle();
		String actiual="orangHRm";
		
		Assert.assertNotEquals(title, actiual);
		
	}
	@Test
	void TOverify() throws IOException
	{
		
		WebElement page=driver.findElement(By.xpath("//img[@alt='company-branding']"));;
		
		boolean visble=page.isDisplayed();
		
		Assert.assertTrue(visble);
		System.out.print("Page is visible");
	}
	
	@DataProvider(name="Login")
	public Object[][] log()
	{
	    return new Object[][]
 		{
	    		{"Admin" ,"admin123"},
 		};
	}
	@Test(dataProvider="Login")
	void login(String username ,String password) throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(1000);
		
		
		WebElement button=driver.findElement(By.xpath("//button[text()=' Login ']"));
		boolean click=button.isDisplayed();
		Assert.assertTrue(click, "Login button is visible");
		button.click();
	}
	@Test(priority=1)
	void Dashbord() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement dashbord=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
				
		boolean vrify= dashbord.isDisplayed();
		Assert.assertTrue(vrify,"Dashbord is visible successfully");
	}
	

}
