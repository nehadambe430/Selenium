package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_14 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String name="Admin";
		
		WebElement usr=driver.findElement(By.id("txtUsername"));
		usr.sendKeys(name);
		
		while(name.length()>0)
		{
			Thread.sleep(2000);
			usr.sendKeys(Keys.BACK_SPACE);
		}
		
		driver.close();
		
	}

}
