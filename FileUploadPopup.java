package HandlingPopups;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver w=new ChromeDriver();
		w.get("file:///C:/Users/Admin/Desktop/Selenium/uploadFile.html");
		File f=new File("./data/JAKAN resume.pdf");
		String apath = f.getAbsolutePath();
		w.findElement(By.xpath("//input[@type='file']")).sendKeys(apath);
		

	}

}
