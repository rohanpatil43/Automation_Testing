package Project_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Annations {

    
	WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("1. BeforeSuite: Automation started");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("2. BeforeTest: XML test started");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("3. BeforeClass: Test class setup");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("4. BeforeMethod: Open browser");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        System.out.println("AfterMethod: Close browser");

        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        System.out.println("AfterClass: Class completed");
    }

    @AfterTest(alwaysRun = true)
    public void afterTest() {
        System.out.println("AfterTest: XML test completed");
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        System.out.println("AfterSuite: Automation completed");
    }
}