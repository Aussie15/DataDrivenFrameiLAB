package com.w2a.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;
import com.w2a.utilities.TestUtil;

public class OpenAccount extends TestBase{

	@Test(dataProviderClass=TestUtil.class, dataProvider="dp")
	public void openAccount(String customer, String currency, String alertText, String searchCust) throws InterruptedException {
		
		
		click("openAccount_XPATH");
		
		Thread.sleep(5000);
		
		select("customerName_XPATH", customer);
		
		Thread.sleep(5000);
		
		select("currency_XPATH", currency);
		
		Thread.sleep(5000);
		
		click("submitBtn_XPATH");

		Thread.sleep(3000);
		
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		
		Assert.assertTrue(alert.getText().contains(alertText));
		
		alert.accept();
		
		click("customersTab_XPATH");
		
		type("searchCustomer_XPATH", searchCust);
		
		click("deleteBtn_XPATH");
		
		click("homeBtn_XPATH");
	}
//	
//	@DataProvider
//	public Object[][] getData(){
//		
//		String sheetName = "OpenAccount";
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
