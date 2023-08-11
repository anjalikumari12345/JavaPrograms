package java_program;
class a3
{
	public void sum(int x,int y)
	{
		System.out.println(x+y);
	}
	public void sum(int x,int y,int z) {
		System.out.println(x+y+z);
		
	}
	public void sum(int x)
	{
		System.out.println(x+x);
	}
}

public class MoreFunction {
	public static void main(String[] args) {
		a3 obj= new a3();
		obj.sum(5);
		obj.sum(5,7); 
	}

}
