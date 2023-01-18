package HandlingMouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VtigerCustomerDropDownMenu {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver w=new ChromeDriver();
		w.manage().window().maximize();
		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		w.get("https://www.vtiger.com/");
		Actions a=new Actions(w);
		WebElement res = w.findElement(By.partialLinkText("Resources"));
		a.moveToElement(res).perform();
		w.findElement(By.partialLinkText("Customers")).click();
		WebElement log = w.findElement(By.xpath("//span[.='Login']"));
		a.doubleClick(log).perform();
		WebElement sign = w.findElement(By.xpath("//button[.='Sign in']"));
		if(sign.isDisplayed())
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		w.quit();
	}

}
