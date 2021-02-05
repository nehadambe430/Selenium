package basic;

//xpath by attribute

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_27 
{
	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath(".//input[@name='txtUsername']")).sendKeys("Neha");
		
		driver.findElement(By.xpath(".//input[@name=\'txtPassword\']")).sendKeys("Neha@1234");
		
		
		
	}

}
