package com.Maven1.qa.Testcases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Maven1.qa.Base.TestBase;
import com.Maven1.qa.Pages.LoginPage;
import com.Maven1.qa.Utility.Utility;



public class LoginTest extends TestBase {

	@BeforeClass
	public void setup() {
		intializeBrowser("chrome");
	}

	
	@Test(testName = "ZerodhaLoginPageTest")
	public void ZerodhaLoginPageTest() {
		LoginPage lp=new LoginPage(driver);
		lp.verifyzerodhakiteandroidLogo();
		lp.VerifyzerodhakiteForgetPassword();
		lp.verifyzerodhakiteHeaderLine();
		lp.VerifyzerodhakiteiOSLogo();
		lp.verifyzerodhakitelogo();
		lp.verifyzerodhakiteUsername("ZS9087");
		lp.verifyzerodhakitePassword("Rahul@8007");
		lp.verifyzerodhakiteSighupLink();
		lp.verifyzerodhakitesubmitBtn();
		lp.verifyzerodhakiteVersion();
		lp.verifyzerodhakiteZerodhaLogo();
		lp.verifyzerodhakitePin("800725");
		lp.verifypincontinuebtn();
	}
	@AfterMethod()
	public void Capturess(ITestResult result) throws IOException {
		if(result.FAILURE==result.getStatus()) {
			Utility.getscreenshots(driver, result.getName());
		}
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}

	
	
}	


