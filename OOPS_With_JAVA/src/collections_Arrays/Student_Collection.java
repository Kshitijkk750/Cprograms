package collections_Arrays;


import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Student_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Student> v=new Vector<>();
		
		Student s1= new Student(104,"Ramesh",23);
		Student s2 = new Student(102,"Bhavesh",22);
		Student s3 = new Student(101,"Kshitij",28);
		Student s4= new Student(106,"Devashish", 23);
		
		v.add(s1);
		v.add(s2);
		v.add(s3);
		v.add(s4);
		//System.out.println(v.get(2).name);
//		Iterator<Student> it= v.iterator();
//		while(it.hasNext()) {
//			Student s=it.next();
//			System.out.println("Name :" + s.getName() + "  Age :" + s.getAge());
//		}
		// Natural Sorting usint Comparable method..
		
		Collections.sort(v);
		System.out.println("Natural Sorting using Comparable..\n");
		for (Student s : v) {
			System.out.println("ID :"+s.getid()+"  Name :" + s.getName() + "  Age :" + s.getAge());
			}
		System.out.println("************************************");

		// Sorting by Student Name ...
		System.out.println("Sorting by Name using Comparator..\n");
		StudentSortingByName ssn= new StudentSortingByName();
		Collections.sort(v, ssn);
		for (Student s : v) {
			System.out.println("ID :"+s.getid()+"  Name :" + s.getName() + "  Age :" + s.getAge());	
			}
	
		System.out.println("************************************");
		//Sorting by Student Age....
		System.out.println("Sorting by Age using Comparator..\n");

		StudentSortingByAge ssa= new StudentSortingByAge();
		Collections.sort(v,ssa);
		for (Student s : v) {
			System.out.println("ID :"+s.getid()+"  Name :" + s.getName() + "  Age :" + s.getAge());
			}
	}
	
	
}


