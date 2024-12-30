package automationtasks.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class base 
{
	WebDriver driver;
	
	public base() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kdeek\\eclipse-workspace\\sajan\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void task1()
	{
		Testcase_001 tc1=new Testcase_001(driver);
		tc1.navtoAmazonPage();
		tc1.amzSearchBox("mobiles");
	}
	//@Test
	public void task2() 
	{
		TestCase_002 tc2=new TestCase_002(driver);
		tc2.navtoamazonpage();
		tc2.iphonestorage("iphones");
	}
	//@Test
	public void task3() 
	{
		TestCase_003 tc3=new TestCase_003(driver);
		tc3.googlenews();
		tc3.googlenewsworld();		
	}
	
	//@AfterTest
	public void close()
	{
		driver.quit();
	}	
}

/*

class AppTest {

    @Test(enabled=true)
    public static void Task_1_List_ProductTitles() throws InterruptedException {

        Task_1 task_1 = new Task_1(driver);

        task_1.navigateToAmazonPage();

        task_1.amazonSearch("mobiles");

        task_1.listProductTitles();
    }

    @Test(enabled = true)
    public static void Task_2_product_search_using_contains() throws InterruptedException {

        Task_2 task_2 = new Task_2(driver);

        task_2.navigateToAmazonPage();

        task_2.amazonSearch("iphone");

        task_2.product_search_using_contains();
    }

    @Test(enabled = true)
    public static void Task_3_print_GoogleNews_Headlines() throws InterruptedException {

        Task_3 task_3 = new Task_3(driver);

        task_3.navigateToGoogleNews();

        task_3.printGoogleNewsIndia();

        task_3.printGoogleNewsWorld();
    }

    @Test(enabled = true)
    public static void Task_4_print_weekends_of_the_month() throws InterruptedException {

        Task_4 task_4 = new Task_4(driver);

        task_4.navigateWebPage();

        task_4.printWeekendsofthemonth();

        task_4.selectCurrentDate();
    }

    @Test(enabled = true)
    public static void Task_5_print_values_from_Wikipedia() throws InterruptedException {
        Task_5 task_5 = new Task_5(driver);

        task_5.navigateToWikipediaPage();

        task_5.printFoundersList();
    }

    @Test(enabled = true)
    public static void Task_6_FlipKartTask_Calculate_Total_Amount() {

        Task_6 task_6 = new Task_6(driver);

        task_6.navigateToFlipkart();

        task_6.searchProduct("google pixel 7a");

        task_6.countProducts();

        task_6.SortBy("Popularity");

        task_6.addProductToCart();

        task_6.calculateProductAmount();
    }

    @Test(enabled = true)
    public static void Task_7_Amazon_Product_Calculate_Total_Amount() {

        Task_7 task_7 = new Task_7(driver);

        task_7.navigateToAmazon();

        task_7.searchProduct("Samsung Galaxy S24 Ultra 5G AI Smartphone (Titanium Black, 12GB, 256GB Storage)");

        task_7.navigateToAmazon();

        task_7.searchProduct(
                "Samsung Original 45W Power Adapter with Type C to C Cable, Compatible with Smartphone, Black");

        task_7.CalculateTotalAmount();
    }

    @Test(enabled = true)
    public static void Task_8_Check_RAM_SSD_in_Google_and_Amazon(){

        Task_8 task_8 = new Task_8(driver);

        task_8.navigateToGoogle();

        task_8.searchCrucialRAM_in_Google("Crucial 16GB DDR4-2400 SODIMM");

        task_8.search_Western_Digital_SSD_Drive_in_Google("1TB QLC WD Green SN350 NVMe™ SSD");

        task_8.searchinAmazon("Crucial CT16G4SFD824A 16GB 2400MHz 260-Pin SODIMM Laptop Memory (CT16G4SFD824A)","Western Digital WD Green SN350 NVMe 1TB, Upto 3200MB/s, 3 Y Warranty, PCIe Gen 3 NVMe M.2 (2280), Internal Solid State Drive (SSD) (WDS100T3G0C)");
    }

}
*/