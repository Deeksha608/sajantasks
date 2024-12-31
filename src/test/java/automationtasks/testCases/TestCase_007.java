package automationtasks.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase_007 
{
	WebDriver driver;
	TestCase_007(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@Test
	public void amazonlogin()
	{
		driver.get("https://www.amazon.in/");
		WebElement SignIn = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		SignIn.click();
		WebElement Inp_email = driver.findElement(By.name("email"));
		Inp_email.sendKeys("6309088932");
		WebElement Continue_btn = driver.findElement(By.xpath("//span[@class='a-button a-button-span12 a-button-primary']"));
		Continue_btn.click();
		WebElement Inp_password = driver.findElement(By.name("password"));
		Inp_password.sendKeys("deeksha11");
		WebElement Signin_btn= driver.findElement(By.xpath("//span[@class='a-button a-button-span12 a-button-primary auth-disable-button-on-submit']"));
		Signin_btn.click();
		
		String url="https://www.amazon.in/?ref_=nav_ya_signin";
		if(driver.getCurrentUrl().equals(url))
		{
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void SamsungShoppingcart()
	{
		WebElement Searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		Searchbox.sendKeys("Samsung Galaxy S24 Ultra 5G AI Smartphone (Titanium Black, 12GB, 256GB Storage)");
		WebElement Search_btn = driver.findElement(By.id("nav-search-submit-button"));
		Search_btn.click();
		
		
		
	}
}
