package MyWork;
import java.util.Scanner;
public class Array1 {
	public static void main(String[] args) {
		int[]arr=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of arry");
		int size=sc.nextInt();
		System.out.println("enter the element of arry");
for(int i=0;i<size;i++) {
	arr[i]=sc.nextInt();
}
for(int i=0;i<size;i++) {
	System.out.print(arr[i] + " ");
}
	}
	
}
