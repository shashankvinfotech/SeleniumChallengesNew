package ShashankSharma;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Redbus.pageobjects.CalenderTestCases;
import Redbus.pageobjects.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;




public class Heart  {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91903\\Documents\\chromedriver-win64_125_driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		// Object creation Section
		LandingPage landingpage = new LandingPage(driver);
		CalenderTestCases CalenderTest = new CalenderTestCases(driver);
		
		//Calling from here
		landingpage.GoTo();
		landingpage.AccessCalender();
		List<WebElement>dates= CalenderTest.Weekends();
		
		// TODO Auto-generated method stub
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-notifications");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91903\\Documents\\chromedriver-win64_125_driver\\chromedriver-win64\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver(options);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://www.redbus.in/");
//		driver.findElement(By.className("labelCalendarContainer")).click();
//		Thread.sleep(2000);
//		WebElement date = driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[2]"));
//		Red_Bus_youtube obj = new Red_Bus_youtube();
		//obj.Weekends(driver);
		//obj.OnlyFriday(driver);
		//obj.scrollspecificmonth(driver);


	}

}
