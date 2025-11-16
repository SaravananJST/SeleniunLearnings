package my.selenium.learnings;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
		Set <String> windows = driver.getWindowHandles();
		Iterator<String> iwindows = windows.iterator();
		String w1 = iwindows.next();
		String w2 = iwindows.next();
		driver.switchTo().window(w2);
		String username = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(w1);
	    driver.findElement(By.cssSelector("input[id='username']")).sendKeys(username);
	    String Extractedusername = driver.findElement(By.cssSelector("input[id='username']")).getText();
	    System.out.println(Extractedusername);
	    //driver.quit();
	    
		
		
	}

}
