//using Select class not static methods
package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_03 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///D:/Selenium_Notes/HTML_01/list.html");
		
		//identify listbox
		WebElement target_listbox = driver.findElement(By.id("subj"));
		target_listbox.click();
		Thread.sleep(2000);
		
		//create select class object
		Select s=new Select(target_listbox);
		
		//select index
		//s.selectByIndex(3);
		
		//s.selectByValue("SQL"); NOT PERFORM
		
		s.selectByVisibleText("JAVA");

		
	}

}
