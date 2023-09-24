package MyWork;
import java.util.Scanner;
public class Rectangle {
	public int area(int l,int b) {
	int are=l*b;
	return are;
	
	}
	public static void main(String[] args) {
	Scanner j=new Scanner(System.in);
	System.out.println("enter the value of l and b");
	int b=j.nextInt();
	int l=j.nextInt();
		Rectangle a=new Rectangle();
			System.out.println("area of rectengle"+" "+a.area(l, b));
	}

}
