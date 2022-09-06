package com.Maven1.qa.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Maven1.qa.Base.TestBase;

public class Utility extends TestBase {
	
	public static void getscreenshots(WebDriver driver, String testname) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d=new Date();
		System.out.println(d);
		String filename=d.toString().replace(" ", "_").replace(":","_")+".png";
		File dst=new File("C:\\Users\\Lenovo\\Desktop\\ZerodhaScreenshots\\Zerodha_"+filename);
		FileUtils.copyFile(src, dst);
	}
		//---------------------------------excel File------------------------------------------------------------
		public void getexceldata(int row, int col) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Automation_Test.xlsx");
		String data=WorkbookFactory.create(file).getSheet("Login_Credentials").getRow(row).getCell(col).getStringCellValue();
		}
		//----------------------------------JavaScript Executor-----------------------------------------------------------------------
		public static void borderbyjs(WebDriver driver,WebElement element ) {
			JavascriptExecutor js= ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].style.border='3px solid red'", element);
		}
			// capturing the title. ==> Method which accepts the parameter but will return title
			
			public static String titlebyJS(WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			String Title=js.executeScript("return document.title;").toString();
			return Title;
			}
			
			// click on element
			public static void clickbyJS(WebDriver driver,WebElement element) {
				JavascriptExecutor js = ((JavascriptExecutor) driver);
				js.executeScript("arguments[0].click();", element);
			}
			
			// generate userdefined alert.
			
			public static void alertbyJS(WebDriver driver, String message) {
				JavascriptExecutor js = ((JavascriptExecutor) driver);
				js.executeScript("alert('" + message + "')");
			}
			
			// refresh the page
			public static void refreshbyJS(WebDriver driver) {
				JavascriptExecutor js = ((JavascriptExecutor) driver);
				js.executeScript("history.go(0)");
			}
			
			// Scrolling the page.
			
			public static void scrolldownbyJS(WebDriver driver,int x, int y) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
				js.executeScript("scroll("+x+","+y+")");    // scroll down	
			}
			
			public static void scrollupbyJS(WebDriver driver,int x, int y) {
				JavascriptExecutor js = ((JavascriptExecutor) driver);
					js.executeScript("scroll("+x+","+y+")");    // scroll up
			}
			
			// scroll into view.

			public static void scrollIntoViewbyJS(WebDriver driver,WebElement element) {
				JavascriptExecutor js = ((JavascriptExecutor) driver);
				js.executeScript("arguments[0].scrollIntoView(true);", element);
			
			}

			
		}
		
	
	


