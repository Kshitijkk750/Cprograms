package lab5;
/*
 1.Write a program in java which shows no argument
constructor 
 
 **/

import java.util.Scanner;
class Test{
	int l,b,perimeter;
	
	void Test() {
		System.out.println("Enter the length and breadth :");
		Scanner sc= new Scanner(System.in);
		l=sc.nextInt();
		b=sc.nextInt();
		perimeter=2*(l+b);
		System.out.println("Perimeter :"+perimeter);
	}
}
public class No_argument {
	public static void main(String arg[]) {
		Test t =new Test();
		t.Test();
	}
}
