package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_22 
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement btn=driver.findElement(By.id("btnLogin"));
		btn.click();
		
		WebElement msg=driver.findElement(By.id("spanMessage"));
		
		String errmsg=msg.getText();
		
		System.out.println(errmsg);
		
		driver.close();
		
	}

}
