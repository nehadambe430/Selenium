package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_01 
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/Selenium%20Exercise/page01.html");
		By ref1=By.tagName("input");
		WebElement rv1=driver.findElement(ref1);
		rv1.sendKeys("admin");
		
		By ref2=By.id("pass");
		WebElement rv2 = driver.findElement(ref2);
		rv2.sendKeys("admin123");
		
		driver.close();
	}

}
