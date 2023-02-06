package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeScreenShot 
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test(groups = "screenshot")
	public void zoro() throws IOException {
		WebDriver w=new ChromeDriver();
		w.get("https://zoro.to/");
		TakesScreenshot t=(TakesScreenshot)w;
		File src= t.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShot/ss.png");
		FileUtils.copyFile(src,dest);
	}

}
