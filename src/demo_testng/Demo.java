package demo_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo 
{
	WebDriver driver;
	
	@BeforeMethod
	public void beforem()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	public void tc_1() throws InterruptedException
	{
		
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement ref1 = driver.findElement(By.xpath("//input[@aria-label='Search']"));
		ref1.sendKeys("selenium",Keys.ENTER);
		System.out.println("hiiiii");
	
	}
	
	/*@Test
	public void tc_2()
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
	}*/
	
	@AfterMethod
	public void afterm()
	{
		driver.close();
		
	
	}

}
