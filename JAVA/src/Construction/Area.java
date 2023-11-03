package Construction;
import java.util.Scanner;

	class Calc{
		int l,b;
		int area;
		public Calc(int a,int c) {
			  area= a*c;

//			System.out.println("Area of Rectangle is :" + area);
		}
		public Calc(int a) {
			
			 area= a*a;

//			System.out.println("Area of Square is :" + area);
		}
		
	}
public class Area {
	public static void main(String arg[]) {
		System.out.println("Enter the length and breadth :");
		Scanner sc= new Scanner(System.in);
		int l= sc.nextInt();
		int b= sc.nextInt();
		System.out.println("Enter the side of the Square :");
		int s= sc.nextInt();
		Calc c= new Calc(l,b);
		Calc c1= new Calc(s);
		System.out.println("Area of Rectangle is :" + c.area);
		System.out.println("Area of Square is :"+ c1.area);
	}

}
