package StringLabAssignment;

import java.util.Scanner;

public class Assign2 {
	Scanner sc= new Scanner(System.in);
	
		void Email() {
			String s;

		System.out.println("Enter the Email Address :\n");
		s=sc.next();
		int s2= s.indexOf('@');
		int s3= s.lastIndexOf(".com");
		boolean s4=s.contains(".com");
		
			
			if(s3>s2 & s4==true) {
				System.out.println("Email is Valid..");	
				
				}
			else {
				System.out.println("Email is not valid..");
			}
			
		
		}
		
		void PhoneNo() {
			String n;
			System.out.println("Enter the phone number :");
			n= sc.next();
			int m= n.length();
		char k[]= n.toCharArray();
		System.out.println(m + ",,"+k[0]);
			if(k[0]> '6') {
					if(m==10) {
				System.out.println(n +" is Valid number");
				}
					else {
						System.out.println(n +" is Invalid number...");
						
					}
			}
			else {
				System.out.println(n +" is Invalid number...");
			}
			
			
		}
			
	public static void main(String[] args) {
		Assign2 v= new Assign2();
		v.Email();
		v.PhoneNo();
 
		   
		}

	}


