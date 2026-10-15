package testing1.selenium_mautomation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.Cookie;

public class caculator {

	static ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
	   driver=new ChromeDriver();
	 
		driver.get("https://www.calculator.net/");
		WebElement number1=driver.findElement(By.xpath("//span[@onclick='r(9)']"));
		number1.click();
		
		Thread.sleep(1000);
		WebElement addiation=driver.findElement(By.className("sciop"));
		
		//over mouse on addiation oprator and click addiation 
		Actions act=new Actions(driver);
		act.moveToElement(addiation).click().perform();	
		Thread.sleep(1000);
		
		//click on number 2
	    driver.findElement(By.cssSelector("span[onclick='r(8)']")).click();
	    
	    //manage cookies
	    Cookie myCookie = new Cookie("myCookieName", "myCookieValue");
	    driver.manage().addCookie(myCookie);
	  System.out.println(driver.manage().getCookies());
	}

}
