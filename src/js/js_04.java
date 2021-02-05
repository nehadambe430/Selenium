package js;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class js_04 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.flipkart.com");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//Scroll down
		for(int i=0;i<5;i++)
		{
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,500)");
		}
		//Scroll up
		for(int i=0;i<5;i++)
		{
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,-500)");
		}
	
	

	} 

}
