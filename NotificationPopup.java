package HandlingPopups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("__disable_notifications");
		WebDriver w=new ChromeDriver();
		w.get("https://www.yatra.com/");
		

	}

}
