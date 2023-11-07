package collections_Arrays;

public class Student implements Comparable<Student> {
	String name;
	int age;
	int id;
	public Student( int id, String name, int age ) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
	@Override
	public String toString() {
		return "ID :"+ id +", name=" + name + ", age=" + age ;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	public int getid() {
		return id;
	}
	
	
}
