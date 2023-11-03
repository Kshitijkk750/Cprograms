package StringLabAssignment;

public class Assign4 {
	public static void main(String arg[]) {
		String s="Beautiful";
        
		char a[]=s.toCharArray();
		        System.out.print("Reverse order of : ");
		        System.out.println(s);
		        
		        for(int i=0;i<a.length;i++){
		            for(int j=i+1;j<a.length;j++){
		                
		                    char temp=a[i];
		                    a[i]=a[j];
		                    a[j]=temp;
		                   
		            }
		             System.out.print(a[i]+"");
		      }

		    }
		  
		
	}
