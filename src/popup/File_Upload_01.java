package popup;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Upload_01 
{
	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///D:/Selenium_Notes/HTML_01/FileUpload.html");
	
		WebElement rv=driver.findElement(By.id("fileuploadpopup"));
	
		rv.sendKeys("C:\\Users\\OMKAR\\Downloads\\Neha430.docx");
		
		/*
		String relative_path="..D:/Selenium_Notes/PopUp/popup.docx";
		File f=new File(relative_path);
		String absolute_path=f.getAbsolutePath();
		rv.sendKeys(absolute_path);
		*/
	}

}
