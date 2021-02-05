import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_11
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		Thread.sleep(2000);
		username.sendKeys(Keys.CONTROL+"a");
		username.sendKeys(Keys.CONTROL+"c");
		
		Thread.sleep(2000);
		username.sendKeys(Keys.TAB+""+Keys.CONTROL+"v");
		
	}

}

