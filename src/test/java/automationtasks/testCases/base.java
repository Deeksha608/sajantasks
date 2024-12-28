package automationtasks.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class base 
{
	WebDriver driver;
	base(WebDriver driver)
	{
		this.driver=driver;
	}
	@BeforeTest
	public void browsers() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kdeek\\eclipse-workspace\\sajan\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void task1_mobiles() 
	{
		
	}
	
	@AfterTest
	public void close() 
	{
		driver.quit();		
	}
}