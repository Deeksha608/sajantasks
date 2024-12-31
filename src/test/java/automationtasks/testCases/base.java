package automationtasks.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class base 
{
	WebDriver driver;	
	public base() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kdeek\\eclipse-workspace\\sajan\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void task1()
	{
		MobilesList_tc_01 tc1=new MobilesList_tc_01(driver);
		tc1.mobiletitles();		
	}
	
	@Test
	public void task2() throws Exception
	{
		TestCase_002 tc2=new TestCase_002(driver);
		tc2.iphonesstorage();
	}
	@Test
	public void task3()
	{
		TestCase_003 tc3=new TestCase_003(driver);
		tc3.googlenewsIndia();
		tc3.googlenewsWorld();
	}
	
	@Test
	public void task4()
	{
		TestCase_004 tc4=new TestCase_004();
		tc4.JQueryDatepicker();
	}
	
	@Test
	public void task5()
	{
		TestCase_005 tc5=new TestCase_005(driver);
		tc5.wikipedia();
	}
	
	@Test
	public void task7()
	{
		TestCase_007 tc7=new TestCase_007(driver);
		tc7.amazonlogin();
		tc7.SamsungShoppingcart();
	}
}