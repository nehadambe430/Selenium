import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_15
{

	public static void main(String[] args) throws InterruptedException 
	{
		//open Browser
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		//OPen App
		driver.get("http://www.facebook.com");
		//Click on Create Account button
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(4000);
		//Enter EmailID
		WebElement email_field = driver.findElement(By.name("reg_email__"));
		Thread.sleep(4000);
		email_field.sendKeys("admin@gmail.com");
		//Verify Re-enter EmailID field displayed or not
		WebElement reenter_emailfield = driver.findElement(By.name("reg_email_confirmation__"));
		boolean status = reenter_emailfield.isDisplayed();//true/false
		if(status)
		{
			System.out.println("Re-Enter Email Field displayed");
		}
		else
		{
			System.out.println("Re-Enter Email Field Not displayed");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
