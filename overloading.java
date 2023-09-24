package MyWork;

import java.util.Scanner;

public class overloading {
	public void greater(int a,int b) {
		if(a>b) {
			System.out.println(a +" "+"is gretest");
		}
		else {
			System.out.println(b+" "+" is gretest");
		}
	}
public void greater(double a,double b) {
	if(a>b) {
		System.out.println(a+" " +"is gretest");
	}
	else {
		System.out.println(b+" "+ "is gretest");
	}
	
}
public static void main(String[] args) {
	overloading obj=new overloading();
	Scanner f=new Scanner(System.in);
	System.out.println("enter 1 for integer and 2 for double");
	
	int x=f.nextInt();
	int y,z;
	double y1,z1;
	if(x==1)
	{
		System.out.println("enter two intiger no.");
	y=f.nextInt();
	z=f.nextInt();
	obj.greater(y, z);
	}
	else
	{
		System.out.println("enter two double no.");
		y1=f.nextDouble() ;
		z1=f.nextDouble() ;
		obj.greater(y1, z1);
	}
}
}
