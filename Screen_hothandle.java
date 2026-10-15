package testing1.selenium_mautomation_testing;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
//import org.openqa.selenium.devtools.v145.page.model.Screenshot;

public class Screen_hothandle {


	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    WebElement partil=driver.findElement(By.id("nav-logo-sprites"));
	    
	    File src=partil.getScreenshotAs(OutputType.FILE);
	    File save=new File("C:\\Users\\Rohan patil\\OneDrive\\Pictures//screenshot.jpg");
	    
	    FileHandler.copy(src,save);

	}
}

