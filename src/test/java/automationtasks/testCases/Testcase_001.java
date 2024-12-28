package automationtasks.testCases;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase_001 {
	
	WebDriver driver;
	Testcase_001(WebDriver driver)
	{
		this.driver =driver;
	}
	
	public void navtoAmazonPage()
	{
		String url="https://www.amazon.in/";
		if(driver.getCurrentUrl().equals("https://www.amazon.in/"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void amzSearchBox(String product) 
	{
			WebElement amzsearchbox=driver.findElement(By.id("twotabsearchtextbox"));
			amzsearchbox.click();
			amzsearchbox.sendKeys(product);
			driver.findElement(By.id("nav-search-submit-button")).click();
			List<WebElement> mobileslist=driver.findElements(By.xpath("//div[@class='//*[@id=\"4e548c2a-4f8a-4707-96f4-edbf263e5ccf\"]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/a/h2']"));
			for(int i=0;i<=5 && i<mobileslist.size();i++)
				{
					String listitem = mobileslist.get(i).getText();
					Assert.assertFalse(listitem.isEmpty(), "Product title is empty");
					System.out.println("Product Title :" + listitem);
				}
	}  	
}
