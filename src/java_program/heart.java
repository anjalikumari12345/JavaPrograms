package java_program;
import java.util.Scanner;
public class heart {
	public static void main(String[] args) {
	Scanner obj= new Scanner(System.in)	;
	System.out.println("write heart");
	String userInput= obj.next();
	String output= userInput.replaceAll("heart","*");
System.out.println(output);
	
	

}
}
