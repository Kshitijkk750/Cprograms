package object_Methods;

class Student{
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name =name;
		this.age = age;
	}

}

public class String_Equals_Hashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student s1= new Student("Kshitij", 28);
			System.out.println(s1.hashCode());
			System.out.println(s1.toString());
			System.out.println(s1.equals(s1));
	}

}
