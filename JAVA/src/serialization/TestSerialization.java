package serialization;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Student implements Serializable{
	 String name;
	 int age;
	
	public Student(String name, int age) {
		this.name =name ;
		this.age = age;
	}
}

public class TestSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try(FileOutputStream fout= new FileOutputStream("Stud.ser");
					ObjectOutputStream oos= new ObjectOutputStream(fout))
			{
				Student s = new Student("Kshitij",28);
				oos.writeObject(s);
				System.out.println("Object Serialize successfully..");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
	}

}
