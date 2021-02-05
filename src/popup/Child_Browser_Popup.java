package popup;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_Browser_Popup
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		//identify all window ref id
		Set<String> ref=driver.getWindowHandles();
		
		//total window display count
		int window_count=ref.size();
		
		System.out.println(window_count);
	}

}
