package Demo;

import java.util.Scanner;

public class Patt2 {
	int n;

	void triangle() {
		System.out.println("Enter the number of rows :");
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=n-1;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		Patt2 p= new Patt2();
		p.triangle();
	}

}
