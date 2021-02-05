package popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_Window_Popup_01
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.naukri.com");
		//Identify all the windows refid's
		
		Set<String> ref=driver.getWindowHandles();
		Iterator<String> itr=ref.iterator();
		
		while(itr.hasNext())
		{
			String window_refid=itr.next();
			driver.switchTo().window(window_refid);
			
			String title=driver.getTitle();
			String url=driver.getCurrentUrl();
			
			System.out.println(title);
			System.out.println(url);
		}
			

		
	}

}
