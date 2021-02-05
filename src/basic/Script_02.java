package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_02 
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		Navigation nvg= driver.navigate();
		nvg.to("https://www.google.com/");
		
		nvg.to("https://www.facebook.com/");
		
		driver.navigate().to("https://www.flipkart.com/");
		
		driver.navigate().back();
	
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		driver.quit();
		
		
	}

}
