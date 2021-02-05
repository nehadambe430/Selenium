import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_10 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String username_text="Admin123";
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys(username_text);
		
		while(username_text.length()>0)
		{
			Thread.sleep(2000);
			username.sendKeys(Keys.BACK_SPACE);
		}
		
		driver.close();
	}

}
