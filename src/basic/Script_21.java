package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_21
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement usr = driver.findElement(By.id("txtUsername"));
		
		usr.sendKeys("Neha");
		
		String text=usr.getAttribute("value");
		
		System.out.println(text);
		
		driver.close();
		
		
	}

}
