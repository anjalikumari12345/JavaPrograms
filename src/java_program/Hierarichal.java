package java_program;
class A67
{
	int x,y,sum;
	public void see(){
	

	int sum=x+y;
	System.out.println(sum);
}}
class B67 extends A67{
	int a, b,sub;
public void see1()
{
	int sub= a-b;
	System.out.println(sub);
}}
public class Hierarichal {
	public static void main(String[] args) {
		
		B67 obj1= new B67();
		obj1.x=20;
		obj1.y=30;
		obj1.a=29;
		obj1.b=21;		
System.out.println(sum);
System.out.println(obj1.y);
System.out.println(obj1.b);
System.out.println(obj1.a);

	}
	
}
