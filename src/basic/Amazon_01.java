package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_01 
{
	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("nav-link-accountList")).click();
		
		driver.findElement(By.xpath(".//a[@id='createAccountSubmit']")).click();
		
		driver.findElement(By.xpath(".//input[@id='ap_customer_name']")).sendKeys("Neha");
		
		
	}

}
