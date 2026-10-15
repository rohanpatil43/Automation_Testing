package testing1.selenium_mautomation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public interface Testcase1 {

	 static void chromebroser()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.findElement(By.id("username")).sendKeys("stuent");
		
		driver.findElement(By.id("password")).sendKeys("Password123");
		
		driver.findElement(By.id("submit")).click();
	}
}
