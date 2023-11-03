package generic_topic;

import java.util.List;

public class Generic_list {
		//Upper bound
//	public static <E>void showdata(List<? extends Number> lst ) {
//		for(Number s:lst) {
//			System.out.println(s);
//		}
//	}
		//Lower bound...it will allow all the parent class which is extends by the Integer.
	public static <E>void showdata(List<? super Integer> lst ) {
		for(Object s:lst) {
			System.out.println(s);
		}
	}
	


public static void main(String[] args) {
//		String names[]= {"Ramesh","Suresh","Dinesh","Mahesh"};
//		Integer ages[]= {23,24,25,26};
//		showdata(names);
//		showdata(ages);
	
	List lst1= List.of("Ramesh","Suresh","Dinesh","Mahesh");
	List lst2= List.of(23,24,25,26);
	List lst3= List.of(23.44,43.45,54.67,222.4);
	
	//showdata(lst1);
	showdata(lst2);
	showdata(lst3);
		
}

}
