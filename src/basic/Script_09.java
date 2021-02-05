package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_09
{
	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver rv =new FirefoxDriver();
		
		rv.get("https://www.youtube.com/");
		
		rv.findElement(By.id("search")).sendKeys("Java");
		
	}

}
