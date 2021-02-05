package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Download 
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://app.prntscr.com/en/index.html");

		driver.findElement(By.xpath("(//div[@class='button__wrap'])[1]")).click();
		
		Thread.sleep(3000);
		
		//Handle filedownload popup
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_RIGHT);
		
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_LEFT);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		


	}

}
