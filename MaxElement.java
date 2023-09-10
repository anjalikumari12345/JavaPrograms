package MyWork;
import java. util. Scanner;
public class MaxElement {
public static void main(String[] args) {
	int max;int min;int i;;
	int[]arry=new int[6];
	Scanner sc= new Scanner(System.in);
	System.out.println("enter arry element");
	for( i=0;i<6;i++) {
		arry[i]=sc.nextInt();
	}
	System.out.println("arry is ");
	for( i=0;i<6;i++) {
		System.out.print(arry[i] + " ");
	}
	System.out.println();
	max=arry[0];
	min=arry[0];
	for(i=0;i<6;i++) {
		if(arry[i]>max) {
			max=arry[i];
		}
		if(arry[i]<min) {
			min=arry[i];
		}
	}
	System.out.println("max no.is"+" "+max);
	System.out.println("min no.is"+" "+min);
	
}
}
