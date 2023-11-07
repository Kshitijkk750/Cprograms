//package Has_A_Relation;
//class college{
//	private String name;
//	private Department depart[];
//	
//	public College(String name, Department[] depart) {
//		this.name = name;
//		this.depart = depart;
//	}
//	
//	void collegeDetails() {
//		System.out.println("College Details :");
//		System.out.println("Name :" + name);
//		for(Department d:depart)
//			System.out.println(d);
//	}
//	
//}
//class Department {
//	private String name;
//	private int capacity;
//	
//	public Department(String name, int capacity) {
//		this.name= name;
//		this.capacity= capacity;
//		
//	}
//	//override
//		public String toString() {
//			return "Department {" + "name" + name + ", capacity " + capacty + "}";
//			
//		}
//}
//
//public class aggregation {
//	public static void main(String arg[]) {
//		
//		Department dept[]= {new Department("IT",500), new Department("Mechanical",300), new Department( "Chemical", 200), new Department ("Civil",400)};
//		Department dept1[]= {new Department("IT",100), new Department("Civil",200),new Department("Mechanical",150),new Department("Electrical",200)};
//		college c= new college("YCCE",dept);
//		college c1= new college("Ramdeo Baba",dept);
//		c.collegeDetails();
//		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//		c1.collegeDetails();
//	}
//
//}
