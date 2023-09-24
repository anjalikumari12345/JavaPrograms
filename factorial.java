package MyWork;
import java.util.Scanner;
public class factorial {
	public static void main(String[] args) {
		System.out.println("enter factorial number");
		Scanner obj=new Scanner(System.in);
		int f=obj.nextInt();
		int i;int fact=1;
		System.out.println("factorial of number");
		for(i=1;i<=f;i++) 
		{
		fact=i*fact;
		
		}
		System.out.println(fact);
		
	}

}
