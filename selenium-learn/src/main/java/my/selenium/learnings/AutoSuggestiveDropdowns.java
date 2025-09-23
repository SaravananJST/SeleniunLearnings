package my.selenium.learnings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdowns {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("#autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> totaloptions = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for (WebElement options: totaloptions)
		{
			if(options.getText().equalsIgnoreCase("India"))
			{
				options.click();
				break;
			}
		}
		System.out.println(driver.findElement(By.cssSelector("#autosuggest")).getAttribute("value"));
		driver.quit();
		
	}

}
