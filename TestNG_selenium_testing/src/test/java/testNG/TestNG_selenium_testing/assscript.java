package testNG.TestNG_selenium_testing;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class assscript {
	
	ChromeDriver driver;
	@BeforeClass
	void lounch() throws IOException, InterruptedException
	{
	     driver=new ChromeDriver();
       FileReader fr=new FileReader("C:\\Users\\Rohan patil\\RohanAutomationTesting\\selenium_mautomation-testing\\TestNG_selenium_testing\\External_FileRead");
		
		Properties p=new Properties();
		p.load(fr);
		driver.get(p.getProperty("orangHRmurl"));
		Thread.sleep(1000);
		
		
	}
}
