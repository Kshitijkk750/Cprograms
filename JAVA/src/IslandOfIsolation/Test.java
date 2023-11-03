package IslandOfIsolation;
	
public class Test {
	Test i;
	protected void finalize () {
		System.out.println("Object is destroyed");
	}
	public static void main(String arh[]) {
		Test t1=new Test();
		Test t2=new Test();
		
		t1.i=t2;
		t2.i=t1;
		
		t1= null;
		
		System.gc();
	}
}
