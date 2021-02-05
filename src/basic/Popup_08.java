package basic;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup_08 
{
	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();

		driver.get("https://www.naukri.com/");

		Set<String> ref=driver.getWindowHandles();

		//total window display count
		int window_count=ref.size();

		System.out.println(window_count);
	}

}
