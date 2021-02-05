import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome 
{
	public static void main(String[] args)
	{
		ChromeDriver ch=new ChromeDriver();
		ch.get("https://www.google.com/");
		ch.get("https://www.facebook.com/");
		ch.close();
		
	}

}
