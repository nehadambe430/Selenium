

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_26 {

	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Selenium_Notes/Locaters/Page_07.html");
		//Link1
		String link1_text = driver.findElement(By.id("Link1")).getText();
		System.out.println(link1_text);
		//Link2
		String link2_text = driver.findElement(By.partialLinkText("Google")).getText();
		System.out.println(link2_text);
		//TextMsg1
		String msg1_text = driver.findElement(By.id("msg1")).getText();
		System.out.println(msg1_text);
		//TextMsg2
		String msg2_text = driver.findElement(By.partialLinkText("Msg2")).getText();
		System.out.println(msg2_text);
		
		
		
		
		
		
		
		
	}

}
