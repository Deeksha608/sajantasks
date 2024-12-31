package automationtasks.testCases;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import junit.framework.Assert;

public class TestCase_002 {
	WebDriver driver;
	TestCase_002(WebDriver driver)
	{
		this.driver = driver;
	}
	@Test
	public void iphonesstorage() throws Exception
	{
		driver.get("https://www.amazon.in/");
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		Assert.assertTrue("Failed: Amazon Search box is not found", searchbox.isDisplayed());
		searchbox.click();
		searchbox.sendKeys("iphone 128 GB");
		WebElement searchbutton=driver.findElement(By.id("nav-search-submit-button"));
		searchbutton.click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']")));
		
		try
		{
			List<WebElement> iphoneslist=driver.findElements(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal'//span]"));
			int count=0;
			
			for(int i=0; i<iphoneslist.size(); i++)
			{
				String Product_title=iphoneslist.get(i).getText();
				if(Product_title.contains("128"))
				{
					count ++;
					System.out.println(Product_title);
				}
			}
			System.out.println(count);
		} catch (Exception e)
		{
			System.out.println("Exception");
		}		
	}
}