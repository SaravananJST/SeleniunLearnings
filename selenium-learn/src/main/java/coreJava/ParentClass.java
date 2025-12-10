package coreJava;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParentClass {

	@BeforeMethod
	public void method3()
	{
		System.out.println("method3");
	}
	
	@AfterMethod
	public void method4()
	{
		System.out.println("method4");
	}
	
	@Test
	public void method1() {
		
		System.out.println("Method1");
	}
}
