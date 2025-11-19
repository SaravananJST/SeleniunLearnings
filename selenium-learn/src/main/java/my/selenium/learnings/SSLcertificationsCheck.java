package my.selenium.learnings;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLcertificationsCheck {

	public static void main(String[] args) {


		ChromeOptions chroptions = new ChromeOptions();
		chroptions.setAcceptInsecureCerts(true);
		ChromeDriver driver = new ChromeDriver(chroptions);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://expired.badssl.com/");
		

	}

}
