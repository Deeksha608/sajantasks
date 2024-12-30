package automationtasks.testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase_003 
{
	WebDriver driver;
	TestCase_003(WebDriver driver)
	{
		this.driver=driver;		
	}
	
	@Test
	public void googlenews()
	{
		driver.get("https://www.news.google.com/");
		WebElement tab_India=driver.findElement(By.xpath("//div[@class='EctEBd']//a[text()='India']"));
		tab_India.click();
		List<WebElement> SourceChannels = driver.findElements(By.xpath("//div[@class='vr1PYe']//div[@class='vr1PYe']//div[@class='vr1PYe']"));
		List<WebElement> Time = driver.findElements(By.xpath("//div[@class='hvbAAd']//time"));
		List<WebElement> Headlines = driver.findElements(By.xpath("//a[@class='gPFEn']"));
		for(int i=0; i<5 && i<SourceChannels.size() && i<Time.size() && i<Headlines.size();i++)
		{
			String sourcechannelstext=SourceChannels.get(i).getText();
			String Timetext=Time.get(i).getText();
			String headlinestext=Headlines.get(i).getText();
			if(!sourcechannelstext.isEmpty() && !Timetext.isEmpty() && !headlinestext.isEmpty())
			{
				System.out.println("Source Channels:" +sourcechannelstext);
				System.out.println("Headlines:" +headlinestext);
				System.out.println("Time:" +Timetext);
			}
		}		
	}
	
	@Test
	public void googlenewsworld() 
	{
		driver.findElement(By.xpath("//a[@class='brSCsc']")).click();
		List<WebElement> Headline=driver.findElements(By.xpath("//a[@class='gPFEn ']"));
		List<WebElement> Time=driver.findElements(By.xpath("//div[@class='UOVeFe ']//time"));
		List<WebElement> sourcechannel=driver.findElements(By.xpath("//div[@class='vr1PYe']//div[@class='a7P8l']//div[@class='a7P8l'"));
		for(int i=0;i<15 && i<sourcechannel.size() && i<Headline.size() && i<Time.size();i++)
		{
			String sourcechannelText=sourcechannel.get(i).getText();
			String HealinesText=Headline.get(i).getText();
			String TimeText=Time.get(i).getText();
			if (!sourcechannelText.isEmpty() && !HealinesText.isEmpty() && !TimeText.isEmpty()) {
                System.out.println("Channel/Newspaper/Article: " + sourcechannelText);
                System.out.println("Headline: " + HealinesText);
                System.out.println("Time Posted: " + TimeText);
               
            }
		}
	}
}