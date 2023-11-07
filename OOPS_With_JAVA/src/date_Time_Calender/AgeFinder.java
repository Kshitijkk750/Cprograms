package date_Time_Calender;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Enter your date of birth. \nfromat (date/month/year):");
			Scanner sc= new Scanner(System.in);
			// for example 27/05/2000
			String dob= sc.next();
			String arr[]= dob.split("/");
			// to split the date month year
//			for(String s:arr) {
//				System.out.println(s);
//			}
			int d= Integer.parseInt(arr[0]);
			int m= Integer.parseInt(arr[1]);
			int y= Integer.parseInt(arr[2]);
			
			 LocalDate birthDate=LocalDate.of(y, m, d);
			LocalDate today= LocalDate.now();
			Period p = Period.between(birthDate, today);
			System.out.println("You are " + p.getYears()+ "years," +  p.getMonths()+"months" + "and" + p.getDays()+"days");
	}

}
