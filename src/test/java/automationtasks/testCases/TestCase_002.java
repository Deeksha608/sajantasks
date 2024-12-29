package automationtasks.testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase_002 
{
	WebDriver driver;
	TestCase_002(WebDriver driver)
	{
		this.driver=driver;		
	}
	
	public boolean navtoamazonpage() 
	{
		String url="https://www.amazon.in/";
	        if (!driver.getCurrentUrl().equals(url)) {
	            driver.get(url);
	        }
	        return false;
	 }	
	
	@Test
	public void iphonestorage(String product)
	{
		WebElement amzsearchbox=driver.findElement(By.id("twotabsearchtextbox"));
		amzsearchbox.click();
		amzsearchbox.sendKeys(product);
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> storage=driver.findElements(By.xpath("//*[@id=\"d23ea682-c17c-4269-be81-1b8b60b98dc4\"]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/a/h2"));
		int count=0;
		for(int i=0;i<storage.size();i++)
		{
			if(storage.get(i).getText().contains("128 GB"))
			{
				count ++;
				System.out.println("Product Title is:" +storage.get(i).getText());
			}
		}
		System.out.println(count);
	}
	

}
