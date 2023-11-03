package linearSearch;

public class LinearSearchAlgo {

	public int linearSearch(int arr[],int size, int key) {
		int i;
		for(i=0;i<size;i++) {
			if(arr[i]==key) {
				return 1;
			}
		}
		return i;
		}
	public static void main(String[] args) {
		int page_number[]= {86,91,34,50,0};
		
		int key=50;
		LinearSearchAlgo obj= new LinearSearchAlgo();
		if(obj.linearSearch(page_number,page_number.length, key)==1) {
			System.out.println("search found");
			
		}
		else {
			System.out.println("Search Not found..");
			
		}
		
		
	}

}
