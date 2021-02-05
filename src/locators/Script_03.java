package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_03
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.className("fbIndex UIPage_LoggedOut _-kb _605a b_c3pyn-ahh chrome webkit win x1 Locale_en_GB cores-gte4 _19_u hasAXNavMenubar")).click();
		
		By ref1=By.id("u_0_2");
		WebElement rv1=driver.findElement(ref1);
		rv1.click();
		/*
		By ref2=By.name("firstname");
		WebElement rv2=driver.findElement(ref2);
		rv2.sendKeys("Neha");
		
		By ref3=By.name("lastname");
		WebElement rv3=driver.findElement(ref3);
		rv3.sendKeys("Dambe");*/
		
		driver.findElement(By.id("u_0_j")).sendKeys("sruthi");
	    driver.findElement(By.name("lastname")).sendKeys("karpuram");
	    driver.findElement(By.name("reg_email__")).sendKeys("84521636866");
	    driver.findElement(By.name("reg_passwd__")).sendKeys("il9HNJ1234");

		
		driver.close();
	}

}
