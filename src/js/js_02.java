package js;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class js_02 
{
	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//enter email
		js.executeScript("document.getElementById('email').value='admin@gmail.com'");
		
		//enter password
		js.executeScript("document.getElementById('pass').value='admin123'");
		
		//click on loginbutton
		
		js.executeScript("document.getElementById('u_0_b').click()");
		
	}

}
