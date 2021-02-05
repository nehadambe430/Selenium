import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_25
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(4000);

		WebElement errormsg = driver.findElement(By.id("spanMessage"));
		String err_msg_color=errormsg.getCssValue("color");
		
		System.out.println("Error msg color is "+err_msg_color);
		
		String err_msg_color_hex=Color.fromString(err_msg_color).asHex();
		
		System.out.println("Error Msg color in hexadecimal "+err_msg_color_hex);


	}

}
