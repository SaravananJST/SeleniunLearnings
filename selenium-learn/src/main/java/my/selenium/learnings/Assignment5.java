package my.selenium.learnings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Nested Frames")).click();

		WebElement parentframe = driver.findElement(By.cssSelector("frameset[rows='50%,50%'] frame"));
		driver.switchTo().frame(parentframe);

		WebElement childframe = driver.findElement(By.cssSelector("frame[name='frame-middle']"));
		driver.switchTo().frame(childframe);

		System.out.println(driver.findElement(By.id("content")).getText() + " = Word preset in the middle frame");

		driver.quit();

	}

}
