package my.selenium.learnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement checkbox = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		System.out.println(checkbox.isSelected());
		checkbox.click();
		System.out.println(checkbox.isSelected());
		
		
		//Count of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.quit();

	}

}
