package testing1.selenium_mautomation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_browser {

	public static void main(String[] args) {
		
		
       EdgeDriver driver=new EdgeDriver();
       driver.get("https://demoqa.com/register");
       
       driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Rohan");
       
       driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Patil");
       
       driver.findElement(By.xpath("//input[@id='userName' and @placeholder='UserName']")).sendKeys("Adity");
       
      driver.findElement(By.id("password")).sendKeys("12345");
       
      driver.findElement(By.xpath("//button[@text()='Register']")).click();
       
       
       
//       
//       //xpath parant and child 
//     //  driver.findElement(By.xpath("//div/input")).sendKeys("Student");
//		
//		//xpath logical opearator and or 
//       driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys("1234");
//		
//      driver.findElement(By.xpath("//button[starts_with(@class,'btn'")).sendKeys("student");
//		
		
		
		
		
		
		
		
		
		
		
		

//		
	
//		//enetr invalid user name and password
//		driver.findElement(By.cssSelector("#username")).sendKeys("rohan");
//		
//		//enetr correct password
//		driver.findElement(By.id("password")).sendKeys("Password123");
//		
//		//press on login button
//		driver.findElement(By.id("submit")).click();
//		
		
		
		

	}

}
