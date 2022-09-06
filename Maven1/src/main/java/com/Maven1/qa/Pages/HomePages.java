package com.Maven1.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.Maven1.qa.Base.TestBase;

public class HomePages extends TestBase {
	//Declaration::
	
	@FindBy(xpath="//input[@icon='search']")private WebElement homepage_serachbar;
	@FindBy(xpath="//img[@alt='Kite logo']")private WebElement homepage_kitelogo;
	@FindBy(xpath="//span[@class='nickname']")private WebElement homepage_nickname;
	@FindBy(xpath="//div[text()='Margin available']")private WebElement homepage_marginavailable;
	@FindBy(xpath="//span[text()='Dashboard']")private WebElement homepage_dashboard;
	@FindBy(xpath="//span[text()='Orders']")private WebElement homepage_orders;
	@FindBy(xpath="//span[text()='Holdings']")private WebElement homepage_holdings;
	@FindBy(xpath="//span[text()='Funds']")private WebElement homepage_funds;
	@FindBy(xpath="//span[text()='View statement']")private WebElement homepage_viewstatement;
	@FindBy(xpath="//span[text()='Opening balance'][1]")private WebElement homepage_openingstatement;
	@FindBy(xpath="//span[text()='Margins used']")private WebElement homepage_marginused;
	@FindBy(xpath="//span[@class='user-id']")private WebElement homepage_userID;
	@FindBy(xpath="//h4[@class='username']")private WebElement homepage_username;
	@FindBy(xpath="//div[@class='email']")private WebElement homepage_emailID;
	@FindBy(xpath="//a[@href='/logout']")private WebElement homepage_logout;
	@FindBy(xpath="//span[text()='IDEA']")private WebElement dashbord_Ideasharebuy;
//	@FindBy(xpath="//button[@class='button-blue buy']")private WebElement dashboard_buybtn;
	 


	//initilization:
	public  HomePages(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//usage:
	public void verifHomepageSerachbar() {
		Assert.assertTrue(homepage_serachbar.isDisplayed(), "Serachbar option is not visible");
		Reporter.log("verifyserachbar", true);
	}
	public void verifyHomepageKitelogo() {
		Assert.assertTrue(homepage_kitelogo.isDisplayed(), "Kitelogo is not displayed");
		Reporter.log("verifykitelogo",true);
	}
	public void verifyHomepageNickname() {
		Assert.assertTrue(homepage_nickname.isDisplayed(), "Nickname is not displayed");
		Reporter.log("verifynickname",true);
	}
	public void verifyHomepageMarginavailable() {
		Assert.assertTrue(homepage_marginavailable.isDisplayed(), "margin available is not displayed");
		Reporter.log("verifyHomepageMarginavailable",true);
	}
	public void verifyHomepageDashboard() {
		Assert.assertTrue(homepage_dashboard.isDisplayed(),"dashboard is not visible");
		Reporter.log("verifydashboard",true);
	}
	public void VerifyHomepageOrders() {
		Assert.assertTrue(homepage_orders.isDisplayed(),"orders tab is not visible");
		Reporter.log("verifyorders", true);
	}
	public void verifyHomepageHoldings() {
		Assert.assertTrue(homepage_holdings.isDisplayed(), "holding tab is not visible");
		Reporter.log("verifyholdings", true);
	}
	public void verifyHomepageFunds() {
		Assert.assertTrue(homepage_funds.isDisplayed(),"verifyfund tab is not visible");
		Reporter.log("verifyfunds", true);
	}
	public void verifyHomepageOpeningstatement() {
		Assert.assertTrue(homepage_openingstatement.isDisplayed(),"opening statement is not visible");
		Reporter.log("verifyopeningstatement", true);
	}
	public void verifyHomepageMarginused() {
		Assert.assertTrue(homepage_marginused.isDisplayed(),"margin used is not visible");
		Reporter.log("verifymarginused", true);
	}
	public void verifyHomepageUserID() {
	//	Assert.assertTrue(homepage_userID.isDisplayed(),"userID is not visible");
		homepage_userID.click();
		Reporter.log("verifyuserID", true);
	}
	public void verifyHomepageUsername() {
		Assert.assertTrue(homepage_username.isDisplayed(),"username is not visible");
		Assert.assertEquals(homepage_username.getText(), "Rahul Khushalgir Goswami");
		Reporter.log("verifyusername", true);
		
	}
	public void verifyHomepageEmailID() {
	//	Assert.assertTrue(homepage_emailID.isDisplayed(),"emailID is not visible");
		Assert.assertEquals(homepage_emailID.getText(), "rgosavi1991@gmail.com");
		Reporter.log("verifyemailID", true);
	}
	public void verifyHomepageLogout() {
		Assert.assertTrue(homepage_logout.isDisplayed(),"logout is not visible");
		Reporter.log("verifylogout", true);
	}
	public void ClickZerodhaHomePageIdeaShareBuy() {
		Actions action = new Actions(driver);
		action.moveToElement(dashbord_Ideasharebuy).build().perform();
		driver.findElement(By.xpath("//button[@class='button-blue buy']")).click();
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		Assert.assertTrue(driver.findElement(By.xpath("//form[@class='order-window layer-2 place buy']")).isDisplayed());
	}
	
	
}
	
	
	
	
	
	



