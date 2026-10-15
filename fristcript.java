package testing1.selenium_mautomation_testing;

import org.openqa.selenium.chrome.ChromeDriver;

public class fristcript {  

	public static void main(String[] args)
	{ 
		//1 set proprites of web driver

		System.getProperty("webdriver.chrome.driver","C:\\Users\\Rohan patil\\RohanAutomationTesting\\selenium_mautomation-testing\\DriverResources\\chromedriver.exe");
		System.out.println("Configuration Done  ");
		
		//2 create the object of chromedriver //inalization the object
		ChromeDriver driver=new ChromeDriver();
		System.out.println("2 Inaliztion chromedriver");
		
		driver.manage().window().maximize();
		
		//go to university web site
		driver.get("https://sukapps.unishivaji.ac.in/online_portal/");
		
		
		//refresh the page();
		driver.navigate().refresh();
		
		//print url of currnrt website();
		System.out.println("Current web url"+driver.getCurrentUrl());
		
		//open mynrta web site
		driver.navigate().to("https://www.myntra.com/?utm_source=gh_ht&utm_medium=ht_rev&utm_campaign=gh_ht_listicle2d&gad_source=1");
		
		
		//current tittle 
		System.out.println("Tittle is"+driver.getTitle());
	
		
		//navigate to sbi bank web site();
		driver.navigate().to("https://onlinesbi.sbi.bank.in/");
		

		driver.close();
		
		
		
//			//ani yek web site la link karete
//		driver.navigate().to("https://www.angelone.in/login/");
//		
//		//scrern la mixmum karaych asl tr
//		driver.manage().window().maximize();
//		
//  		//page la refersh karaych asal  tar
//	     driver.navigate().refresh();
//	     
//	     //magchya page var back yenya sathi
//	     driver.navigate().back();
//	     
//	     //ani pudh chya page var janya sathi();
//	     driver.navigate().forward();
//	      
//	     //web page close karnya sathi();
//	     driver.close();
//	
//			driver.close();
	}

}
