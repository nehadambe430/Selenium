package basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup_09 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.naukri.com");
		
		Set<String> ref=driver.getWindowHandles();
		Iterator<String> itr=ref.iterator();
		
		
		while(itr.hasNext())
		{
			String w_rid=itr.next();
			driver.switchTo().window(w_rid);
			
			String title=driver.getTitle();
			String url=driver.getCurrentUrl();
			
			System.out.println(title);
			System.out.println(url);
		}
		
		
	}

}
