package kiteBase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;


import kiteUtility.Utility;

public class Base 
{
	protected static WebDriver driver;
	public void setupBrowser() throws IOException 
	
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\1.SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		 ChromeOptions opt=new ChromeOptions();
		 opt.addArguments("--headless");

		    driver=new ChromeDriver();
		    driver.manage().window().maximize();
			driver.get(Utility.getDataFromPropertyFile("URL"));
			Reporter.log("Launching Browser",true);
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
   public String setupCrossBrowser(String name) throws IOException 
	
	{
	   if(name.equals("Chrome"))
	   {
		 System.setProperty("webdriver.chrome.driver", "E:\\1.SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
	        driver=new ChromeDriver();
	   }
	   else if(name.equals("FireFox"))
	   {
		   System.setProperty("webdriver.gecko.driver", "E:\\1.SW TESTING\\AUTOMATION TESTING\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver(); 	
	   }
	        
		    driver.manage().window().maximize();
			driver.get(Utility.getDataFromPropertyFile("URL"));
			Reporter.log("Launching Browser",true);
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			return name;
	}

}
