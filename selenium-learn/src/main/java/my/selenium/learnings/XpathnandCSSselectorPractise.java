package my.selenium.learnings;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathnandCSSselectorPractise {

	public static void main(String[] args) {
		

		ChromeDriver  driver = new ChromeDriver();
	
		//<input type="text" id="username" name="user_name" placeholder="Enter Username">
		
		driver.findElement(By.id("username"));
		driver.findElement(By.cssSelector("#username"));
		
		driver.findElement(By.xpath("//input[@name='user_name']"));
		driver.findElement(By.cssSelector("name=user_name"));
		

	
		
		
		

	}

}
