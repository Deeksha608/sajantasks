package automationtasks.testCases;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase_005 
{
	WebDriver driver;
	TestCase_005(WebDriver driver)
	{
		this.driver=driver;
	}
	@Test
	public void wikipedia() 
	{
		driver.get("https://www.wikipedia.org/");
		WebElement Searchbox=driver.findElement(By.id("searchInput"));
		Searchbox.click();
		Searchbox.sendKeys("Apple Inc.");
		WebElement Searchbutton=driver.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']"));
		Searchbutton.click();
		
		List<WebElement> Founderslist = driver.findElements(By.xpath("(//div[@class='plainlist'])[4]//ul/li/a"));
		for (WebElement foundersListElement : Founderslist) 
		{
            String foundersListText = foundersListElement.getText();
            System.out.println("Founders List: " + foundersListText);
        }
	}
}