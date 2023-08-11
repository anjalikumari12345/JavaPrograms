package java_program;
class q1
{
	q1()
	{
		System.out.println("a is constructor");
	}
}
class q2 extends q1
{
	q2(){
		System.out.println("asd");
	}
}
public class constutorUse {
	public static void main(String[] args) {
		q2 obj= new q2();
		
	}

}
