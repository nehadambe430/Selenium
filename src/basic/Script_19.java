package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_19
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement element=driver.findElement(By.id("logInPanelHeading"));
		
		String element_size=element.getCssValue("font-size");
		
		System.out.println("font size is:"+element_size);
		
	}
	

}
