package StringLabAssignment;

import java.util.Scanner;

public class Assign1 {
	String s1,s2;
		void Indexof() {
			s1="Kshitij";
			System.out.println("IndexOf method :-");
			System.out.println("Position : "+s1.indexOf("j"));
			System.out.println("Position of letter \nafter specific index :"+s1.indexOf("i", 4));

			System.out.println("***********************************");
			
		}
		void lastIndexof() {
			s1="Kanake is my last name.";
			System.out.println("lastIndexOf method :-");
			System.out.println("Position from last : "+s1.lastIndexOf("is"));
			System.out.println("***********************************");
			
		}
		void CharAT() {
			s1="Kshitij Kanake";
			System.out.println("CharAt Method :-");
			System.out.println("Character at potion :"+ s1.charAt(6));
			
		}
		void Split() {
			s1="Abhishek,Aishwarya,Aparna,Akshay,Anamika,Anand,Aniruddha";
			System.out.println("***********************************");
			System.out.println("Abhishek,Aishwarya,Aparna,Akshay,Anamika,Anand,Aniruddha");
			System.out.println("Split Method :-");
			String n[]= s1.split(",");
			for(String s3: n) {
				System.out.println(s3);
			}
			
			
		}
		void Contain() {
			s1="titar k do aage titar, \ntitar k do piche titar,\naage titar piche titar ,\nbolo kitne titar ?";
			System.out.println("***************************************");
			System.out.println("Contain Method :-");
			System.out.println("titar k do aage titar, \ntitar k do piche titar,\naage titar piche titar ,\nbolo kitne titar ?");
			System.out.println("\nvalue contains  titar:"+ s1.contains("titar"));
		}
		void IsEmpty() {
			s1=" ";
			System.out.println("***************************************");
			System.out.println("IsEmpty Method :-");
			System.out.println("Is String empty :" + s1.isEmpty());
		}
		void IsBlank() {
			s1=" ";
			System.out.println("***************************************");
			System.out.println("IsBlank Method :-");
			System.out.println("Is String blank :" + s1.isBlank());
			
		}
		void CompareTo() {
			s1="kshitij,devashish,pallavi,pranav,mahesh,sangharsh";
			String n[]= s1.split(",");
			System.out.println("Before Sorted order :");
			for(String s1 :n) {
				System.out.println(s1);
			}
			System.out.println("__________________________________________________");
			for(int i=0;i<n.length-1;i++)
			{
				for(int j=i;j<n.length;j++) {
					if(n[i].compareToIgnoreCase(n[j])>0) {
						String temp;
						temp=n[i];
						n[i] =n[j];
						n[j]= temp;
					}
				}
			}
			System.out.println("Sorted Order :");
			
			for(String s1: n) {
				System.out.println(s1);
			}
			System.out.println("****************************************************");
		}
	public static void main(String[] args) {
			Assign1 a= new Assign1();
//			a.Indexof();
//			a.CompareTo();
//			a.CharAT();
//			a.Split();
//			a.Contain();
//			a.IsEmpty();
//			a.IsBlank();
			System.out.println("Enter the method choice :-");
			System.out.println("1.Indexof.\n2.LastIndexof.\n3.CompareTo.\n4.CharAt.\n5.Split.\n6Contain.\n7.IsEmpty.\n8.IsBlank.");
			Scanner sc= new Scanner(System.in);
			int n= sc.nextInt();
			switch (n)
			{
			case 1:
			{
				a.Indexof();
				break ;
			}
			case 2:
			{
				a.lastIndexof();
				break ;
			}
			case 3:
			{
				a.CompareTo();
				break ;
			}
			case 4:
			{
				a.CharAT();
				break ;
			}
			case 5:
			{
				a.Split();
				break ;
			}
			case 6:
			{
				a.Contain();
				break ;
			}
			
			case 7:
			{
				a.IsEmpty();
				break ;
			}
			case 8:
			{
				a.IsBlank();
				break ;
			}
			default :{
				System.out.println("Enter the Valid Choice..");
			}
			}
			
	}

}
