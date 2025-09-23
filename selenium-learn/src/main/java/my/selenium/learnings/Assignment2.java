package my.selenium.learnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("(//input[@class=\"form-control ng-untouched ng-pristine ng-invalid\"])[1]")).sendKeys("Saravanan");
		driver.findElement(By.xpath("(//div[@class='form-group'])[2]/child::input[@class=\"form-control ng-untouched ng-pristine ng-invalid\"]")).sendKeys("saravananmuthusamy2018@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"exampleInputPassword1\"]")).sendKeys("Test1234");
		driver.findElement(By.xpath("//div[@class=\"form-check\"]/child::input[@id=\"exampleCheck1\"]")).click();
		
		WebElement Dropdown = driver.findElement(By.xpath("//select[@id=\"exampleFormControlSelect1\"]"));
		
		Select option = new Select (Dropdown);
		option.selectByContainsVisibleText("Male");
		
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("(//input[@class=\"form-control\"])[2]")).sendKeys("09-90-90");
		driver.findElement(By.cssSelector("input.btn.btn-success")).click();
		
		WebElement message = driver.findElement(By.xpath("//div[contains(@class,'alert alert-success')]"));
		System.out.println(message.getText());
		
		driver.quit();

		
	}
	

}
