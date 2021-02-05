package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_16
{
	
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///D:/Selenium_Notes/HTML_01/list.html");
		
		WebElement target_listbox = driver.findElement(By.id("subj"));
		
		Select s=new Select(target_listbox);
		
		List<WebElement> ref = s.getOptions();
		
		//select all options
		for(int i=0;i<ref.size();i++)
		{
			s.selectByIndex(i);
		}
		
		//identify only selected option
		
		List<WebElement> ref1 = s.getAllSelectedOptions();
		
		for(int i=0;i<ref1.size();i++)
		{
			String str = ref1.get(i).getText();
			
			System.out.println(str);
		}
		
	}

}
