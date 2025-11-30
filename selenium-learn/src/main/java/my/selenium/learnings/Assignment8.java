package my.selenium.learnings;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("Ne");
		// WebElement suggestions = driver.findElement(By.cssSelector(".ui-menu-item-wrapper"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".ui-menu-item-wrapper"))));
		
		
		
		WebElement countryvalue = driver.findElement(By.xpath("//ul[@id='ui-id-1'] //div[@id='ui-id-281']"));
		 
		Actions action = new Actions(driver);
		action.moveToElement(countryvalue).perform();
		
		
		
		
	}

}
