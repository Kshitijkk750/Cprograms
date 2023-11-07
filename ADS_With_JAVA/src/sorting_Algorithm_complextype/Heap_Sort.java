package sorting_Algorithm_complextype;

public class Heap_Sort {

		void swap(int arr[],int i, int j) {
			
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
		void buildHeap(int arr[], int size) {
			int i;
			for(i=size/2;i>=0;i--) {
				Heapify(arr, i, size);
			}
		}
		
		void Heapify(int arr[],int index, int size) {
			int left= 2*index+1;
			int right= left+1;
			
			int max=index;
			if(left<=size && arr[left]>arr[max]) {
				max=left;
			}
			
			if(right<=size && arr[right]>arr[max]) {
				max=right;
			}
			
			if(index!=max) {
				swap(arr, max, index);
				Heapify(arr, max, size);
				
			}
			
		}
		
		void heapsort(int arr[],int size) {
			buildHeap(arr,size);
			
			while(size>0) {
				swap(arr,0,size);
				size--;
				Heapify(arr, 0, size);
			}
		}
		
	public static void main(String[] args) {

			Heap_Sort hs= new Heap_Sort();
			
			int arr[]= {50,10,30,60,80,20,100};
			System.out.println("Before sorting...");
			for (int i : arr) {
				System.out.println(i);
			}
			System.out.println("-----------------------");
			
			hs.heapsort(arr, arr.length-1);
			System.out.println("After sorting...");
			for (int no : arr) {
				System.out.println(no);
			}
			
	}

}
