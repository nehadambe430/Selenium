package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Upload_02 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.freepdfconvert.com/");

		WebElement rv=driver.findElement(By.xpath(".//div[@class='btn-wrapper upload-btn']"));
		rv.click();
		
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_N);
		
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);

		
		
	}

}
