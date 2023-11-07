package Has_A_Relation;
class Person{
	private String name;
	private Address address;
	
	public Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	
	void PersonDetails() {
		System.out.println("Person name :" + name);
		System.out.println("Person Address : "+address);
	}
}
class Address{
	
	private int houseNo;
	private String landmark;
	private String city;
	private String state;
	private String pincode;
	
	public Address(int houseNo, String landmark, String city,String state, String pincode) {
		
		this.houseNo = houseNo;
		this.landmark= landmark;
		this.state= state;
		this.city= city;
		this.pincode= pincode;
	}
	//Override
	
	public String toString() {
		return "Address("+"houseNo"+ houseNo + ",landmark" + landmark + ",city "+ city + ", state="+ state + ", pincode " + pincode + ")";
	}
}

public class Association {
		public static void main(String arg[]) {
			Address ad= new Address(101,"High Tech City","Nagpur","Marashtra","440010");
			Address ad1= new Address(102,"Low-Tech City","Yavatmal","Goa","423423");
			Person p= new Person("Kshitij",ad1);
			p.PersonDetails();
		}
}
