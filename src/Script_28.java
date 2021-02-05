import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_28 
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input[data-testid=\"royal_email\"]")).sendKeys("neha@gmail.com");
		
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("neha@123");
		
	}

}
