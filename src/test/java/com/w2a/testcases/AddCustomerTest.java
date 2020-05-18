package com.w2a.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;
import com.w2a.utilities.TestUtil;

public class AddCustomerTest extends TestBase{

	@Test(dataProviderClass=TestUtil.class, dataProvider="dp")
	public void addCustomer(String firstName, String lastName, String postCode, String alerttext) throws InterruptedException {
		
		
		click("addCustBtn_XPATH");
		
		Thread.sleep(5000);
		
		type("firstName_XPATH", firstName);
	
		Thread.sleep(5000);
		
		type("lastName_XPATH", lastName);
		
		Thread.sleep(5000);
		
		type("postCode_XPATH", postCode);
		
		Thread.sleep(5000);
		
		click("submitBtn_XPATH");
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		
		Assert.assertTrue(alert.getText().contains(alerttext));
		
		alert.accept();
		
		Thread.sleep(3000);
	}
//	
//	@DataProvider
//	public Object[][] getData(){
//		
//		String sheetName = "AddCustomerTest";
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
