/*
Q2. WAP in Java to check whether a number is divisible according to
the following conditions.
*/

import java.util.Scanner;

class Div{
	int n;
	Scanner sc= new Scanner(System.in);
	void input(){
		System.out.println("Enter the number :");
		n= sc.nextInt();
	}
	void out(){
	if(n%8==0 && n%5==0){
		System.out.println("Number is divisible by 8 and 5.");
	}
	else if(n%8==0){
		System.out.println("Number is divisible by 8.");
	}
	else if(n%5==0){
		System.out.println("Number is divisible by 5.");
	}
	else {
		System.out.println("Number is divisible neither by 8 nor by 5.");
	}
	}
	
	public static void main(String arg[]){
	
	Div d= new Div();
	d.input();
	d.out();
	}
}
