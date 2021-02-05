package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_03
{
	public static void main(String[] args) throws Exception
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///D:/Selenium_Notes/HTML_01/WebTable.html");
		
		//driver.findElement(By.xpath("./html/body/table/tbody/tr[2]/td[2]"));
		
		WebElement txt=driver.findElement(By.xpath("./html/body/table/tbody/tr[2]/td[2]"));
		
		String first_row_txt=txt.getText();
		
		System.out.println(first_row_txt);
		
		System.out.println("************************");
		
		/*Display Selenium subject cost as output
		 * Identify Selenium subject cost
		 * Print selenium cost as output
		 */
		
		WebElement sc=driver.findElement(By.xpath("./html/body/table/tbody/tr[5]/td[3]"));
		String selenium_cost=sc.getText();
		System.out.println("Selenium cost is :"+selenium_cost);
		System.out.println("************************");
		
		
		//all rows 
		WebElement row=driver.findElement(By.xpath("./html/body/table/tbody"));
		String all_row=row.getText();
		System.out.println(all_row);
		System.out.println("************************");
		
		
		//3rd rrow all cell
		
		WebElement t_r=driver.findElement(By.xpath("./html/body/table/tbody/tr[4]"));
		String t_row=t_r.getText();
		System.out.println(t_row);
		System.out.println("************************");
		
		
		//4th row 3rd cell
		
		WebElement r_4=driver.findElement(By.xpath("./html/body/table/tbody/tr[5]/td[3]"));
        String rd_4=r_4.getText();
        System.out.println(rd_4);
        System.out.println("************************");
		
		
        //all subject
       
        WebElement sub= driver.findElement(By.xpath("./html/body/table/tbody/tr/td[2]"));
       
        String all_sub=sub.getText();
        System.out.println(all_sub);
        System.out.println("************************");
        
        //sql subject and java cost
        
        WebElement r=driver.findElement(By.xpath(".html/body/table/tbody/tr[3]/td[2] | .html/body/table/tbody/tr[4]/td[3]"));
        String s= r.getText();
        System.out.println(s);
		
	}

}
