package my.selenium.learnings;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chromeoptionsandothers {

	public static void main(String[] args) throws IOException {


		ChromeOptions chroptions = new ChromeOptions();
		chroptions.setAcceptInsecureCerts(true);
		ChromeDriver driver = new ChromeDriver(chroptions);
		
		//Using proxy
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("myprozy:4444");
		chroptions.setCapability("proxy", proxy);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//Disabling unwanted popup:	
		//chroptions.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Saravanan\\Screenshots\\ss1.png"));
		
	}

}
