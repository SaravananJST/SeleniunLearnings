package my.selenium.learnings;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();

		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("credentials_enable_service", false);

		prefs.put("password_manager_enabled", false);

		Map<String, Object> profile = new HashMap<String, Object>();

		profile.put("password_manager_leak_detection", false);

		prefs.put("profile", profile);

		options.setExperimentalOption("prefs", prefs);

		ChromeDriver driver = new ChromeDriver(options);

		//driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		String username = driver.findElement(By.cssSelector("p[class='text-center text-white']")).getText();
		String extractedusername = username.split("is")[1].trim().split("and")[0].trim();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(extractedusername);
		//System.out.println(driver.findElement(By.xpath("//input[@id='username']")).getAttribute("value"));
		
		String extractedPassword = username.split("Password is")[1].trim().split("\\)")[0];
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys(extractedPassword);
		//System.out.println(driver.findElement(By.cssSelector("input[id='password']")).getAttribute("value"));
		
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Okay']")));
	    driver.findElement(By.xpath("//button[text()='Okay']")).click();
		
		Select dropdown = new Select(driver.findElement(By.cssSelector("select.form-control")));
		dropdown.selectByVisibleText("Consultant");
		
		driver.findElement(By.cssSelector("input[id='terms']")).click();
		driver.findElement(By.cssSelector("input[id='signInBtn']")).click();
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		List<WebElement> items = driver.findElements(By.cssSelector("button[class='btn btn-info']"));
		
		for(int i=0; i<items.size();i++) {
		
			WebElement allitems = items.get(i);
			allitems.click();
		}
		driver.findElement(By.partialLinkText("Checkout")).click();
		
		//driver.quit();
		
		
		

	}

}