package SerializationWithPassword;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Student implements Serializable{
	 String name;
	 int age;
	transient String password;
	
	public Student(String name, int age, String password) {
		this.name =name ;
		this.age = age;
		this.password= password;
	}
}

public class TestSerialWithPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try(FileOutputStream fout= new FileOutputStream("Stud.ser");
					ObjectOutputStream oos= new ObjectOutputStream(fout))
			{
				Student s = new Student("Kshitij",28,"kshitij11");
				oos.writeObject(s);
				System.out.println("Object Serialize successfully..");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
	}

}



