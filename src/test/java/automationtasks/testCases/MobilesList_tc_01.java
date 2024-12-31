package automationtasks.testCases;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MobilesList_tc_01
{
	WebDriver driver;
	MobilesList_tc_01(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void mobiletitles()
	{
		driver.get("https://www.amazon.in/");
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		Assert.assertTrue(searchbox.isDisplayed(), "False: Search box is not displayed");
		searchbox.click();
		searchbox.sendKeys("mobiles");
		WebElement searchbutton=driver.findElement(By.id("nav-search-submit-button"));
		searchbutton.click();		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']//span")));
		
		try
		{
			List<WebElement> searchresult=driver.findElements(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']//span"));
			
			for(int i=0; i<5 && i<searchresult.size();i++)
			{
				System.out.println("Product Title:" +searchresult.get(i).getText());
			}
		} catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		
	}

}
