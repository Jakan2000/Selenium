package HandlingMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alliphone14PromaxInFlipkart {

	static {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jakan\\Desktop\\java project\\scr\\Automation\\Driver\\chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver w=new ChromeDriver();
		w.get("https://www.flipkart.com/");
		w.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		w.findElement(By.xpath("//button[.='✕']")).click();
		w.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 14 pro max");
		w.findElement(By.xpath("//button[@type='submit']")).click();
		List<WebElement> phones = w.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max')]"));
		List<WebElement> price = w.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max')]/../../div[2]/div/div/div[@class='_30jeq3 _1_WHN1']"));
		for(int i=0; i<phones.size(); i++)
		{
			System.out.println(phones.get(i).getText()+" -----> "+price.get(i).getText());
		}
		w.quit();
	}

}
