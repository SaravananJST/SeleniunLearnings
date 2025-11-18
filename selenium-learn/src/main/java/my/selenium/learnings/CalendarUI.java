package my.selenium.learnings;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalendarUI {

	public static void main(String[] args) {

		String date = "25";
		String Month = "8";
		String Year = "2025";
		String[] ExpectedDOB = {Month, date, Year};
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()='" + Year + "']")).click();
		List<WebElement> months = driver.findElements(By.cssSelector(".react-calendar__year-view__months__month"));
		int monthIndex = Integer.parseInt(Month) - 1;
		months.get(monthIndex).click();
		driver.findElement(By.xpath("//abbr[text()='" + date + "']")).click();

		//System.out.println(driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).getText()); 
		
		List<WebElement> list = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		
		for(int i=0; i<list.size(); i++) {
			String ActualDOB = list.get(i).getAttribute("value");
			System.out.println(ActualDOB);
			
			Assert.assertEquals(ActualDOB, ExpectedDOB[i]);
		}
		
		driver.quit();
		
		
	}

}
