package testing1.selenium_mautomation_testing;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.io.File;

//import org.openqa.selenium.support.ui.Select;


public class Web_Site_testing {

	static ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
	
		Web_Site_testing ob=new Web_Site_testing();
		//choose youar root
		
		//home 
		ob.home();
		
		//navbar button
		ob.Register();
		
		//login 
		ob.login();
		
		
		ob.Choose_trip();
		
		//choose this flight
		ob.Choosefrist_flight();
		
		//submit deatils
		ob.submit_deatils();
		
}
	void home() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://blazedemo.com/index.php");
		
		//open home page 
	WebElement ch=driver.findElement(By.xpath("//a[text()='home']"));
		
	Thread.sleep(1000);
		Actions ac= new Actions(driver);
		ac.moveToElement(ch).click().perform();
			
		
	}
	//register with name and gmail
	void Register() throws IOException, InterruptedException
{
		Thread.sleep(1000);
		driver.get("https://blazedemo.com/login");
	WebElement click=driver.findElement(By.xpath("//a[text()='Register']"));
		Actions act=new Actions(driver);
		act.moveToElement(click).click().perform();

		//enter a name 
		driver.findElement(By.id("name")).sendKeys("Rohan patil");
		
		//company
		driver.findElement(By.id("company")).sendKeys("Indio");
		
		//Email address
		driver.findElement(By.id("email")).sendKeys("Rohan@134");
		
		//password
		driver.findElement(By.id("password")).sendKeys("Rohan123");
		
		//confirom
		driver.findElement(By.id("password-confirm")).sendKeys("Rohan123");
		
		Thread.sleep(1000);
		//clickregister 
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);
		
		//taking screen shot og bug
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		WebElement sc=driver.findElement(By.xpath("//div[@class='flex-center position-ref full-height']"));
		
		File screen=sc.getScreenshotAs(OutputType.FILE);
		File save=new File("C:\\Users\\Rohan patil\\OneDrive\\Desktop//bug.jpg");

		FileHandler.copy(screen,save);

		Thread.sleep(1000);
		driver.navigate().back();
		driver.navigate().back();
}
	void login() throws InterruptedException, IOException
	{
		
		//enter email
		driver.findElement(By.id("email")).sendKeys("Rohan@123");
		
		//enter password
		driver.findElement(By.id("password")).sendKeys("Rohan123");
		
		//rember me
		driver.findElement(By.name("remember")).click();
		
		//login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		WebElement sc=driver.findElement(By.xpath("//div[@class='flex-center position-ref full-height']"));
		
		File screen=sc.getScreenshotAs(OutputType.FILE);
		File save=new File("C:\\Users\\Rohan patil\\OneDrive\\Desktop//bug.jpg");

		FileHandler.copy(screen,save);

		
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(1000);
	}
	
	
//chose trip
	void Choose_trip() throws InterruptedException
	{
		
		//Choose your departure city
		Select sc=new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
			sc.selectByVisibleText("Portland");
			
		//Choose your destination city:
			Select sr=new Select(driver.findElement(By.name("toPort")));
			sr.selectByValue("London");
			
		//Find flights
			driver.findElement(By.cssSelector("input[type='submit']")).click();
			
			Thread.sleep(1000);
	}
	//Flights from Philadelphia to Buenos Aires:
	void Choosefrist_flight() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement choose=driver.findElement(By.xpath("//input[@value='Choose This Flight']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(choose).click().perform();
		
	}
	//Please submit the form below to purchase the flight.
	void submit_deatils() throws InterruptedException
	{
		//name
		driver.findElement(By.cssSelector("#inputName")).sendKeys("Rohan");
		
		//address
		driver.findElement(By.id("address")).sendKeys("Shivaji nagar pune 40001");
		
		//City
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Pune");
		
		//state
		driver.findElement(By.cssSelector("#state")).sendKeys("Mahastra");

		//zipcode
		driver.findElement(By.name("zipCode")).sendKeys("411005");
		
		//card type
		Select sct=new Select(driver.findElement(By.cssSelector("select[id='cardType']")));
		sct.selectByVisibleText("Visa");
		
		//creadit card number
		driver.findElement(By.xpath("//input[@placeholder='Credit Card Number']")).sendKeys("7756656574");
		
		//month
		driver.findElement(By.cssSelector("#creditCardMonth"));
		
		//year
		driver.findElement(By.name("creditCardYear"));
		
		//name of card
		driver.findElement(By.id("nameOnCard")).sendKeys("Rohan");
		
		//rember me
		driver.findElement(By.name("rememberMe")).click();
		
		Thread.sleep(3000);
		
		//purchase flight
		driver.findElement(By.cssSelector("input[value='Purchase Flight']")).click();
		
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
}
