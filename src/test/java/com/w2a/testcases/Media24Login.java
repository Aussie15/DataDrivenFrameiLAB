package com.w2a.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class Media24Login extends TestBase{
	
	@Test(dataProvider="getData")
	public void media24(String emailAddress, String password) {
		
		click("meldAan_XPATH");
		
		type("emailAdd_XPATH", emailAddress);

		type("password_XPATH", password);
		
		click("login_XPATH");
		
	}
	
	@DataProvider
	public Object[][] getData(){
		
		String sheetName = "netwerk24";
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);
		
		Object[][] data = new Object[rows-1][cols];
		
		
		for(int rowNum = 2; rowNum <= rows; rowNum++) {
			
			for(int colNum = 0; colNum < cols; colNum++) {
				
				data[rowNum -2] [colNum] = excel.getCellData(sheetName, colNum, rowNum);
			}
		}
		
		return data;
	}

}
