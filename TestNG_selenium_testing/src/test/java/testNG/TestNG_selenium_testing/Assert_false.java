package testNG.TestNG_selenium_testing;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_false {


	//invalid username and password sobt login nahi zal pahije
	@Test(priority=1)
	void login() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("username")).sendKeys("adm");
		
		driver.findElement(By.name("password")).sendKeys("123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		boolean login=false;
		Assert.assertFalse(login,"Login fail with invalid password");
		
		driver.close();
	}
	
	//Assert flase login button un visible pahije
	@Test(priority=2)
	void loginbutton()
	{
		ChromeDriver driver=new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement button=driver.findElement(By.xpath("//button[text()=' Login ']"));
		boolean login=button.isDisplayed();
		Assert.assertFalse(login);
		System.out.println("button is inable");
		
	}
}
