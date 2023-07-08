package coreJava;
public class operators {

	public static void main(String[]args)
	{
		int x=5;
		int y=7;
		System.out.println("X is:" +x);
		System.out.println("Y is:" +y);
		
		byte b=10;
		System.out.println("B is:" +b);
		
		byte b2=(byte)129;
		System.out.println("B is:" + b2);
		
		float f = (float)5.5;	//By default considers decimal to double
		float f2 =5.5f;
		
		double d=10.5;
		
		char ch = 'a';
		System.out.println(ch);
		
		//Task -1:Different ways to convert character to int 
		
		int z=x+y;
		//+ -> operator
		//x,y ->operands
		
		//Increment &Decrement Operator
		
		int m =5;
		int n=m++;
		System.out.println("M is: "+m+",N is: "+n);
		
		
		int p=5;
		int q=++p;
		System.out.println("P is: "+p+",Q is: "+q);
		
	}

}
