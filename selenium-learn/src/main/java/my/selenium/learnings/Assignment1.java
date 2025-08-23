package my.selenium.learnings;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		WebElement option1 = driver.findElement(By.id("checkBoxOption1"));
		option1.click();
		System.out.println(option1.isSelected());
	
		option1.click();
		System.out.println(option1.isSelected());
		
		List<WebElement> checkbox = driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println(checkbox.size());
		
		driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		

	}

}
