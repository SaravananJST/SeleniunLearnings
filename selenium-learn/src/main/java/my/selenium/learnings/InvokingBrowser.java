package my.selenium.learnings;

import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingBrowser {

	public static void main(String[] args) {
		 ChromeDriver driver = new ChromeDriver();
	        driver.get("https://www.amazon.in/");
	        System.out.println(driver.getCurrentUrl());  //Getting current URL
	        System.out.println(driver.getTitle());  //getting Title
	        driver.quit(); //Closing all the windows opened by selenium
	        //If using driver.close(), socket error will be displayed. So, need to use wait method.
	        
	   
	}

}
