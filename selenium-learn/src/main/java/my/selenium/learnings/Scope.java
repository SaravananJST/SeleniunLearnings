package my.selenium.learnings;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Get the count of all the links in the page
		System.out.println(driver.findElements(By.tagName("a")).size() +" = Count of the links present in the page");
		
		//Get the count of all the links in the footer
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size()+ " = Count of all the links present in the footer");
		
		//Get the count of all the links in the single column footer
		WebElement DCcolumnlinks = driver.findElement(By.xpath("//div/table/tbody/tr/td/ul"));
		System.out.println(DCcolumnlinks.findElements(By.tagName("a")).size()+ " = Count of all the links present in the single column footer");
		
		//Checking all the links in the DCcoulumn are working as expected:
		for(int i = 1; i<DCcolumnlinks.findElements(By.tagName("a")).size(); i++)
		{
			
			String clcikingalllinks = Keys.chord(Keys.CONTROL,Keys.ENTER);
			DCcolumnlinks.findElements(By.tagName("a")).get(i).sendKeys(clcikingalllinks);
			Thread.sleep(3000);
			
		}
		
		//Getting the title of each links
		Set<String> allwindows = driver.getWindowHandles();
		Iterator<String> iallwindows = allwindows.iterator();
		while(iallwindows.hasNext())
		{
			driver.switchTo().window(iallwindows.next());
			System.out.println(driver.getTitle());
			
		}
		
	}

}
