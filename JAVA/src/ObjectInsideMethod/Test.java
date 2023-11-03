package ObjectInsideMethod;

import java.util.Scanner;

public class Test {
	String objname;
	private static void display() {
		Test t2 = new Test("t2");
	}
	
	public Test (String objname) {
		this.objname = objname;
	}
	static void show()
{
		Test t1 = new Test( "t1");
	
		display();
}
	@Override
	protected void finalize() {
		
		System.out.println(this.objname + " is free form memory");
		
		
	}
	public static void main(String []aerg) {
		show();
		System.gc();
		Runtime.getRuntime().gc();
		}
}
