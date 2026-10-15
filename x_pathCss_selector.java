package testing1.selenium_mautomation_testing;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class x_pathCss_selector {

	public static void main(String[] args) {
		
		//System.getProperty("webdriver.Edge.driver","C:\Users\Rohan patil\RohanAutomationTesting\selenium_mautomation-testing\DriverResources\msedgedriver.exe");	)
		EdgeDriver driver=new EdgeDriver();
		
		//web site inalizaton zali
		driver.get("https://www.toolsqa.com/selenium-training/#enroll-form");
		
	//enter name with x path syntax
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Adity");
	
	//enter last name by id atribute
	driver.findElement(By.id("last-name")).sendKeys("Patil");
	
	//enter email by name locators
	driver.findElement(By.name("email")).sendKeys("adity123@gmail.com");
	
	//enter mobile number by using cssselector containt method
	driver.findElement(By.cssSelector("input[name*='mobile']")).sendKeys("7792334566");
	
	//city select using css selector class name
	driver.findElement(By.cssSelector("#country")).sendKeys("India");
	
	//enter city usig text locator
	driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Pune");
	
	//enter massage using tage name locator locator
	driver.findElement(By.tagName("textarea")).sendKeys("very good");
	
	//enter captch using id css locator
	driver.findElement(By.cssSelector("input[id='code']")).sendKeys("JcKi");
	
	//save button using xpath basic syntax
	driver.findElement(By.className(".upcoming__registration .btn.btn-primary")).click();
	
	
	
	
	
	
	
	}
	

}
