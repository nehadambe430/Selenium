import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_24 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(100);
		
		WebElement err_msg=driver.findElement(By.id("spanMessage"));
		
		String error_msg=err_msg.getText();
		
		System.out.println(error_msg);
		
	}

}
