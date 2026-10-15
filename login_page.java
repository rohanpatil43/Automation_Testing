package testing1.selenium_mautomation_testing;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_page {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://secure.facebook.com/login/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("email")).sendKeys("Rohan@134");
		//driver.findElement(By.id("pass")).sendKeys("pass");
	//	driver.findElement(By.id("loginbutton")).click();
		
		
	
		
		

	}

}
