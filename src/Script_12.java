import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_12 
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver =new FirefoxDriver();
		
		driver.get("file:///D:/Selenium_Notes/Locaters/Page_04.html");
		
		driver.findElement(By.id("user")).sendKeys("Neha");
		
		driver.findElement(By.className("un")).sendKeys("Sunil");
		
		driver.findElement(By.name("last")).sendKeys("Dambe");
		
		driver.findElement(By.name("pwd")).sendKeys("Neha123");
		
		driver.findElement(By.id("email")).sendKeys("neha123@gmail.com");
		
		
	}

}
