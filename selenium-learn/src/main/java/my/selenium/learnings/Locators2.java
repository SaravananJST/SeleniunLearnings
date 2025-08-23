package my.selenium.learnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) {


		//Sibling - Child to parent transverse
		
		//Absolute xpath - /html/body/header (Starts with single slash and it starts from the root of the html code)
		//Relative xpath - Directly starting from the code he sees and not from the starting point of the code i.e //header
		
		//Parent to sibling and sibling to sibling - //header/div/button[1]/following-sibling::button[1] 
		WebDriver driver = new ChromeDriver();

		// Sibling - Child to parent traverse

		//header/div/button[1]/following-sibling::button[1]

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());



		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		
		
	}

}
