package com.actitime.generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.LoginPage;

public class Baseclass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static WebDriver driver;
	public FileLibClass f=new FileLibClass();
	
	@BeforeClass
	public void openBrowser() throws IOException {
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void login() throws IOException {
		String url=f.getPropertyData("url");
		String un = f.getPropertyData("username");
		String pw = f.getPropertyData("password");
		driver.get(url);
		LoginPage l=new LoginPage(driver);
		l.clickLogin(un,pw);
	}
	
	@AfterMethod
	public void logout() {
		
	}
	
	@AfterClass
	public void closeBrowser() {
		//driver.close();
	}
}
