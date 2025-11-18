package my.selenium.learnings;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement selectedoption = driver.findElement(By.id("checkBoxOption1"));
		selectedoption.click();

		List<WebElement> allcheckbox = driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println(allcheckbox.size());

		for (int i = 0; i < allcheckbox.size(); i++) {
			WebElement iallcheckbox = allcheckbox.get(i);
			if (iallcheckbox.isSelected()) {

				String trueselectedoption = iallcheckbox.getAttribute("value");
				System.out.println(trueselectedoption + " = Checkbox which is selected");

				Select selectingoption = new Select(driver.findElement(By.id("dropdown-class-example")));
				selectingoption.selectByValue(trueselectedoption);

				driver.findElement(By.id("name")).sendKeys(trueselectedoption);
				driver.findElement(By.id("alertbtn")).click();

				String alertmessage = driver.switchTo().alert().getText();
				System.out.println(alertmessage);

				String[] splitedword = alertmessage.split(",");
				String splitedword1 = splitedword[0];
				String[] splitedwordfinal = splitedword1.split(" ");
				String splitedwordfinal1 = splitedwordfinal[1];

				System.out.println(splitedwordfinal1);

				if (trueselectedoption.equalsIgnoreCase(splitedwordfinal1)) {
					System.out.println("The selected option is displayed on the alert message");
				}

				driver.switchTo().alert().accept();

			}

		}

		driver.quit();
	}

}
