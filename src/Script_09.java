import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_09
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		
		username.sendKeys(Keys.CONTROL+"a");
		username.sendKeys(Keys.CONTROL+"c");
		
		driver.findElement(By.id("txtPassword")).sendKeys(Keys.CONTROL+"v");
		
		driver.findElement(By.className("button")).click();
	}

}
