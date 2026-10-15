package testing1.selenium_mautomation_testing;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class windo_handling {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.meesho.com/?r-id-slug=9");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.myntra.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.snapdeal.com");
		
		driver.quit();
	}

}
