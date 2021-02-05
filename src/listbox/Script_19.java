package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_19
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		//click on create account button
		driver.findElement(By.id("u_0_2")).click();;
		
		Thread.sleep(3000);
		//identify month listbox
		WebElement month_listbox = driver.findElement(By.id("month"));

		
		//select option
		
		Select s=new Select(month_listbox);
		
		//identify default selected option
		WebElement default_option = s.getFirstSelectedOption();
		
		String str = default_option.getText();
		System.out.println(str);
	}

}
