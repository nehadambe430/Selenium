import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_23 
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		
		WebElement emailfield=driver.findElement(By.id("email"));
		
		emailfield.sendKeys("neha123@gmail.com");
		
		String text = emailfield.getAttribute("value");
		System.out.println(text);
		


		
	}

}
