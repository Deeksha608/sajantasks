package automationtasks.testCases;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase_001 {
	
	WebDriver driver;
	@BeforeTest
	public void browsers() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kdeek\\eclipse-workspace\\sajan\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void mobiles() 
	{
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//List<WebElement> mobileslist=driver.findElements(By.xpath("//span[@class='a-size-medium a-spacing-none a-color-base a-text-normal']"));		
		List<WebElement> mobileslist=driver.findElements(By.xpath("//div[@class='//*[@id=\"4e548c2a-4f8a-4707-96f4-edbf263e5ccf\"]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/a/h2']"));
		for(int i=0;i<=5 && i<mobileslist.size();i++) 
		{
			 String listitem = mobileslist.get(i).getText();
             Assert.assertFalse(listitem.isEmpty(), "Product title is empty");
             System.out.println("Product Title :" + listitem);
		}
	}  
	
	@AfterTest
	public void close() 
	{
		driver.quit();		
	}
}
