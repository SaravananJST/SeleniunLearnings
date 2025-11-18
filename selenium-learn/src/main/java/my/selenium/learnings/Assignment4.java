package my.selenium.learnings;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> window = driver.getWindowHandles();
		Iterator<String> iwindow = window.iterator();
		String iwindow1 = iwindow.next();
		String iwindow2 = iwindow.next();
		
		driver.switchTo().window(iwindow2);
		
		System.out.println(driver.findElement(By.xpath("//div[@class='example']//h3")).getText() +" = Child window message");
		
		driver.switchTo().window(iwindow1);
		
		System.out.println(driver.findElement(By.xpath("//div[@class='example']//h3")).getText()  +" = Parent window message");
		
		driver.quit();

	}

}
