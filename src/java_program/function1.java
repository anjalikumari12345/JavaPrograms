package java_program;

public class function1 {
	public int cube(int a)
	{
		int x = a*a*a;
		System.out.println("enter a number \n" + x);
		return x;
	}

public static void main(String[] args) {
	function1 obj= new function1();
	int x=obj.cube(2);
}
}
