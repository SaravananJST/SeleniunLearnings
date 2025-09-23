package my.selenium.learnings;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_functionality {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		String[] itemsNeeded = { "Cauliflower", "Mushroom", "Banana", "Cashews" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		Thread.sleep(3000);

		addtoCartItems(driver, itemsNeeded);

		driver.findElement(By.cssSelector("img[alt='Cart']")).click();

		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));

		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

		driver.findElement(By.cssSelector("button.promoBtn")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}

	public static void addtoCartItems(WebDriver driver, String[] itemsNeeded) {
		int j = 0;
		List<WebElement> allProducts = driver.findElements(By.xpath("//h4[@class='product-name']"));

		for (int i = 0; i < allProducts.size(); i++) {
			String[] product = allProducts.get(i).getText().split("-");

			String productName = product[0].trim();

			List<String> itemsListed = Arrays.asList(itemsNeeded);

			if (itemsListed.contains(productName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				if (j == itemsNeeded.length) {
					break;
				}
			}

		}
	}
}