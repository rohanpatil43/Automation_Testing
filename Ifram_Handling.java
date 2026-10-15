package testing1.selenium_mautomation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ifram_Handling {

	//private static final WindowType WindowType = null;

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

		//single fream handeling 
		WebElement sc=driver.findElement(By.id("frm3"));
		driver.switchTo().frame(sc);
		
		driver.switchTo().frame(driver.findElement(By.id("frm2")));
		
		driver.findElement(By.id("firstName")).sendKeys("ROhan");
		
	//	driver.switchTo().newWindow(WindowType.WINDOW);
	//	driver.get("https://www.flipkart.com/");
		
	//	driver.switchTo().newWindow(WindowType.TAB);
		
		driver.close();
	}

}
