package Demo;

public class Patt {
	void triangle() {
		for(int i=0;i<5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
	public static void main(String arg[]) {
		Patt p= new Patt();
		p.triangle();
	}

}
