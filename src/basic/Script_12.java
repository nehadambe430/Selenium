package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_12 
{
	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("btnLogin")).click();
		WebElement spam=driver.findElement(By.id("spanMessage"));
		
		boolean status=spam.isDisplayed();
		if(status)
		{
			System.out.println("Error msg displayed");
		}
		else
		{
			System.out.println("Error msg is not displayed");
		}
		
		driver.close();
		
	}

}
