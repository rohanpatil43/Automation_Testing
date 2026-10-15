package testing1.selenium_mautomation_testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class select_dropdown {

	static EdgeDriver driver;
	public static void main(String[] args) throws InterruptedException {

		//System.getProperty("webdriver.Edge.driver","C:\Users\Rohan patil\RohanAutomationTesting\selenium_mautomation-testing\DriverResources\msedgedriver.exe");	)
		 driver=new EdgeDriver();
		
     	driver.get("https://demo.automationtesting.in/Alerts.html");
	//	driver.manage().window().maximize();
//		
//		//enter name and last name using xpath method
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Rohan");
//		
//		//enetr last name using xpath contains method
//		WebElement st=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
//		
//		st.sendKeys("Patil");
//		
//     	//full fill address coloum using xpath method
//		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Pune ,Shivaji nager ");
//		
//		//full fill email address by using css selector contains method
//		driver.findElement(By.cssSelector("input[ng-model*='EmailAdress']")).sendKeys("Rohan@123");
//		
//		//full fill phone number using css selector tag name
//    	driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("935653678");
//		
//    	//radio button check box of gender
//    	driver.findElement(By.name("radiooptions")).click();
//    	
//    	//check box of hobbiles
//    	driver.findElement(By.cssSelector("#checkbox1")).click();
//    	
//    	Actions act=new Actions(driver);
//    	WebElement rohan=driver.findElement(By.cssSelector("#msdd"));
//    	act.moveToElement(rohan).build().perform();
//    	
//    	WebElement abc=driver.findElement(By.xpath("//div[@style='min-height:30px;max-width:200px']"));
//	    
//	    
//    	//select skill using select tag 
//	   Select sc=new Select(driver.findElement(By.tagName("select")));
//	   
//	   sc.selectByVisibleText("Design");
//		
//	 //  select country 
//	  WebElement ro=driver.findElement(By.xpath("//select[@text()='Select Country'"));
//	   
//	 Select rp=new Select(ro);
//	 
//	 rp.v
//	   //(selcet day by using css id)
//		Select id=new Select(driver.findElement(By.cssSelector("#yearbox")));
//		id.selectByVisibleText("2005");
//		
//		//(select day by x path id
//		Select type=new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
//		type.selectByVisibleText("May");
//		
//		WebElement driv=driver.findElement(By.cssSelector("#daybox"));
//		
//		Select a=new Select(driv);
//		a.selectByVisibleText("6");
//		
//		//enetr password using css tag and atribte selector;
//		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("@rohaan123");
//		
//		//secound password
//		driver.findElement(By.id("secondpassword")).sendKeys("@rohan123");
		
//		WebElement language=driver.findElement(By.cssSelector("#msdd"));
//		language.click();
//		
//		Thread.sleep(1000);
//		
//		WebElement select=driver.findElement(By.xpath("//li[text()='Croatian']"));
//		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", select);
//		
//	    select.click();
		alert();
	}
    static void alert() throws InterruptedException
    {
    	WebElement sc=driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
    	
    	Actions act=new Actions(driver);
    	act.moveToElement(sc).click().perform();
    	
    	Thread.sleep(1000);
    	WebElement click=driver.findElement(By.linkText("click the button to display a confirm box "));
    	click.click();
    
    	Alert al=driver.switchTo().alert();
    	al.accept();
    }

}
