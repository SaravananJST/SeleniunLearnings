package my.selenium.learnings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//Implicite wait - giving time for the system to find the element until it is found
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Id
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");     	
		
		//Name
		driver.findElement(By.name("inputPassword")).sendKeys("hello1234");	
		
		//Class name
		driver.findElement(By.className("submit")).click();
		
		//CSS selector and Xpath are universal and can be used for any HTML codes unlike others locators
		//For CSS Selector, there are two types, 1 - Tagname.Classname and 2 - Tagname#Id. By this two methods we can combine two different elements to become one CSS element.
		//If both Id and class is not available, we can use 'Tagname[Attribute='Value']' Attribute = any type of element.
		
		//To check the CSS element is unique via console use $('CSS value')
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		//linktext - If the tagname is 'a' then it is link text.
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(1000);
		
		//Xpath
		//Tagname[@Attribute='Value']
		//ex. input[@placeholder = 'name']
		//Checking in console - $x('//input[@placeholder="Name"]')
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Saravanan");
		
		//Customized CSS selector
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("saravananicar001+test55test5@gmail.com");
		
		//Clear content
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		
		//Index based xpath
		//driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("saravananicar001+test565test@gmail.com");
		
		//Same for the CCS selector - Sometimes there will be hidden attributes in the codes which can used by the help of CSS locators
		//Tagname[@attribute='Value']:nth-child(Index)
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("saravananicar001+test565test@gmail.com");
		
		//By pure tags - Parent to child Xpath
		//form = Parent, /input = Child and we have used the index here too.	
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("7010175272");
		
		//Only one class name is available and we can use CSS selector:
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		//Parent to child Css selector
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		//We get exception - ElementClickInterceptedException because the page is changed after during the process, so we need to add some wait on it.
		//Thread method is added above.
		
		//Combination of Parent to child, attributes and index
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		
		Thread.sleep(1000);
		
		//CSS selector with attribute
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");

		//Can use CSS selector for the elements which change dynamically
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

		driver.findElement(By.id("chkboxOne")).click();

		//Xpath with contains
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
		
		
	}

}