package Redbus.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Redbus.AbstractComponent.Reusable.AbstractComponent;

public class LandingPage extends AbstractComponent{
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className ="labelCalendarContainer")
	WebElement ClickOnCalender;
	
	@FindBy(xpath ="//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[2]")
	WebElement Date;
	
	public void GoTo() {
		driver.get("https://www.redbus.in/");
	}
	public void AccessCalender() {
		ClickOnCalender.click();	
	}
	
	


}
