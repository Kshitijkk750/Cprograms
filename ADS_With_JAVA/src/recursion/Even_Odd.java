package recursion;

public class Even_Odd {
	
	static int i=1;
	static void even(int n) {
		if(n>10)
			return ;
		System.out.println("Even :" +n);
		odd(++n);
	}
	static void odd(int n) {
		if(n>10) {
			return;
		}
		System.out.println("Odd :" +n);
		even(++n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//even(i);
		odd(i);
	}

}
