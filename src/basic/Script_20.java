package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_20
{
	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement btn=driver.findElement(By.id("btnLogin"));
		
		String rgb_color=btn.getCssValue("color");
		
		System.out.println(rgb_color);
		
		System.out.println(Color.fromString(rgb_color).asHex());

	}

}
