package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_15 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement usr=driver.findElement(By.id("txtUsername"));
		usr.sendKeys("Admin");
		usr.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		usr.sendKeys(Keys.ENTER+"c");
		Thread.sleep(2000);
		usr.sendKeys(Keys.TAB,Keys.CONTROL+"v");
		Thread.sleep(2000);
		driver.close();
	}

}
