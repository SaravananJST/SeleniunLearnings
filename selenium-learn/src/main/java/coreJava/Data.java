package coreJava;

public class Data extends Data2{

	int a;
	
	public Data(int a) {
		//super(a); //super constructor, 
		this.a=a;
	}

	public int increment()
	{
	a = a+1;
	return a;	
	}
}
