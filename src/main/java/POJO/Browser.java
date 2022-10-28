package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	public class Browser {
		public static WebDriver OpenBrowser() 
		{
			System.setProperty("WebDriver.Chrome.Driver","C:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			 
			return driver;
		}
}
