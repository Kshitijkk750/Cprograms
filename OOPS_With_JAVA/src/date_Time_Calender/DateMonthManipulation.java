package date_Time_Calender;

import java.time.LocalDate;

public class DateMonthManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today= LocalDate.now();
		System.out.println("**************************************\nfinding past date week year from today ");
		
		System.out.println(today.minusDays(120));
		System.out.println(today.minusMonths(4));
		System.out.println(today.minusYears(2));
		System.out.println(today.minusWeeks(4));
		
		System.out.println("**************************************\nfinding future date week year from today ");

		System.out.println(today.plusDays(30));
		System.out.println(today.plusMonths(2));
		System.out.println(today.plusYears(1));
		System.out.println(today.plusWeeks(4));

	}

}
