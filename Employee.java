package MyWork;
import java.util.Scanner;
 class  SalesEmployee{
	 
	 public void calcsalary(int  HRA,int  DA,int baseSalary,int variablePay) {
			System.out.println("Salary of employee:"+"  "+(baseSalary + HRA + DA+variablePay));	
			}
			 
 }

class Employee extends SalesEmployee{
	public static void main(String[] args) {
		  int HRA ;
		int  DA;
		int BaseSalary;
		int variablePay;
		Scanner s=new Scanner(System.in);
		System.out.println("enter HRA of employee");
		 HRA =s.nextInt();
		 System.out.println("enter DA of employee");
		 DA =s.nextInt();
		 System.out.println("enter BaseSalary of employee");
		 BaseSalary  =s.nextInt();
		 System.out.println("enter  variablePay of employee");
		 variablePay  =s.nextInt();
		 
		 Employee x=new Employee();
			x.calcsalary(HRA, DA,BaseSalary,variablePay);
			
	}
	
	
}