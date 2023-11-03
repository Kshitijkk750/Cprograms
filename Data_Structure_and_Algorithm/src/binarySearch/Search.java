package binarySearch;

public class Search {

		int binarySearch(int arr[],int start, int end, int key) {
			int mid;
			while(start<=end) {
				mid=(start+end)/2;
				
				if(arr[mid]==key) {
					return 1;
				}
				else if(key>arr.length) {
					return 0;
				}
				else if(arr[mid]<key) {
					start= mid+1;
				}
				
				else {
					end=mid-1;
				}
			}
			
			
			return 0;
		}
	public static void main(String[] args) {
		Search s= new Search();
		int arr[]= {10,20,30,40};
		int start=0;
		int end= arr.length;
		int key=50;
		
		if(s.binarySearch(arr, start, end, key)==1) {
			System.out.println("Search found..");
		}
		else {
			System.out.println("Search not found...");
		}
		
	}

}
