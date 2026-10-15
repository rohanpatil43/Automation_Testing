package testing1.selenium_mautomation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public interface Testcase2 {

	 static void edgebroser()
		{
			EdgeDriver driver=new EdgeDriver();
			driver.get("https://practicetestautomation.com/practice-test-login/");
			
			driver.findElement(By.id("username")).sendKeys("stuent");
			
			driver.findElement(By.id("password")).sendKeys("Password123");
			
			driver.findElement(By.id("submit")).click();
		}

}
