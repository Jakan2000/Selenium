package com.actitime.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement untb;

	@FindBy(name="pwd")
	private WebElement pwtb;

	@FindBy(xpath = "//div[.='Login ']")
	private WebElement loginb;
	
	public void clickLogin(String un,String pw) throws IOException
	{
		untb.sendKeys(un);
		pwtb.sendKeys(pw);
		loginb.click();
	}

}
