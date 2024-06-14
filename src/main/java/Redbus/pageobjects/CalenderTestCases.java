package Redbus.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Redbus.AbstractComponent.Reusable.AbstractComponent;

public class CalenderTestCases extends AbstractComponent {
	
	WebDriver driver;
	
	public CalenderTestCases(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//span[contains(@class,'bwoYtA')]")
	List<WebElement>dates;
	public List<WebElement> Weekends() {
		for(WebElement date1:dates) {
			String weekend = date1.getText();
			System.out.println(weekend);		
	    }
		return dates;
	}
	
	
	
	


}
