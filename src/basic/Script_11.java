package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_11
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver rv=new FirefoxDriver();
		
		rv.get("https://www.flipkart.com/");
		rv.findElement(By.className("_3704LK")).sendKeys("iphone");
		rv.findElement(By.className("_34RNph")).click();
	}

}
