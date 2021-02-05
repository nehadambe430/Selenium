package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Yatra 
{
	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.yatra.com/");
		
		driver.findElement(By.className("dropdown-toggle")).click();
		
		driver.findElement(By.id("signInBtn")).click();
		
		driver.findElement(By.id("login-input")).sendKeys("neha@123");
		
	}

}
