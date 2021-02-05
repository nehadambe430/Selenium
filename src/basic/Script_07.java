package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_07 
{
	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver rv =new FirefoxDriver();
		
		rv.get("file:///D:/Selenium_Notes/HTML_01/neha.html");
		
		By ref =By.id("first");
		WebElement w =rv.findElement(ref);
		w.sendKeys("Neha");
		w.clear();
		
		rv.findElement(By.id("last")).sendKeys("Dambe");
		
		rv.findElement(By.id("email")).sendKeys("neha@gmail.com");
		
		
		
		
	}

}
