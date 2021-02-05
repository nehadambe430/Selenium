package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hidden_Division_popup_01
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		//open app
		driver.get("https://www.abhibus.com/");
		
		driver.findElement(By.id("AccLogin")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("mobileNo")).sendKeys("9075105511");
		
		//click on cheackbox
		
		driver.findElement(By.id("chk_refer_code")).click();

		
	}

}
