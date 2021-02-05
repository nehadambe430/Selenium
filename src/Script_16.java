import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_16 
{
	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("btnLogin")).click();
		
		WebElement errormsg=driver.findElement(By.id("spanMessage"));
		
		boolean status=errormsg.isDisplayed();
		
		if(status)
		{
			System.out.println("error msg displayed");
		}
		
		else
		{
			System.out.println("Error msg not displayed");
		}
		
	}

}
