package exceptionHandling;

import java.util.Scanner;

public class Voter {
	Scanner sc= new Scanner(System.in);
	int age;
		void get() {
			System.out.println("Enter the age :");
			age= sc.nextInt();
			
			if(age>18) {
				System.out.println("Congrats, you are eligible for voting...");
				
			}
			else {
				try {
					throw new InvalidEntryException("Abhi tum chote ho bhai....");
				}
				
				catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
}
	