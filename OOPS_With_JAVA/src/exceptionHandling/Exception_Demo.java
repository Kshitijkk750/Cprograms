package exceptionHandling;

public class Exception_Demo {
	int a=10;
	int b=0;
	void show() {
		System.out.println("B");
		System.out.println("C");
		try {
		System.out.println(a/b);
		System.out.println("D");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		finally{
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A");
		Exception_Demo d= new Exception_Demo();
		d.show();
		System.out.println("E");
		
		
		// different class is calling in this class file...
		Test_Throws tt= new Test_Throws();
		tt.display();



	}

}
