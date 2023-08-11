package java_program;
class A45
{
	int y;
	static int x;
	

public void tea() {
	y=20;
	System.out.println(y);
}
}
public class Static {
	public static void main(String[] args) {
		A45 obj= new A45();
		A45 obj2 = new A45();
		obj. y=20;
		obj. x=30;
		System.out.println(obj.y);
		System.out.println(obj.x);
		obj2.x= 500;
		obj2.y=600;
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj2.x);
		System.out.println(obj2.y);
		
		
	}

}
