package ShashankSharma;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class CopaExecution {
	
	public class CSVReaderUtility {

	    public List<String> readEmailAddresses(String filePath) {
	        List<String> emailAddresses = new ArrayList<>();
	        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
	            List<String[]> lines = reader.readAll();
	            for (String[] line : lines) {
	                if (line.length > 0) {
	                    emailAddresses.add(line[0]); // Assuming email addresses are in the first column
	                }
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return emailAddresses;
	    }
	}
	 boolean isFirstIteration = true;
	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException, CsvException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91903\\Documents\\chromedriver-win64_125_driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		 try (CSVReader reader = new CSVReader(new FileReader("C:\\Users\\91903\\Desktop\\1000_new_josh.csv"))) {
	            // Read email addresses from the CSV file
	            List<String[]> lines = reader.readAll();
	            List<String> emailAddresses = new ArrayList<>();
	            for (String[] line : lines) {
	                if (line.length > 0) {
	                    emailAddresses.add(line[0]); // Assuming email addresses are in the first column
	                }
	            }
	            boolean isFirstIteration = true;

	            for (String email : emailAddresses) {
		 driver.get("https://copafantasy.vinfotechprojects.com/");
			Thread.sleep(2000);
           if(isFirstIteration) {
			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[1] ")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/button")).click();
			 isFirstIteration = false;
			Thread.sleep(2000);
			
           }
			driver.findElement(By.xpath("//span[@class='border-btn link']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(" //input[@id='email']")).sendKeys(email);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345678");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div[2]/div[1]/form/div[2]/div/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Create Team']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Auto-pick']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Team Name']")).sendKeys("Rohit");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='mobile-hidden btn btn-primary btn-lg btn-block']")).click();
	 
	        // Log out from the email account (you need to replace the selectors and actions according to your email provider)
	        // Example for Gmail:
			Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[@class='clearfix']//img")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Logout']")).click();
			
	            }}
		 
	    
	}

}
