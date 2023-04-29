package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.Baseclass;
import com.actitime.pom.TaskListPage;
import com.actitime.pom.TimeTrackPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class createCustomerModule extends Baseclass {
	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		String customerName = f.getExcelData("create customer",1,2);
		System.out.println(customerName+" hinata");
		Reporter.log(customerName,true);
		TimeTrackPage tt=new TimeTrackPage(driver);
		Thread.sleep(1000);
		tt.clickTaskButton();
		TaskListPage ts=new TaskListPage(driver);
		ts.clickAddNewButton();
		Thread.sleep(2000);
		ts.clickNewCustomer();
		Thread.sleep(2000);
		ts.setCustomerName(f.getExcelData("create customer",1,2));
		ts.setCustomerDescription(f.getExcelData("create customer",1,3));
		ts.clickSelectCustomer();
		ts.clickbigBangCompany();
		ts.clickCreateCustomer();
		Thread.sleep(1000);
		String result = ts.createdCustomeName().getText();
		System.out.println(result+" expected");
		Assert.assertEquals(customerName,result);
		
	}
}
