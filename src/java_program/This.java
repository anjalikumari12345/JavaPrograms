package java_program;
class A124
{
	int x,y;
A124(int x,int y){
	this.x=x;
	this.y=y;
}

public void sum(int x,int y) {
	x=10;
	System.out.println(x);
	this.x=20;
	System.out.println(this.x);
}}
public class This {
	public static void main(String[] args) {
		A124 obj=new A124(2,5);
		obj.sum(5,8);
		
	}

}
