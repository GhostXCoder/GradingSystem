package Studentgradingsystem;

import java.util.Scanner;
public class StudentGradingSystem {
	
	public static void main(String[] args) {
		Scanner Mynew = new Scanner (System.in);
		Scanner Mynewmat = new Scanner (System.in);
		char Grade;
		
		System.out.println("This is a program to compute and grade students Exam\n");
		for(int i=0; i<=3; i++)
		{
			//Student matric number 
			System.out.println("Enter Student Matric Number");
			String MatricNo = Mynewmat.nextLine();
			//Student test score 1
			System.out.println("Enter Student test score 1");
			int Test1 = Mynew.nextInt();
			//Student test score 2
			System.out.println("Enter Student test score 2");
			int Test2 = Mynew.nextInt();
			//Student exam score
			System.out.println("Enter Student exam score");
			int exam =Mynew.nextInt();
			int Total=Test1+Test2+Exam;
			if(Total>=70)Grade='A';
			else if ((Total<70))  ((Total>=60)) Grade= 'B';
			else if ((Total<60))  ((Total>=50)) Grade= 'C';
			else if ((Total<50))  ((Total>=45)) Grade= 'D';
			else if ((Total<45))  ((Total>=40)) Grade= 'E';
			else Grade='F';
			System.out.println("Matric No:" + MatricNo + "Total Score:" + Total + "Grade:" + Grade);
				
			
		}
	}

	
	
}
