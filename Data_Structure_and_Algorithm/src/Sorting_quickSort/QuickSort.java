package Sorting_quickSort;

public class QuickSort {

	int Pindex;
	
	void swap(int arr[],int i, int j) {
		
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	int partition(int arr[], int start, int end) {
		Pindex= start;
		
		int pivot=arr[end];
		for(int i=start;i<=end;i++) {
			if(arr[i]<pivot) {
				swap(arr, i, Pindex);
				Pindex++;
			}
		}
		swap(arr,Pindex,end);
		return Pindex;
	}
	
	void quicksort(int arr[],int start, int end) {
		if(start<end) {
			Pindex=partition(arr, start, end);
			quicksort(arr, start, Pindex-1);
			quicksort(arr, Pindex+1, end);
		}
		
	}
	
	public static void main(String[] args) {
		QuickSort qs =new QuickSort();
		
		int arr[]= {50,10,20,80,60,40,100};
		
		qs.quicksort(arr, 0, arr.length-1);
		// we can take 0 index or middle index of last index as a pivot...
		
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
