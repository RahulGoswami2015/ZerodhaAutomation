package com.Maven1.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.Maven1.qa.Base.TestBase;

public class Orders extends TestBase {
	
@FindBy(xpath="//label[text()='Regular']")private WebElement regularbtn;
@FindBy(xpath="//label[text()='Cover']")private WebElement CoverBtn;
@FindBy(xpath="//label[text()='AMO']")private WebElement AMOBtn;
@FindBy(xpath="//label[text()='Iceberg']")private WebElement IcebergBtn;
@FindBy(xpath="//div[contains(@data-balloon,'Margin Intraday Squareoff')]")private WebElement intradayopt;
@FindBy(xpath="//input[@label='Qty.']")private WebElement Quantity;
@FindBy(xpath="//input[@label='Price']")private WebElement PriceOpt;
@FindBy(xpath="//div[@data-balloon='Buy at market price']")private WebElement MktOrder;
@FindBy(xpath="//div[@data-balloon='Buy at a preferred price']")private WebElement LimitOrder;
@FindBy(xpath="//div[@data-balloon='Buy at a preferred price with a stoploss']")private WebElement StoplossOrder;
@FindBy(xpath="//div[@class='row margins']/span")private WebElement MarginAvl;
@FindBy(xpath="//label[@for='checkbox-235']")private WebElement StopplossCheckbox;
@FindBy(xpath="//label[@for='checkbox-237']")private WebElement TargetOption;

public Orders(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void VerifyOrderPageRegulaBtn() {
	Assert.assertTrue(regularbtn.isDisplayed(), "regular button is not visible");
	Reporter.log("VerifyOrderPgaeRegulaBtn",true);
}
public void VerifyOrderPageCoverBtn() {
	Assert.assertTrue(CoverBtn.isDisplayed(), "Cover button is not visible");
	Reporter.log("VerifyOrderPageRegularBtn",true);
}
public void VerifyOrderPageAMOBtn() {
	Assert.assertTrue(AMOBtn.isDisplayed(), "AMO button is not visible");
	Reporter.log("VerifyOrderPageAMOBtn", true);
}
public void VerifyOrderPageIcebergBtn() {
	Assert.assertTrue(IcebergBtn.isDisplayed(), "Iceberg option is not visible");
	Reporter.log("VerifyOrderPageIcebergBtn", true);
}
public void VerifyIntradayOption() {
	Assert.assertTrue(intradayopt.isDisplayed(), "intraday option is not visible");
	Reporter.log("VerifyIntradayOption", true);
}
public void VerifyQuantityOption(String s) {
	Assert.assertTrue(Quantity.isDisplayed(), "quantity option is not visible");
	Quantity.clear();
	Quantity.sendKeys(s);	
	Reporter.log("VerifyQuantityOption",true);
}
public void VerifyPriceOpt(String p) {
	Assert.assertTrue(PriceOpt.isDisplayed(), "Price option is not visible");
	PriceOpt.clear();
	PriceOpt.sendKeys(p);
	Reporter.log("VerifyPriceOpt", true);
}
public void VerifyMktOrder() {
	Assert.assertTrue( MktOrder.isDisplayed(), "Market order optin is not displayed");
	Reporter.log("VerifyMktOrder",true);
}
public void VerifyLimitOrder() {
	Assert.assertTrue(LimitOrder.isDisplayed(), "Limit order is not displayed");
	Reporter.log("VerifyLimitOrder", true);
}
public void VerifyStoplossOrder() {
	Assert.assertTrue(StoplossOrder.isDisplayed(), "Stoploss option is not displayed");
	Reporter.log("VerifyStoplossOrder", true);
}
public void VerifyMarginAvl() {
	Assert.assertTrue(MarginAvl.isDisplayed(), "Margin available optin is not displayed");
	Reporter.log("VerifyMarginAvl", true);
}
public void VerifyStopLossCheckbox() {
	Assert.assertTrue(StopplossCheckbox.isDisplayed(),"Stoploss check box is not displayed" );
	Reporter.log("VerifyStopLossCheckbox", true);
}
public void VerityTargetCheckbox() {
	Assert.assertTrue(TargetOption.isDisplayed(), "Target check box is not displyed");
	Reporter.log("VerityTargetCheckbox", true);
}










}