package generic_topic;

public class Generic_method {
	//****Normal type of coding..

//public static void showdata(String arr[]) {
//		for(String s: arr) {
//			System.out.println(s);
//		}
//		}
//		
//		public static void showdata(Integer arr[]) {
//			for(Integer s: arr) {
//				System.out.println(s);
//			}
			// ****Using Generic Method*************************** 
		public static <E>void showdata(E arr[]) {
			for(E s:arr) {
				System.out.println(s);
			}
		}
		
	

	public static void main(String[] args) {
			String names[]= {"Ramesh","Suresh","Dinesh","Mahesh"};
			Integer ages[]= {23,24,25,26};
			showdata(names);
			showdata(ages);
			
	}

}
