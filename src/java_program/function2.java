package java_program;
import java.util.Scanner;
public class function2 {
public void area() {
	float pai=(float)3.14;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter r");
	int r = obj.nextInt();
	float area=pai*r*r;
System.out.println("area\n"+ area);
	
	
}
public static void main(String[] args) {
	function2 obj=new function2();
	obj.area();
}
}
