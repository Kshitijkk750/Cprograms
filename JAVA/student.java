/* 
Q1. WAP in Java to A student appear in examination of five papers each
paper contains 50 marks calculate total and percentage of student and
display the grades according to the following condition.
 */

import java.util.Scanner;
class Student{
	int m1,m2,m3,m4,m5;
	float total;
	Scanner sc=new Scanner(System.in);
	void input(){
		System.out.println("Enter the marks of 5 subjects :");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		m4=sc.nextInt();
		m5=sc.nextInt();
		
		
	}
	void calc(){
		float percent;
		total=m1+m2+m3+m4+m5;
		System.out.println("Total marks is :"+total);
		percent=total/250*100;
		System.out.println("Percentage is :"+percent);
		
		if(percent>=90){
		System.out.println("Grade is A+");
	}
	 else if(percent>=80){
		System.out.println("Grade is A");
	}
	 else if(percent>=70){
		System.out.println("Grade is B+");
	}
	 else if(percent>=60){
		System.out.println("Grade is B");
	}
	 else if(percent>=50){
		System.out.println("Grade is C");
	}
	else{
		System.out.println("Student is Fail..");
	}
		
	}
	
	public static void main(String arg[]){
	Student s=new Student();
	s.input();
	s.calc();
	
	}
}
