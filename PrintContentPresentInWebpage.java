package HandlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintContentPresentInWebpage {

	static {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jakan\\Desktop\\java project\\scr\\Automation\\Driver\\chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver w=new ChromeDriver();
		w.get("file:///C:/Users/jakan/Desktop/Selenium/table.html");
		List<WebElement> e = w.findElements(By.tagName("td"));
		for(int i=0; i<e.size(); i++)
		{
			System.out.println(e.get(i).getText());
		}
		w.quit();
	}

}
