package popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_Window_Popup_02 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.get("http://www.naukri.com");

		//Identify all window ref id
		Set<String> ref=driver.getWindowHandles();
		/*
		//Approach 01
		Iterator<String> itr=ref.iterator();
		itr.next();//refid of parent
		String childwindow_refid =itr.next();
		driver.switchTo().window(childwindow_refid);
		driver.close();
		 */

		//Approach 02
		String parent_ref_id=driver.getWindowHandle();
		Iterator<String> itr=ref.iterator();

		while(itr.hasNext())
		{
			String refid=itr.next();
			if(!parent_ref_id.equals(refid))
			{
				driver.switchTo().window(refid);
				driver.close();

			}
		}



	}

}
