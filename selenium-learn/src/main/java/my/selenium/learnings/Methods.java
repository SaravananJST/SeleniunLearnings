package my.selenium.learnings;

public class Methods {

	public static void main(String[] args) {

		//Object created for the method:
		Methods	callMethod = new Methods();
		callMethod.method1();
				
		//Printing return value
		String callmethod2 = callMethod.method1();
		System.out.println(callmethod2);


	}
	
		//Methods - It can store a set of codes which can be used whenever it is needed in future.
		//It should be outside of the execution of main method(Main blog)
		//It can be called inside by creating a object for it.
		
		public String method1()  //public - it can be accessed by other classes, Void – Return type 
		//(Used when we don't want the method to return anything)
		{  
		System.out.println("Method is declared");
		return "Return value";  //To use return, change the return type (Void --> String)
		}

}
