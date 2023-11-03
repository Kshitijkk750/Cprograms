package Method_Overloading;
 import java.util.Scanner;
public class Routefinder {
		void route(String dest)
		{
			System.out.println(" Moving to "+dest);
		}
		void route(String src,String dest) {
			System.out.println("Moving from"+src+" to" + dest);
		}
		void route(String src,String via,String dest) {
			System.out.println("Moving from " + src+ " to " + dest+" via "+ via);
		}
	public static void main(String arg[]) {
		Routefinder rf= new Routefinder();
		System.out.println("Please enter :");
		System.out.println("1. For Destination only.");
		System.out.println("2. For Source and destination.");
		System.out.println("3. For source, via and destination.");
		Scanner sc= new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		int choice =sc1.nextInt();
		switch (choice){
			case 1:
			{
				System.out.println("Enter the destination :");
				String d= sc.nextLine();
				rf.route(d);
				break;
				}
			case 2:
			{
				System.out.println("Enter the Source and Destination:");
				String s= sc.nextLine();
				String d= sc.nextLine();
				rf.route(s, d);
				break;
			}
			case 3:
			{
				System.out.println("Enter the Source, via and destination:");
				String s=sc.nextLine();
				String v=sc.nextLine();
				String d=sc.nextLine();
				rf.route(s, v, d);
				break;
			}
			default :{
				System.out.println("ENter valid choice..");
			}
		}
		
	}
}
