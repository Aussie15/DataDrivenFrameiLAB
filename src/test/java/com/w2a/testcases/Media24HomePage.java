package com.w2a.testcases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.w2a.base.TestBase;

public class Media24HomePage extends TestBase{

	@Test(dataProvider="getData")
	public void homePage(String headerText) throws InterruptedException {
		
		
		Assert.assertEquals("Lees jou gunsteling-tydskrifte en -koerante nou alles op een plek teen slegs R99 p.m.", headerText);
		
		test.log(LogStatus.INFO, "Validated : " + headerText);
		
		click("weatherWidget_XPATH");
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("location_XPATH"))), "Weather widget location verified");
		
		Thread.sleep(5000);
		
		click("closeWeather_XPATH");
		
		click("beeld_XPATH");
		
		click("beeldArticle_XPATH");
		
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.xpath("//h3[text()='Nog stories']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		click("backToHomeScreen_XPATH");
		
		
		
	}
	
	@DataProvider
	public Object[][] getData(){
		
		String sheetName = "homePage";
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
