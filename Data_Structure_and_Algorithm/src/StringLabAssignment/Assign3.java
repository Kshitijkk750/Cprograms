package StringLabAssignment;

public class Assign3 {

	public static void main(String arg[]) {
		String s="Beatiful";
		String s1="Careful";

		char a[]=s.toCharArray();
		char b[]=s1.toCharArray();

		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j]){
					System.out.print(a[i]+",");
				}
			}
		}
	}
}

