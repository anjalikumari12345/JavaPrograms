package MyWork;
import java.util.Scanner;

 class Student123{
		
		String name;
		String program;
		int noOfCridit;
		int GPS;
		
		Scanner b= new Scanner(System.in);
		public void scaninfo() {
		System.out.println("enter the name of Student");
		 name= b.nextLine();
		System.out.println("enter the program of Student");
		 program= b.nextLine();
		
		System.out.println("enter the no.of Cridit  of Student");
		noOfCridit=b.nextInt();
		}
void creditcalc()
{		
		if(noOfCridit ==2 ||  noOfCridit==3 || noOfCridit==4) {
			
		//	System.out.println("valid no.of Cridit  of Student" );
		}
		else {
			System.out.println("invalid  no.of Cridit  of Student ");
		}

		System.out.println("enter GPS of the Student");
		GPS=b.nextInt();
		
		if(GPS ==2 ||  GPS==3 || GPS==4 ||GPS==5) {
			
		//System.out.println(" valid GPS of student");
			
		}
		else {
			System.out.println("invalid  GPS  of Student ");
		}
		System.out.println("enter Practical Grade Score of Student ");
		int PracticalGradeScore = b.nextInt();
		if(PracticalGradeScore ==2 ||  PracticalGradeScore==3 || PracticalGradeScore==4 ||PracticalGradeScore==5) {
			
			//System.out.println(" valid GPS of student");
				
			}
			else {
				System.out.println("invalid   Practical Grade Score of Student ");
			}
}
	}

class	PartTimeStudent extends Student123{
  
	  int PracticalGradeScore;
	   void fun() {
		   scaninfo();
		   creditcalc();
		int CGPAforPartTimeStudent  = noOfCridit * GPS + PracticalGradeScore;
         System.out.println(CGPAforPartTimeStudent);
	  
		}
	}
  class  FullTimeStudent extends Student123{
	  void fun1() {
		  scaninfo();
		  creditcalc();
		  
	int	  CGPAforFullTimeStudent  = noOfCridit * GPS;
	System.out.println("CGPA for FullTimeStudent"+CGPAforFullTimeStudent);
	  }
  }

 public class Student156{
	public static void main(String[] args) {
		 FullTimeStudent s=new  FullTimeStudent();
		 PartTimeStudent p= new PartTimeStudent();
		 
		s.fun1();
		
		
	}
}

