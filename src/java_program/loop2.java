package java_program;
import java .util.Scanner;
public class loop2 {
	public static void main (String[]arg) {
		int n;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter no.");
		n=obj.nextInt();
		int temp=n;
		int res=0;
		while(n!=0) {
			int r= n%10;
			res=res*10+r;
			n=n/10;
		}
		if(res==temp)
		{
			System.out.println("pable");
		}
		else
		{
			System.out.println("not pable");
		}
	}

}
