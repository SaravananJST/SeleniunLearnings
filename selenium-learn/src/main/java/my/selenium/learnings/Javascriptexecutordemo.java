package my.selenium.learnings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Javascriptexecutordemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("window.scrollBy(0,500)");
		
		jse.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int actualvalue = 0;
		
		for (int i=0; i<values.size();i++) {
			actualvalue = actualvalue + Integer.parseInt(values.get(i).getText());
			
		}
		
		System.out.println(actualvalue);
		
		driver.findElement(By.cssSelector(".totalAmount")).getText();
				
		int expectedvalue = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(": ")[1]);
		
		Assert.assertEquals(actualvalue, expectedvalue);
		
		driver.quit();

	}

}
