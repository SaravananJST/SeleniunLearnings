package my.selenium.learnings;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[text()=' Kochi (COK)']")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("(//a[text()=' Coimbatore (CJB)'])[2]")).click();
		//Alternative way for index:
		//Parentxpath(one space) Childxpath - Parent child relationship xpath:
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[text()=' Coimbatore (CJB)']")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).isEnabled());
		driver.quit();

	}

}
