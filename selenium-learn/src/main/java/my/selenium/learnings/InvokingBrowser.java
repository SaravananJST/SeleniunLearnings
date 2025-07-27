package my.selenium.learnings;

import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingBrowser {

	public static void main(String[] args) {
		 ChromeDriver driver = new ChromeDriver();
	        driver.get("https://google.com");
	        driver.close();

	}

}
