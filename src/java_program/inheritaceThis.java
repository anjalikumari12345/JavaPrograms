package java_program;
class a12
{
	public void hello() {
		System.out.println("this is a class function");
	}
}
class b12 extends a12
{
	public void hello() {
		System.out.println( "this is b class function");
	}
	public void xyz() {
		hello();
		super.hello();
	}
}
public class inheritaceThis { 
	public static void main(String[] args) {
		b12 obj=new b12();
		obj.xyz();
		
	}

}
