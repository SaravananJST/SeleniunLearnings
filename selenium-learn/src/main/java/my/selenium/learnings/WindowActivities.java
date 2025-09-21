package my.selenium.learnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) 
	
	{
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://google.com");
		
		//user-like actions
		driver.navigate().to("https://rahulshettyacademy.com");

		driver.navigate().back();

		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		
		driver.findElement(By.xpath("//a[text()='Forgot your password?']"));
		driver.findElement(By.cssSelector("a[text='Forgot your password?']"));
		driver.findElement(By.linkText("Forgot your password?"));
		driver.findElement(By.partialLinkText("Forgot"));
		
		
		
	}

}
