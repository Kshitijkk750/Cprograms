package recursion;

public class Demo1_Factorial {

	int n;
	int ans;
	
	 int fact(int n) {
		if(n==1) {
			return 1;
		}
		 return n*fact(n-1);
	}
	 	 
	 
	 
	 
	public static void main(String[] args) {
		Demo1_Factorial d= new Demo1_Factorial();
		
		System.out.println(d.fact(5));
	}

}
