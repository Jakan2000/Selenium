package HandlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBClatestBusinessNews {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver w=new ChromeDriver();
		w.get("https://www.bbc.com/");
		List<WebElement> news = w.findElements(By.xpath("//h2[.='Latest Business News']/..//li"));
		for(int i=0; i<news.size(); i++)
		{
			System.out.println(news.get(i).getText());
		}
		
		w.quit();
	}

}
