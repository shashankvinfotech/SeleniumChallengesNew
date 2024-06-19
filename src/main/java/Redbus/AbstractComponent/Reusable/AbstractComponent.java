package Redbus.AbstractComponent.Reusable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponent {
	WebDriver driver;
	public AbstractComponent(WebDriver driver) {
		this.driver=driver;
	}
	
	public void WaitForElementToAppear(By findby) {
		WebDriverWait wait = new WebDriverWait(driver, 0);
		wait.until(ExpectedConditions.visibilityOfElementLocated(findby));
		
	}
}
