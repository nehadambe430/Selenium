package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//xpath by text
public class Script_28
{
	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath(".//input[@type='submit']")).click();
		
		WebElement msg=driver.findElement(By.id("spanMessage"));
		
		String err=msg.getText();
		
		System.out.println(err);
		
		
	}

}
