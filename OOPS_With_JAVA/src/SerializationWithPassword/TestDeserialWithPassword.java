package SerializationWithPassword;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestDeserialWithPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try(FileInputStream fin=new FileInputStream("Stud.ser");
					ObjectInputStream ois = new ObjectInputStream(fin)){
				Student ss= (Student)ois.readObject();
				System.out.println("Name :" +ss.name);
				System.out.println("Age :"+ ss.age);
				System.out.println("Password :" +ss.password);
				}
			catch(Exception e) {
				e.getMessage();
			}
	}

}


