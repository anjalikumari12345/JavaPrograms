package java_program;
class a2
{
	public void sq(int x)
	{
	System.out.println(x*x);	
	}
	public void sq(float x)
	{
		System.out.println(x*10+x);
	}
}
public class DataType {
	public static void main(String[] args) {
		a2 obj= new a2();
		obj.sq(5);
		obj.sq(8);
	}
	

}
