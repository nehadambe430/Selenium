
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_009 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//Identify Username field 
		WebElement username = driver.findElement(By.id("txtUsername"));
		Thread.sleep(3000);
		//Enter Username
		username.sendKeys("admin");
		Thread.sleep(3000);
		//Select Text
		username.sendKeys(Keys.CONTROL+"a");
		//Copy Text
		username.sendKeys(Keys.CONTROL,"c");
		Thread.sleep(3000);
		//Paste it in password field
		driver.findElement(By.id("txtPassword")).sendKeys(Keys.CONTROL+"v");

	}

}
