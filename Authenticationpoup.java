package Popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticationpoup {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		WebDriver w=new ChromeDriver();
		              //admin --> userID  :admin -->password
		w.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
