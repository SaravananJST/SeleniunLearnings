package my.selenium.learnings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChrometoEdge {

	public static void main(String[] args) 
	
	{
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Saravanan\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		//Need to give the executable file location in our local manager --> C:\\Users\\Saravanan\\Downloads\\edgedriver_win64\\msedgedriver.exe
		WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.in/");
        System.out.println(driver.getCurrentUrl());  //Getting current URL
        System.out.println(driver.getTitle());  //getting Title
        driver.quit(); //Closing all the windows opened by selenium

	}

}
