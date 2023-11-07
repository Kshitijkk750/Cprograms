package generic_class;

class Container<T>{   // using <> we can create generic class 
	T contain;        // we can use any name or alphabet in <>.
	public Container(T contain) {
		this.contain=contain;
	
	}
	
	public T getContain() {
		return contain;
	}
	public void show() {
		System.out.println(contain.getClass().getName());
	}
}

public class Generic_Class {

	public static void main(String[] args) {
			Container<String> c= new Container<>("Cdac");
			String s=c.getContain();
			System.out.println(s);
			c.show();
	}

}
