package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_08 
{
	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver rv =new FirefoxDriver();
		
		rv.get("https://www.facebook.com/");
		
		rv.findElement(By.id("email")).sendKeys("9765087600");
		
		rv.findElement(By.id("pass")).sendKeys("PrinceNeha");
		
		rv.findElement(By.id("u_0_b")).click();
		
		
	}

}
