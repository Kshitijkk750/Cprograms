package sorting_MergeSort;

public class MergeSort {
		void merge(int arr[], int start, int mid, int end) {
			int temp[]= new int[end-start+1];
			
			int i,j,k;
			i=start;
			j=mid+1;
			k=0;
			//Compare and insert smaller element into temp...
			
			while(i<=mid && j<=end) {
				if(arr[i]<arr[j]) {
					temp[k]=arr[i];
					k++;
					i++;
				}
				else {
					temp[k]=arr[j];
					k++;
					j++;
				}
			}
			
			//for remaining element or first half part ...
			while(i<=mid) {
				temp[k]= arr[i];
				i++;
				k++;
			}
			//for remaining element or second half part ...

			while(j<=end) {
				temp[k]= arr[j];
				j++;
				k++;
			}
			//copy to original array...
			
			k=0;
			for(i=start;i<=end;i++) {
				arr[i]=temp[k];
				k++;
				
			}
			
			
		}
		
		void mergeSort(int arr[], int start, int end) {
			
			if(start<end) {
				int mid= (start+end)/2;
				mergeSort(arr, start, mid); 
				mergeSort(arr,mid+1,end);
				merge(arr, start, mid, end);
				
			}
		}
	public static void main(String[] args) {
			
		MergeSort ms= new MergeSort();
		
		int arr[]= {50,10,30,20,60,40,100};
		
		ms.mergeSort(arr, 0, arr.length-1);
		
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
