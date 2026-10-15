package testing1.selenium_mautomation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragDrop_box {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Static.html");
		
		WebElement w=driver.findElement(By.cssSelector("#angular"));
		WebElement c=driver.findElement(By.cssSelector("#droparea"));
		
		
	    Actions ac= new Actions(driver);
		ac.dragAndDrop(w, c).build().perform();
		
		driver.navigate().to("https://demo.automationtesting.in/Slider.html");
		
		WebElement slider=driver.findElement(By.id("slider"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(slider, 0, 20).build().perform();		

	}

	
}

