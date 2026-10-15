package testing1.selenium_mautomation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class home_work {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		//enter user name
		WebElement st=driver.findElement(By.xpath("//input[@type='text']"));
		st.sendKeys("student");
		st.sendKeys(Keys.ENTER);
		st.sendKeys(Keys.TAB);
		
		st.sendKeys(Keys.CONTROL+"a");
		st.sendKeys(Keys.CONTROL+"c");
     	WebElement copy=driver.findElement(By.cssSelector("input[type='password']"));
		copy.sendKeys("123");
    	copy.sendKeys(Keys.CONTROL+"v");
		
		
		//enter password
		
		
		//System.out.println("login successful"+driver.getCurrentUrl());
		
		//driver.findElement(By.id("submit")).click();
		
		//WebElement rohan=driver.findElement(By.tagName("strong"));
		//System.out.println("Massage login"+rohan.getText());
		
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log out")).click();
		
		driver.close();
		
	}

}
