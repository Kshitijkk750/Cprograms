package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestDeserialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try(FileInputStream fin=new FileInputStream("Stud.ser");
					ObjectInputStream ois = new ObjectInputStream(fin)){
				Student ss= (Student)ois.readObject();
				System.out.println("Name :" +ss.name);
				System.out.println("Age :"+ ss.age);
				}
			catch(Exception e) {
				e.getMessage();
			}
	}

}
