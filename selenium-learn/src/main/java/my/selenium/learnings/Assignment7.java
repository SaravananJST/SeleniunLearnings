package my.selenium.learnings;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		int countofrows = driver.findElements(By.cssSelector(".table-display tbody tr th")).size();
		System.out.println(countofrows + " = countofrows");
		
		int countofcolumns = driver.findElements(By.xpath("//tr//td[1]")).size();
		System.out.println(countofcolumns+ " = countofcolumns");
		
		List<WebElement> secondrowelements = driver.findElements(By.xpath("//table[@class='table-display']//tbody//tr[3]"));
		for(int i=0; i<secondrowelements.size(); i++) {
			System.out.println(secondrowelements.get(i).getText()+ " = secondrowelements");
		}
		
		driver.quit();
	}

}
