package java_program;
class a4
{
	int x,y;
	a4() 
	{ 
	System.out.println("defatl class");	
	}
	a4(int a,int b)
	{
		System.out.println("parameter");
		x=a;
		y=b;
	}
}
 class b4 extends a4{
	 int x1,y1;
	 b4(){
		 System.out.println("default");
	 }
	 b4(int a1,int b2)
	 {super(5,6);
		 x1=a1;
		 y1=b2;
		 System.out.println("parameter");
		 
	 }
 }
 

public class inheritance {
	public static void main(String[] args) {
		
	
b4 obj= new b4();
b4 obj1= new b4 (4,7);
}}
