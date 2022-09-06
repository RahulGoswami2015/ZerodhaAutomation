package com.Maven1.qa.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Parameters;

public class TestBase {
	
		public static WebDriver driver;
		@Parameters("browser")
		public void intializeBrowser(String browser) {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\CromeWeb Driver\\chromedriver.exe");
				ChromeOptions options =new ChromeOptions();
				options.addArguments("--disable-notifications");
				driver = new ChromeDriver(options); 
			}else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Desktop\\CromeWeb Driver\\geckodriver.exe");
				FirefoxOptions options = new FirefoxOptions();
				options.addArguments("--disable-notifications");
				driver = new FirefoxDriver(options); 
			}else {
				System.out.println("Wrong Browser Selected");
			}
			driver.get("https://kite.zerodha.com/");
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		
		
		
		
		
		
	}


