package automationtasks.testCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestCase_003 
{
	WebDriver driver;
	TestCase_003(WebDriver driver)
	{
		this.driver=driver;		
	}
	
	@Test
	public void googlenewsIndia()
	{
		driver.get("https://www.news.google.com/");
		try
		{
			WebElement tab_India = driver.findElement(By.xpath("//div[@class='EctEBd']//a[text()='India']"));
			tab_India.click();
			
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h1[text()='India']")));
			
			List<WebElement> SourceChannels = driver.findElements(By.xpath("//div[@class='f9uzM']//div[@class='MCAGUe']//div[@class='a7P8l']//div[@class='vr1PYe']"));
			List<WebElement> Headline = driver.findElements(By.xpath("//article[@class='UwIKyb']//a[@class='gPFEn']"));
			List<WebElement> Time = driver.findElements(By.xpath("//div[@class='UOVeFe Jjkwtf']//time"));
			System.out.println("India");
			
			for(int i=0; i<15 && i<Headline.size() && i<SourceChannels.size() && i<Time.size(); i++)
			{
				String headlines_txt=Headline.get(i).getTagName();
				String Time_txt=Time.get(i).getText();
				String SourceChannels_txt=SourceChannels.get(i).getText();
				if(!SourceChannels_txt.isEmpty() && !Time_txt.isEmpty() && !headlines_txt.isEmpty())
				{
					System.out.println("Headline:" +headlines_txt);
					System.out.println("Source Channel:" +SourceChannels_txt);
					System.out.println("Time:" +Time_txt);
					System.out.println("==========");
				}				
			}			
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void googlenewsWorld()
	{
		try {
	            WebElement worldClick = driver.findElement(By.xpath("//c-wiz[@jsrenderer='xhgKH']//div[@class='EctEBd']//a[text()='World']"));
	            worldClick.click();

	            driver.navigate().refresh();

	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='IbUd0d']//h1")));

	            System.out.println("News from World");

	            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//article[@class='UwIKyb']//div[@class='MCAGUe']//div[@class='a7P8l']//div[@class='vr1PYe']")));

	            List<WebElement> sourceChannels = driver.findElements(By.xpath("//article[@class='UwIKyb']//div[@class='MCAGUe']//div[@class='a7P8l']//div[@class='vr1PYe']"));
	            List<WebElement> headlines = driver.findElements(By.xpath("//article[@class='UwIKyb']//a[@class='gPFEn']"));
	            List<WebElement> time = driver.findElements(By.xpath("//article[@class='UwIKyb']//div[@class='UOVeFe Jjkwtf']//time"));

	            for (int i = 0; i < 15 && i < sourceChannels.size() && i < headlines.size() && i < time.size(); i++) 
	            {
	                String sourceChannelText = sourceChannels.get(i).getText();
	                String headlineText = headlines.get(i).getText();
	                String timeText = time.get(i).getText();

	                if (!sourceChannelText.isEmpty() && !headlineText.isEmpty() && !timeText.isEmpty()) 
	                {
	                    System.out.println("Channel/Newspaper/Article: " + sourceChannelText);
	                    System.out.println("Headline: " + headlineText);
	                    System.out.println("Time Posted: " + timeText);
	                    System.out.println("==============");
	                }
	            }
	        } catch (Exception e) {
	            // TODO: handle exception
	            e.printStackTrace();
	        }
	    }
}