package java_program;
class a1
{
	int x,y,z;
	a1()
	{
		x=10;
		y=20;
		z=30;
	}
	a1(int a,int b)
	{
		x=a;
		y=b;
	}
	a1(int a,int b,int c)
	{
		x=a;
		y=b;
		z=c;
	}
	
	}


public class perameterConstruction {
	public static void main(String[] args) {
		a1 obj=new a1(5,6);
		a1 obj1=new a1();
		a1 obj2= new a1(5,6,7);
		System.out.println(obj.x);
	}

}
