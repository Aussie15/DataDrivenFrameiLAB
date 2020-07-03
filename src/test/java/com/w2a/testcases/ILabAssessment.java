package com.w2a.testcases;

import java.io.IOException;
import java.util.Hashtable;

import org.testng.annotations.Test;

import com.w2a.base.TestBase;
import com.w2a.utilities.TestUtil;

public class ILabAssessment extends TestBase{

	@Test(dataProviderClass=TestUtil.class, dataProvider="dp")
	public void ILabWebTables(Hashtable<String, String> data) throws InterruptedException, IOException {
	
		driver.getCurrentUrl();
		Thread.sleep(5000);
		
		click("addBtn_XPATH");
		
		type("firstName_XPATH", data.get("FirstName"));
		
		type("lastName_XPATH", data.get("LastName"));
		
		type("userName_XPATH", data.get("UserName"));
		
		type("passWord_XPATH", data.get("Password"));
		
		click("customerA_XPATH");
		
		select("role_XPATH", data.get("Role"));
		
		type("email_XPATH", data.get("Email"));
		
		type("cellPhone_XPATH", data.get("Cell"));
		
		click("saveBtn_XPATH");
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		click("addBtn_XPATH");
		
		type("firstName_XPATH", data.get("FirstName"));
		
		type("lastName_XPATH", data.get("LastName"));
		
		type("userName_XPATH", data.get("UserName"));
		
		type("passWord_XPATH", data.get("Password"));
		
		click("customerB_XPATH");
		
		select("role_XPATH", data.get("Role"));
		
		type("email_XPATH", data.get("Email"));
		
		type("cellPhone_XPATH", data.get("Cell"));
		
		click("saveBtn_XPATH");
		
		Thread.sleep(5000);
	}	
}
