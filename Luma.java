package HandlingMultipleElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Luma {

	static {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jakan\\Desktop\\java project\\scr\\Automation\\Driver\\chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver w=new ChromeDriver();
		w.get("https://magento.softwaretestingboard.com/");
		w.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		w.findElement(By.xpath("//a[@href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/']")).click();
		w.findElement(By.xpath("//input[@id='email']")).sendKeys("amr@gmail.com");
		w.findElement(By.xpath("//input[@id='pass']")).sendKeys("Amr@987#ta");
		w.findElement(By.xpath("//span[.='Sign In']")).click();
		w.findElement(By.xpath("//a[@title='Fusion Backpack']")).click();
		w.findElement(By.xpath("//span[.='Add to Cart']")).click();
		String product1 = w.findElement(By.xpath("//span[.='Fusion Backpack']")).getText();
		String price1 = w.findElement(By.xpath("//span[.='Fusion Backpack']/../../../div[3]/div/span/span/span")).getText();
		System.out.println("The price of the "+product1+" is "+price1);
		
		w.findElement(By.xpath("//span[.='Men']")).click();
		w.findElement(By.xpath("//a[@title='Hero Hoodie']")).click();
		w.findElement(By.xpath("//div[@id='option-label-size-143-item-168']")).click();
		w.findElement(By.xpath("//div[@id='option-label-color-93-item-49']")).click();
		w.findElement(By.xpath("//span[.='Add to Cart']")).click();
		String product2 = w.findElement(By.xpath("//span[.='Hero Hoodie']")).getText();
		String price2 = w.findElement(By.xpath("//span[.='Hero Hoodie']/../../../div[3]/div/span/span/span[2]/span")).getText();
		String size2 = w.findElement(By.xpath("//div[.='M']")).getText();
		//String colour2=w.findElement(By.xpath("//div[@option-label='Black']")).getText();
		System.out.println("The price of "+product2+" is "+price2);
		System.out.println("The size is "+size2);
		//System.out.println("The colour is "+colour2);
		w.quit();

	}

}
