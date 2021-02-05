package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pomp_Alert
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		
		//click on button
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Thread.sleep(3000);
		
		//switch focus to alert
		
		Alert a=driver.switchTo().alert();
		
		String txt=a.getText();
		System.out.println(txt);
		
		a.sendKeys("Hello Selenium");
		
		Thread.sleep(3000);
		
		a.accept();

		
	}

}
