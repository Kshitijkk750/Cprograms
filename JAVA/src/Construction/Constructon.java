package Construction;
class Test {
	int a;
	public Test() {
		a=10;
	}
	public Test(int x) {
		a=x;
	}
}
public class Constructon {
	public static void main(String arg[]) {
		Test t= new Test();
		Test t1= new Test(500);
		System.out.println(t.a);
		System.out.println(t1.a);

	}
	}

