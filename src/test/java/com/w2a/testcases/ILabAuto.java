package com.w2a.testcases;

import java.io.IOException;
import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.CaptureScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.w2a.base.TestBase;
import com.w2a.utilities.TestUtil;

public class ILabAuto extends TestBase{

	@Test(dataProviderClass=TestUtil.class, dataProvider="dp")
	public void ILabCareers(Hashtable<String, String> data) throws InterruptedException, IOException {
		
		
		click("closePopup_XPATH");
		
		click("careersTab_XPATH");
		
		//WebDriver driver = new ChromeDriver();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,550)");
		
		click("southAfricaTab_XPATH");
		
		click("jobApply_XPATH");
		
		jse.executeScript("window.scrollBy(0,550)");
		
		click("applyOnlineBtn_XPATH");
		
		TestUtil.captureScreenshot();
		
		Thread.sleep(1000);
		type("yourName_XPATH", data.get("YourName"));
		
		
		type("emailAddress_XPATH", data.get("EmailAddress"));
		
		Thread.sleep(1000);
		type("phoneNumber_XPATH", data.get("PhoneNumber"));
		
		Thread.sleep(1000);
		click("sendApplication_XPATH");
		
		jse.executeScript("window.scrollBy(0,550)");
		
		Assert.assertEquals("You need to upload at least one file.", data.get("AlertText"));
		
		test.log(LogStatus.INFO, "Validated : " + data.get("AlertText"));
		
	}
	}	
	

