package java_program;
abstract class A34
{
	int x,y;
	public void hello()
	{
		System.out.println("absact class");
	}
}
class B34 extends A34
{
	public void xyz1()
	{
		x=20;
	    y=30;
	    hello();
	    System.out.println(x +" "+y);
	}
}
public class Abstract {
	public static void main(String[] args) {
		
		B34 obj= new B34();
		obj.xyz1();
	}

}
