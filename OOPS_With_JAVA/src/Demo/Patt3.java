package Demo;

import java.util.Scanner;

public class Patt3 {
	Scanner sc= new Scanner(System.in);

	char c='A';
	int n;
	void alphabet() {
		System.out.println("Enter the number of rows :");
		n= sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print("*");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("");
			}
			System.out.println(" ");
		}
		}
	

	public static void main(String[] args) {
		Patt3 p= new Patt3();
		p.alphabet();
	}

}
