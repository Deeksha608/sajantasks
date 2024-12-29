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
	
	public boolean navtoAmazonPage()
	{
		String url="https://www.amazon.in/";
	        if (!driver.getCurrentUrl().equals(url)) {
	            driver.get(url);
	        }
	        return false;
	 }	
	@Test
	public void amzSearchBox(String product) 
	{
			WebElement amzsearchbox=driver.findElement(By.id("twotabsearchtextbox"));
			amzsearchbox.click();
			amzsearchbox.sendKeys(product);
			driver.findElement(By.id("nav-search-submit-button")).click();
			List<WebElement> mobileslist = driver
                    .findElements(By.xpath("//h2[@class='//*[@id=\"3d8638a0-9602-4a32-a447-1b903d9e1ae5\"]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/a/h2']"));

			for(int i=0;i<=5 && i<mobileslist.size();i++)
				{
					String listitem = mobileslist.get(i).getText();
					Assert.assertFalse(listitem.isEmpty(), "Product title is empty");
					System.out.println("Product Title :" + listitem);
				}
   	}  	
}