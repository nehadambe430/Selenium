package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_24 
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///D:/Selenium_Notes/Locaters/Page_08.html");
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Neha");
		
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Neha");
		
		driver.findElement(By.cssSelector("input[type='button']")).click();
		
		driver.close();
		
	}

}
