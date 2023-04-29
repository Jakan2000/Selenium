package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.Baseclass;

public class TimeTrackPage extends Baseclass{
	public TimeTrackPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//div[text()='Tasks']")
	private WebElement tasksButton;
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logoutButton;
	
	@FindBy(xpath = "//div[text()='Time-Track']")
	private WebElement timeTrackButton;
	
	public void clickTaskButton() {
		tasksButton.click();
	}
	
	public void clickLogout()
	{
		logoutButton.click();
	}
	public void clickTimeTrackButton()
	{
		
	}
	
}
