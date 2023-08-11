package java_program;
import java.util.Scanner;
public class testing {
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter true or false");
		boolean userinput;
		String scanner = input.next ();
		if(input.equalsIgnoreCase("true")) {
			userintput = true;
			System.out.println("1");
		}
		else if(input.equalsIgnoreCase("false")) {
			userinput= false;
		
		
			System.out.println("0");
		}
		else
		{
			System.out.println("invalid");
		}
	scanner.close();
		
	}
	
}
