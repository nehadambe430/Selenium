package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_23 
{
	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///D:/Selenium_Notes/Locaters/Page_07.html");
		
		
		WebElement l1=driver.findElement(By.id("Link1"));
		
		String l1text=l1.getText();
		System.out.println(l1text);
		
		WebElement l2=driver.findElement(By.partialLinkText("Google"));
		
		String l2text=l2.getText();
		System.out.println(l2text);
		
		String m3=driver.findElement(By.id("msg1")).getText();
		System.out.println(m3);
		
		
		//WebElement m4=driver.findElement(By.xpath(".//span[text()='Msg2']"));
		//String msg4=m4.getText();
		
	//	System.out.println(msg4);
		
		
		String s=driver.findElement(By.xpath(".//span[contains(text(),'Msg2')]")).getText();
		
		System.out.println(s);

		//driver.close();
	}

}
