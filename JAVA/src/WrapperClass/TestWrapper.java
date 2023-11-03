package WrapperClass;

public class TestWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
//		Integer i=new Integer(x);//Boxing
//		
//		int a=i.intValue();     // UnBoxing..
		
		Integer i=x;     //AutoBoxing..
		
		int a=i;          // AutoUnBoxing..
		
		System.out.println("Premitive x = "+ a);
		System.out.println("\nReference/Objective x ="+i);
		
		
	}

}
