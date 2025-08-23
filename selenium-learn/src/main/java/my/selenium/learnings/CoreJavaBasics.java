package my.selenium.learnings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CoreJavaBasics {

	public static void main(String[] args) {
		
		//To store a value in the variable name, int=datatype, 3=value, myname=variable name.
		int mynum=3;
		
		//for sentence:
		String sentence = "CoreJavaBasics";
		
		//Single character:
		char letter = 'l';
		
		//Decimals;
		double height = 6.2;
		
		//Boolean
		boolean isItTrue = true;
		
		//Printing
		System.out.println(mynum + " is the value i want to store");
		
		//Printing along with variables
		System.out.println(sentence);
		
		//Printing any string
		System.out.println("sentence");
		
		//Arrays in Java - It can store multiple values in single variable
		//Array of integers
		int[] arrIntegers =  new int[5]; //Need to mention how many values can be stored and the size of the array is declared right from the start
		arrIntegers[0] = 1;
		arrIntegers[1] = 45;
		arrIntegers[2] = 34;
		arrIntegers[3] = 6;
		arrIntegers[4] = 56;
		
		//For loop
		for(int i=0; i<arrIntegers.length; i++)
		{
		System.out.println(arrIntegers[i]);
		}
		
		int[] arrIntegers2 = {1,45,44,6,56};
		System.out.println(arrIntegers2[4]);
		
		//For loop
		for(int i=0; i<arrIntegers2.length; i++)
		{
		System.out.println(arrIntegers2[i]);
		}
		
		//Array of strings
		String[] name = {"java", "selenium", "eclipse"};
		
		for (int i = 0; i < name.length; i++) {
		System.out.println(name[i]);
		}
		
		//Enhanced for loop
		for (String Ename: name)
		{
		System.out.println(Ename);
		}
		
		//If, else 
		for(int i=0; i<arrIntegers2.length; i++)
		{
			if (arrIntegers2[i]%2==0) 
			{
				System.out.println(arrIntegers2[i] + " is multiple of two");
				break; //The loop will be stop iterating if the condition is met for the first time
			}
			else {
				System.out.println(arrIntegers2[i]+ " is not multiple of two");
			}
		}
		
		//ArrayList - It is a class, we can store any variables and need to mention the related data type. Since there is no predefined size, It can store any number of datas without mentioning the actual storage size.
		ArrayList<String> aryList = new ArrayList<String>();
		aryList.add("Java");
		aryList.add("Selenium");
		aryList.add("Eclipse");
		aryList.remove("Selenium");
		System.out.println(aryList.get(1));
		
		//For loop for Arraylist, for array list we use size() and for array we use length()
		for (int i = 0; i < aryList.size(); i++) 
		{
			System.out.println(aryList.get(i) + " Normal for loop");
		}
		
		//Enhanced for loop
		for (String aryListEnch : aryList)
		{
			System.out.println(aryListEnch + " Enhanced for loop");
		}
		
		//Checking the items in the arraylist
		System.out.println(aryList.contains("eclipse"));
		System.out.println(aryList.contains("Eclipse"));
		
		//Convert arrays to arraylist
		String[] words = {"Array", "Arraylist", "String", "Stringarray"};
		List<String> wordsArray = Arrays.asList(words);
		System.out.println(wordsArray.contains("Array"));
		
		//Strings - It is an object and it represents sequences of characters
		//In strings, if the data is already stored in one variable and if declared another variable with the same value, 
		//the java will point the value from the one which created earlier (Instead of creating one - Saving memory usage)
		//String Literal
		String s1 = "String1 is my sentence";
		String s2 = "String1 is my sentence"; //for s2, the value is pointed to the s1.
		
		//New memory allocator - Here a separate space is created for the variable with the same value
		String s3 = new String("String2 is my sentence");
		String s4 = new String("String2 is my sentence"); //For s4, a separate memory is created.
		
		//Split - whitespace
		String[] splittedString = s1.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		System.out.println(splittedString[3]);
		
		//Split - words
		String[] splittedString1 = s1.split("is");
		System.out.println(splittedString1[0]);
		System.out.println(splittedString1[1].trim()); //trim - Removes the whitespace in the starting sentence
		
		//Printing each letter
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}
		
		//For loop - Print it reverse order
		for (int i = s1.length()-1; i>=0; i--) 
		{
			System.out.println(s1.charAt(i));
		}
	
	//Methods is called from another class
	Methods callfrommethods = new Methods();
	callfrommethods.method1();
	

	}
	

}
