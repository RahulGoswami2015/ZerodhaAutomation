package com.Maven1.qa.Testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Maven1.qa.Base.TestBase;
import com.Maven1.qa.Pages.HomePages;
import com.Maven1.qa.Pages.LoginPage;
import com.Maven1.qa.Utility.Utility;

public class HomepageTest extends TestBase {
	
	@BeforeClass
	public void Setup() {
		intializeBrowser("chrome");
		}
	@Test
	public void testhompage() {
		LoginPage lp=new LoginPage(driver);
		lp.verifyzerodhakiteUsername("ZS9087");
		lp.verifyzerodhakitePassword("Rahul@8007");
		lp.verifyzerodhakitesubmitBtn();
		lp.verifyzerodhakitePin("800725");
		lp.verifypincontinuebtn();
		
		HomePages hp= new HomePages(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		hp.verifyHomepageDashboard();
		hp.verifyHomepageFunds();
		hp.verifyHomepageHoldings();
		hp.verifyHomepageKitelogo();
		hp.verifyHomepageMarginavailable();
		hp.verifyHomepageMarginused();
		hp.verifyHomepageNickname();
		hp.verifyHomepageOpeningstatement();
		hp.VerifyHomepageOrders();
		hp.verifHomepageSerachbar();
		hp.verifyHomepageUserID();
		hp.verifyHomepageUsername();
		hp.verifyHomepageEmailID();
		hp.verifyHomepageLogout();
		
		}
	@AfterMethod()
	public void Capturess(ITestResult result) throws IOException {
		if(result.FAILURE==result.getStatus()) {
			Utility.getscreenshots(driver, result.getName());
		}
	}

	@AfterClass
	public void teardown() {
		driver.quit();
		}
	

}
