package HandlingPopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver w=new ChromeDriver();
		w.get("https://demo.automationtesting.in/Alerts.html");
		w.findElement(By.xpath("//a[.='Alert with OK & Cancel ']")).click();
		w.findElement(By.xpath("//button[.='click the button to display a confirm box ']")).click();
		Alert a = w.switchTo().alert();
		a.dismiss();
		String etext = "You Pressed Cancel";
		String atext = w.findElement(By.xpath("//p[@id='demo']")).getText();
		if(etext.equals(atext))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
	}

}
