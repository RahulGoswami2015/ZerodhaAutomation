package com.Maven1.qa.Testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Maven1.qa.Base.TestBase;
import com.Maven1.qa.Pages.HomePages;
import com.Maven1.qa.Pages.LoginPage;
import com.Maven1.qa.Pages.Orders;
import com.Maven1.qa.Utility.Utility;

public class OrdersPageTesting extends TestBase{
	
	@BeforeClass
	public void setup() {
		intializeBrowser("chrome");
	}
	@Test
	public void OrderpageTest() {
		LoginPage lp=new LoginPage(driver);
		lp.verifyzerodhakiteUsername("ZS9087");
		lp.verifyzerodhakitePassword("Rahul@8007");
		lp.verifyzerodhakitesubmitBtn();
		lp.verifyzerodhakitePin("800725");
		lp.verifypincontinuebtn();
		
		HomePages hp= new HomePages(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		hp.ClickZerodhaHomePageIdeaShareBuy();
	
		Orders or=new Orders(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		or.VerifyOrderPageRegulaBtn();
		or.VerifyOrderPageAMOBtn();
		or.VerifyOrderPageIcebergBtn();
		or.VerifyOrderPageCoverBtn();
		or.VerifyQuantityOption("1");
		or.VerifyPriceOpt("1");
		or.VerifyIntradayOption();
		or.VerifyLimitOrder();
		or.VerifyMktOrder();
		or.VerifyStoplossOrder();
		or.VerifyMarginAvl();
		or.VerifyStopLossCheckbox();
		or.VerityTargetCheckbox();
		
		
	
			
		}
	
//	@AfterMethod()
//	public void Capturess(ITestResult result) throws IOException {
//		if(result.FAILURE==result.getStatus()) {
//			Utility.getscreenshots(driver, result.getName());
//		}
//	}
	
//	@AfterClass
//	public void teardown() {
//		driver.close();
//	}
	
	
	
	

}
