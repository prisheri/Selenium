package BDDFrameowrk.BDDFrameowrk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchURL {
	public static void main(String[] args)
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
	}
	
	

}
