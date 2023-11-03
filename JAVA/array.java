import java.util.Scanner;
class Array{

	int arr[][]=new int[3][];
	 
	
	void takeinput(){
	 arr[0]=new int[5];
	  arr[1]=new int[2];
	 arr[2]=new int[4];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enetr 11 numbers :"+(arr[0].length + arr[1].length + arr[2].length));
	for(int i=0;i<arr.length;i++){
	for(int j=0;j<arr[i].length;j++){
	 arr[i][j]=sc.nextInt();
	}
	}
	}
	void showoutput(){
		System.out.println("\n\n Output Array is :\n");
		for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[i].length;j++){
			System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
		}
	}
	public static void main(String arg[]){
		Array a=new Array();
		a.takeinput();
		a.showoutput();
}
}

