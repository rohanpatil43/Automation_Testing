package testing1.selenium_mautomation_testing;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Actions_perform { 
	
	 ChromeDriver driver; //instance varible delecer kelya  te aapan khut pan use karu shkato by varible name;
	
	public static void main(String[] args) throws Exception {  
 
		
		Actions_perform actio=new Actions_perform();
		//click input box and enter value
		actio.filldata();
		
		//actio.actions();
		
		//click on search icon and search the value
		//actio.sreach();
		
		//click on dynamic button
	//	actio.dynamic();
		
		//alert accpecting
		//actio.alert();
		
		//action confirmation
		//actio.confirmationalert();
		
		//text alert
	//	actio.textalert();
		
		//
		//to vrtify the all setions 
	//	actio.navbar();
		
		//to copy and pest text
	//	actio.doubleclick();
		
		//drag dop box
	//	actio.dragdrop();
		
		//slider
		actio.slider();
		
		//scrolling dropbox
	//	actio.selectitem();
		
		//from fill process
	//	actio.fromaction();
		
		//file ulolading
	//	actio.fileupload();
	
	//broken links
	//	actio.brokenlink();
}
	void filldata() throws InterruptedException
	{
		//inalation the chrome browser
		driver=new ChromeDriver();
		 driver.get("https://testautomationpractice.blogspot.com/");
		 
		 driver.manage().window().maximize();
		 
		 //enter the frist name
		driver.findElement(By.id("name")).sendKeys("Rohan");
		
		//enter email id
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rohan@123");
		
		//Enter phone number
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("123456578");
		
		//Enetr Address
		driver.findElement(By.xpath("//textarea[contains(@id,'text')]")).sendKeys("Sangli Devarde islampur");
		
		//click radio button select gender
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		
		//select day radiobutton
		List<WebElement> all=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(int i=0;i<all.size();i++)
		{
			all.get(i).click();
		}
		
		
		//Select country 
		Select sc=new Select(driver.findElement(By.xpath("//select[@id='country']")));
		
		sc.selectByValue("india");
		Thread.sleep(1000);
		
		//finding colours using java script method
		//pahila value la select karyach
		WebElement color=driver.findElement(By.xpath("//option[@value='green']"));
		
	//	Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",color);
		
		color.click();
		
		//find shorted list Sorted List:using scroll fincationality
		WebElement shorted=driver.findElement(By.cssSelector("option[value='dog']"));
		
		JavascriptExecutor java=(JavascriptExecutor)driver;
		
		java.executeScript("arguments[0].scrollIntoView(true);",shorted);
		shorted.click();
		
		//selct date
		driver.findElement(By.id("datepicker")).sendKeys("10/12/206");
		
		//date piker 2
		
		
		//date pikker 3
		WebElement date=driver.findElement(By.cssSelector("#start-date"));
		
		JavascriptExecutor ja=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('type','2026/10/12');", date);
		date.sendKeys("2026/10/12");
		
		Thread.sleep(1000);
}
	
	//verify menu fanctionality
	void navbar() throws InterruptedException//to preform actions on search  menu
{
		 Actions act=new Actions(driver);

         //for to verify Udemy Course display page display or not
		 
		 WebElement xy=driver.findElement(By.linkText("Udemy Courses"));
		 act.moveToElement(xy).click().perform(); 
		 Thread.sleep(1000);
	      driver.navigate().back();
	      
	      //online treannings page lounch
	      Thread.sleep(1000);
	      WebElement online=driver.findElement(By.xpath("//a[text()='Online Trainings']"));
	      act.moveToElement(online).click().perform();
	      Thread.sleep(1000);
	      driver.navigate().back();
	      
	      Thread.sleep(1000);
	      //Blog page is open or not 
	      WebElement blog=driver.findElement(By.linkText("Blog"));
	      act.moveToElement(blog).click().perform();
	      Thread.sleep(1000);
	      driver.navigate().back();
	      
	      Thread.sleep(1000);
	      WebElement Playwright=driver.findElement(By.linkText("PlaywrightPractice"));
	      act.moveToElement(Playwright).click().perform();
	      
	      Thread.sleep(1000);
	      driver.navigate().back();
	      
	      Thread.sleep(1000);
	      
      }
	void sreach() throws InterruptedException //search element uding enter value click and perform 
	{
		Actions act=new Actions(driver);
		//search input box sathivtyat value inter hoil
		WebElement element=driver.findElement(By.cssSelector("#Wikipedia1_wikipedia-search-input"));
		WebElement y=driver.findElement(By.cssSelector(".wikipedia-search-button"));
		
		act.sendKeys(element,"rohan").click(y).perform();
		Thread.sleep(1000);
		
	}
	//dynamic button
	void dynamic() throws InterruptedException
	{
		WebElement dy=driver.findElement(By.name("start"));
		dy.click();
		Thread.sleep(1000);
		
		dy.click();
	}

	//Alert handling
	void alert() throws InterruptedException

	{
		driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']")).click();
		Alert al=driver.switchTo().alert();
		Thread.sleep(1000);
		al.accept();
		Thread.sleep(1000);
		
	}
	void confirmationalert()throws InterruptedException
	{
		driver.findElement(By.cssSelector("#confirmBtn")).click();
		Alert a=driver.switchTo().alert();
		Thread.sleep(1000);
		a.dismiss();
		Thread.sleep(1000);
	}
	void textalert() throws InterruptedException
	{
		driver.findElement(By.cssSelector("#promptBtn")).click();
		Thread.sleep(1000);
		Alert D=driver.switchTo().alert();
		D.sendKeys("hello potter");
		D.accept();
		Thread.sleep(1000);
	}
	void mousehover()
	{
		WebElement mouse=driver.findElement(By.xpath("//button[text()='Point Me'"));
		Actions act=new Actions(driver);
		act.moveToElement(mouse).click().perform();
	}
	
	//double click functionlity
	void doubleclick() throws InterruptedException
	{
		WebElement click=driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		
		Actions act=new Actions(driver);
		act.doubleClick(click).perform();
		
		Thread.sleep(1000);
	}
	void slider() throws InterruptedException
	{
		//left side slider handel
		WebElement leftslider=driver.findElement(By.xpath("//span[@style='left: 15%;']"));
		
		Actions a=new Actions(driver);
		a.dragAndDropBy(leftslider, 0, 150);
		
//		Thread.sleep(1000);
//	//	right side slider
//		a.dragAndDropBy(leftslider,0, -80);
		
	}
	
	//drag and drop
	void dragdrop() throws InterruptedException
	{
		WebElement drag=driver.findElement(By.cssSelector("#draggable"));
		WebElement drop=driver.findElement(By.cssSelector("#droppable"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		
		Thread.sleep(1000);
	}
	
	//find scrolling element
	void selectitem() throws InterruptedException
	{
		WebElement select=driver.findElement(By.cssSelector("#comboBox"));
		select.click();
		
		Thread.sleep(1000);
		//jo pryaya nivadaycha ahe to select kara
		WebElement item=driver.findElement(By.xpath("//div[text()='Item 3']"));
		
		//javaScriptExecutor cha use kraycha scroll krayala
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);",item);
		
		Thread.sleep(1000);
		item.click();
		
		
		}
	
	//Broken links
	void brokenlink() throws InterruptedException
	{
		//WebElement li=driver.findElement(By.xpath("//a[@class='link']"));
		
		List<WebElement> open=driver.findElements(By.partialLinkText("Errorcode"));
		
		for(int i=0;i<=open.size();i++)
		{
			open.get(i).click();
			Thread.sleep(1000);
			driver.navigate().back();
		}
		
	}
	
	//from filling
	void fromaction()
	{
		WebElement from=driver.findElement(By.id("input1"));
		//from.sendKeys("Rohan");
		
		WebElement submit=driver.findElement(By.cssSelector("#btn1"));
		
		Actions act=new Actions(driver);
		act.sendKeys(from,"Rohan").click(submit).perform();
		
		//input 2 fill
		WebElement form=driver.findElement(By.cssSelector("#input2"));
		
		WebElement btn=driver.findElement(By.id("btn2"));
		
		act.sendKeys(form,"Patil").click(btn).perform();
		
	}
	void fileupload() throws InterruptedException
	{
		//single file sathi
		driver.findElement(By.id("singleFileInput")).sendKeys("C:\\Users\\Rohan patil\\OneDrive\\Pictures\\WhatsApp Image 2026-06-30 at 10.02.22 PM.jpeg");
		driver.findElement(By.cssSelector("button[type='submit'")).click();
		
		//Multiple file sathi 
	WebElement file2=driver.findElement(By.id("multipleFilesInput"));
	file2.sendKeys("C:\\Users\\Rohan patil\\OneDrive\\Pictures\\134295959011347902.jpg\n"+"C:\\Users\\Rohan patil\\OneDrive\\Pictures\\134302441377872032.jpg");
	
	driver.findElement(By.xpath("//button[text()='Upload Multiple Files']")).click();
	}
}
