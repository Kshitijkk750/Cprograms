package cdac_Assignment_Management;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

class Student{
	String name;
	int prnNo;
	
	Scanner sc= new Scanner(System.in);
	
	void getname(String name) {
		//System.out.println("Student name :\n");
		name= sc.next();		
	}
	
	void getprn(int prnNo) {
		prnNo= sc.nextInt();

	}
	
	
		
	

}

class Trainer{
	Scanner sc= new Scanner(System.in);
	String Tname;
	void get(String Tname) {
		Tname= sc.next();
	}
	
	

	
	
	
}

class Assignment{
	Student student= new Student();
	Trainer trainer= new Trainer();
		//LocalDate d= new LocalDate(yyyy-MM-dd);
	
}

public class Assignment_Manager {
	String title;
	Date date;
	String Description;
	String Student;
	
	Assignment Assign= new Assignment();
	
	Scanner sc= new Scanner(System.in);
	
	Date d= new Date();
	SimpleDateFormat sdf= new SimpleDateFormat("yyyy-mm-dd");

	String createAssignment(String title, Date d,String Description, String Student) {
		
		System.out.println("Enter the Title of Assignment :");
		title= sc.next();
		
		System.out.println("Date is :\n "+ d);
		
		System.out.println("Enter the Description :");
		Description= sc.next();
		
		System.out.println("Enter Assignee :");
		
		Assign.student.getname(Student);
		return "Title : "+title +"\n Date :"+d+"\nDescription :"+ Description +"Assignee :"+ Student+"\n";
		
		
	}
	
	void addAssignment() {
		
		
		try{
			 Path path=Paths.get("/home/dell/cdac/Diwali_Test/src/cdac_Assignment_Management");

			 String content=createAssignment(title, d, Description, Student);
			 				Files.write(path,content.getBytes(),StandardOpenOption.APPEND);
			 				//System.out.println("Completed");
		}
					catch(Exception e){
						System.out.println(e.getMessage());
			}
		
	}
	
	void showAssignment() {
		
		
	}
	
	void saveAssignment() {
		
	}
	
	void loadAssignment() {
		
	}
	
	void checkAssignment() {
		
	}
	
	public static void main(String[] args) {

		Assignment_Manager am= new Assignment_Manager();
		int n;
		String title =am.title,Student=am.Student,Description=am.Description;
		Date d= new Date();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the choice :");
		System.out.println("1. Create Assignment. \n2. Add Assignment. \n"
				+ "3. Show Assignment.\n4. Save Assignment.\n5. Load Asignment.\n6. Check Assignment.");
		 n= sc.nextInt();
		switch (n) {
		case 1: {
			am.createAssignment(title, d, Description, Student);
			break;
			
		}
		case 2 :{
			am.addAssignment();
			break;
		}
		case 3:{
			am.showAssignment();
			break;
		}
		case 4: {
			am.saveAssignment();
			break;
		}
		case 5 :{
			am.loadAssignment();
			break ;
		}
		case 6 :{
			am.checkAssignment();
			break;
		}
		default :{
			System.out.println("Invalid choice...");
		}
		}
	}

}
