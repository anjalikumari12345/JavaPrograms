package MyWork;

import java.util.Scanner;

public class AcendingArry {
	
		public static void main(String[] args) {
			int i;int j;int tem;
			int[]arr=new int[10];
			Scanner sc=new Scanner(System.in);
			System.out.println("enter size of arry");
			int size=sc.nextInt();
			System.out.println("enter the element of arry");
	for( i=0;i<size;i++) {
		arr[i]=sc.nextInt();
	}
	for(i=0;i<size;i++) {
		System.out.print(arr[i] + " ");
	}
	System.out.println();
	for( i=0;i<size;i++) {
	for(j=0;j<size;j++)	{
		if(arr[i]>arr[j]) {
			tem=arr[i];
			arr[i]=arr[j];
			arr[j]=tem;
		}
	}
	}
	System.out.println("assending order in aary" );
	for(i=0;i<size;i++) {
		System.out.println(arr[i]);
	}
	}

}
