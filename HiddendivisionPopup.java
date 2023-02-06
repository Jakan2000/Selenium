package HandlingPopups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddendivisionPopup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver w=new ChromeDriver();
		w.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		w.findElement(By.xpath("//input[@name='policynumber']")).sendKeys("123");
		w.findElement(By.xpath("//input[@name='dob']")).click();
		Thread.sleep(2000);
		Select s1=new Select(w.findElement(By.xpath("//select[@data-handler='selectYear']")));
		s1.selectByVisibleText("2000");
		Select s2=new Select(w.findElement(By.xpath("//select[@data-handler='selectMonth']")));
		s2.selectByVisibleText("May");
		w.findElement(By.xpath("//a[.='23']")).click();
		w.findElement(By.xpath("//input[@placeholder='Contact Number']")).sendKeys("0123456789");
		w.findElement(By.xpath("//button[@class='submit-login']")).click();
		boolean result = w.findElement(By.xpath("//span[@id='policynumberError']")).isDisplayed();
		if(result=true)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}

}
