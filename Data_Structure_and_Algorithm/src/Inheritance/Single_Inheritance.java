package Inheritance;

class Base{
	int a=10;
	void show() {
		System.out.println(a);
	}
}
class Derived extends Base{
	int b=20;
	void display() {
		System.out.println(b);
	}
}
public class Single_Inheritance {
	public static void main(String arg[]) {
		
		Derived D=new Derived();
		D.show();

		D.display();
	}
}
