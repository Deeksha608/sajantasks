package automationtasks.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestCase_004 
{
	WebDriver driver;
	
	@Test
	public void JQueryDatepicker()
	{
		driver.get("https://jqueryui.com/datepicker/");
		
	}
}
/*

Print current month WeekEnd Dates.
Print the Current Date in format DD-MMMMM-YYYY.
*/