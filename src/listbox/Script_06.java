package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_06 {

	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Selenium_Notes/HTML_01/list.html");
		//Identify Listbox
		WebElement target_listbox = driver.findElement(By.id("subj"));
		
		Select s=new Select(target_listbox);
		
		List<WebElement> alloptions = s.getOptions();
		
		int testingoptions_count=0;
		
		for(int i=0; i< alloptions.size(); i++)
		{
			String option_text = alloptions.get(i).getText();
			if(option_text.contains("Testing"))
			{
				testingoptions_count++;
			}
		}
		
		System.out.println("Total Options related to testing "+testingoptions_count);
		
		

	}

}
