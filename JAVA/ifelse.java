import java.util.Scanner;

class Ifelse{

	int n,m;
	void input(){
	System.out.println("Enter the numbers :");
	Scanner sc= new Scanner(System.in);
	n= sc.nextInt();
	m= sc.nextInt();
	}
	void show(){
	if(n>m){
		System.out.println(n+"is greater than"+ m);
	}
	else if (n==m){
	System.out.println("Both numbers are equal");
	}
	else{
	System.out.println(m+"is greater than "+n);
	}
	}
	public static void main(String arg[]){
	Ifelse i=new Ifelse();
	i.input();
	i.show();
	
}

}
