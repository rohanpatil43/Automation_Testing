package testing1.selenium_mautomation_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRM {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		
		WebElement login=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button")));
		
		login.click();
	//	driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
