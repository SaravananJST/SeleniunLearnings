package my.selenium.learnings;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alerts {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.name("enter-name")).sendKeys("Saravanan");
		driver.findElement(By.cssSelector("input[value='Alert']")).click();
		String alertText1 = driver.switchTo().alert().getText();
		System.out.println(alertText1);
		driver.switchTo().alert().accept();
		Assert.assertEquals(alertText1, "Hello Saravanan, share this practice page and share your knowledge");

		driver.findElement(By.name("enter-name")).sendKeys("Saravanan");
		driver.findElement(By.cssSelector("input[value='Confirm']")).click();
		String alertText2 = driver.switchTo().alert().getText();
		System.out.println(alertText2);
		driver.switchTo().alert().dismiss();
		Assert.assertEquals(alertText2, "Hello Saravanan, Are you sure you want to confirm?");

		driver.quit();
	}

}