package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_17 
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
		
		//identify first option selected
		
		WebElement first_option = s.getFirstSelectedOption();
		String opt_text = first_option.getText();
		System.out.println(opt_text);
		
	}

}
