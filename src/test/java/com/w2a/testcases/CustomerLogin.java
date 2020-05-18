package com.w2a.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.w2a.base.TestBase;
import com.w2a.utilities.TestUtil;

public class CustomerLogin extends TestBase{

	@Test(dataProviderClass=TestUtil.class, dataProvider="dp")
	public void customerLogin(String name, String openAccount, String customer, String currency, String alertText) throws InterruptedException {
		
		click("customerLoginBtn_XPATH");
		
		type("customerName_XPATH", name);
		
		click("submitBtn_XPATH");
		
		Assert.assertEquals("Please open an account with us.", openAccount);
		
		test.log(LogStatus.INFO, "Validated : " + openAccount);
	
		click("openAccount_XPATH");
		
		Thread.sleep(5000);
		
		select("customerName_XPATH", customer);
		
		Thread.sleep(5000);
		
		select("currency_XPATH", currency);
		
		Thread.sleep(5000);
		
		click("submitBtn_XPATH");
		
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		
		Assert.assertTrue(alert.getText().contains(alertText));
		
		alert.accept();
	}
//	
//	@DataProvider
//	public Object[][] getData(){
//		
//		String sheetName = "CustomerLogin";
//		int rows = excel.getRowCount(sheetName);
//		int cols = excel.getColumnCount(sheetName);
//		
//		Object[][] data = new Object[rows-1][cols];
//		
//		
//		for(int rowNum = 2; rowNum <= rows; rowNum++) {
//			
//			for(int colNum = 0; colNum < cols; colNum++) {
//				
//				data[rowNum -2] [colNum] = excel.getCellData(sheetName, colNum, rowNum);
//			}
//		}
//		
//		return data;
//	}
}
