package com.Maven1.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.Maven1.qa.Base.TestBase;

public class LoginPage extends TestBase {
	
	// declration of webelement:
	
	@FindBy(xpath="//img[@alt='Kite']")private WebElement login_zerodhakitelogo;
	@FindBy(id="userid")private WebElement login_zerodhakiteUsername;
	@FindBy(id="password")private WebElement login_zerodhakitePassword;
	@FindBy(xpath="//button[@type='submit']")private WebElement login_zerodhakitesubmitBtn;
	@FindBy(xpath="//h2[text()='Login to Kite']")private WebElement login_zerodhakiteHeaderLine;
	@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement login_zerodhakiteForgetPassword;
	@FindBy(xpath="//img[@alt='Kite Android']")private WebElement login_zerodhakiteandroidLogo;
	@FindBy(xpath="//img[@alt='Kite iOS']")private WebElement login_zerodhakiteiOSLogo;
	@FindBy(xpath="//img[@alt='Zerodha']")private WebElement login_zerodhakiteZerodhaLogo;
	@FindBy(xpath="//a[contains(text(),'Signup now!')]")private WebElement login_zerodhakiteSighupLink;
	@FindBy(xpath="//p[@class='text-light text-xxsmall dim']")private WebElement login_zerodhakiteVersion;
	@FindBy(id="pin")private WebElement login_zerodhakitePin;
	@FindBy(xpath="//button[@type='submit']")private WebElement login_pincontinuebtn;

	// initilisation::
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//usage::
	public void verifyzerodhakitelogo() {
		Assert.assertTrue(login_zerodhakitelogo.isDisplayed(), "Zerodha kite logo is not displayed");
		Reporter.log("varyfyzerodhakitelogo",true);
	}
	public void verifyzerodhakiteUsername(String un) {
		login_zerodhakiteUsername.sendKeys(un);
		Reporter.log("verifyzerodhakiteUsername",true);
	}
	public void verifyzerodhakitePassword(String pwd) {
		login_zerodhakitePassword.sendKeys(pwd);
		Reporter.log("verifyzerodhakitePassword",true);
	}
	public void verifyzerodhakitesubmitBtn() {
	//	Assert.assertTrue(login_zerodhakitesubmitBtn.isDisplayed(),"Zerodha kite submitt button not working");
		login_zerodhakitesubmitBtn.click();
		Reporter.log("verifyzerodhakitesubmitBtn",true);
	}
	public void  verifyzerodhakiteHeaderLine() {
		Assert.assertTrue( login_zerodhakiteHeaderLine.isDisplayed());
		Reporter.log("verifyzerodhakiteHeaderLine",true);
	}
	public void VerifyzerodhakiteForgetPassword() {
		Assert.assertTrue(login_zerodhakiteForgetPassword.isDisplayed());
		Assert.assertEquals(login_zerodhakiteForgetPassword.getText(), "Forgot user ID or password?");
		Reporter.log("VerifyzerodhakiteForgetPassword",true);
	}
	public void verifyzerodhakiteandroidLogo() {
		Assert.assertTrue(login_zerodhakiteandroidLogo.isDisplayed());
		Reporter.log("verifyzerodhakiteandroidLogo",true);
		
	}
	public void VerifyzerodhakiteiOSLogo() {
		Assert.assertTrue(login_zerodhakiteiOSLogo.isDisplayed());
		Reporter.log("VerifyzerodhakiteiOSLogo",true);
	}
	public void verifyzerodhakiteZerodhaLogo() {
		Assert.assertTrue(login_zerodhakiteZerodhaLogo.isDisplayed());
		Reporter.log("verifyzerodhakiteZerodhaLogo", true);
	}
	public void verifyzerodhakiteSighupLink() {
		Assert.assertEquals(login_zerodhakiteSighupLink.getText(),"Don't have an account? Signup now!");
		Reporter.log("verifyzerodhakiteSighupLink",true);		
	}
	public void verifyzerodhakiteVersion() {
		Assert.assertTrue(login_zerodhakiteVersion.isDisplayed());
		Reporter.log("verifyzerodhakiteVersion",true);
	}
	public void verifyzerodhakitePin(String pin) {
	//	Assert.assertTrue(login_zerodhakitePin.isDisplayed());
		login_zerodhakitePin.sendKeys(pin);
		Reporter.log("verifyzerodhakitePin", true);
	}
	public void verifypincontinuebtn() {
		login_pincontinuebtn.click();
		Reporter.log("verifypincontinuebtn");
	}
	
	
	
	
	
	
	
	
	

}