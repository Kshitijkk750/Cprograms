package lab5;
/*
2.Write a java class with a parameterized constructor that
takes two integers as arguments and initializes instances
variables with those values.
* */

import java.util.Scanner;
class Area{
	int a,b,area;
	int Area(int x, int y) {
		a=x;
		b=y;
		area=a*b;
		return area;
	}
}
public class Parameterized_constructor {
	public static void main(String arg[]) {
		int k,n;
		System.out.println("Enter the values :");
		Scanner sc=new Scanner(System.in);
		k=sc.nextInt();
		n=sc.nextInt();
		Area ar=new Area();
		int area_square = ar.Area(k,n);
		System.out.println("Area is :"+area_square);
	}
}
