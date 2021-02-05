package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listbox_08 
{
	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///D:/Selenium_Notes/HTML_01/list.html");
		
		WebElement target_listbox=driver.findElement(By.id("subj"));
		
		Select s=new Select(target_listbox);
		
		boolean value = s.isMultiple();
		
		if(value)
		{
			System.out.println("Multi selectable");
		}
		else
		{
			System.out.println("Not Multiselectable");
		}
		
		
	}

}
