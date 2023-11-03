package reflectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	private void show() {
		System.out.println("HELLO " +name +", your age is :" +age);
	}
}

public class TestReflectionAPI {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		// Creating class  reference	
		Class personCls=Person.class;
		Constructor cons= personCls.getDeclaredConstructor(String.class, int.class);
		Object object= cons.newInstance("Ramesh", 24);
		
		Field fname= personCls.getDeclaredField("name");
		
		fname.setAccessible(true); // changing the value of name field
		fname.set(object, "Suresh");
		
		Method m= personCls.getDeclaredMethod("show");
		
		m.setAccessible(true);// accessing private method..
		
		m.invoke(object);
		
		String s=(String) fname.get(object);
		System.out.println(s);
		
		Field fage=personCls.getDeclaredField("age");
		fage.setAccessible(true);  // to access the age field.

		int ag= fage.getInt(object);
		
		System.out.println(ag);
		
		
	}

}
