package sortingAlgorithm;

public class Selection_Sort {
			public void swap(int arr[],int i, int j) {
				int temp=arr[i];
				
				arr[i]=arr[j];
				arr[j]=temp;
			}
		public int [] selectionSort(int arr[]) {
			int k=0;
			for(int i=0;i<=arr.length-1;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]>arr[j]) {
						swap(arr,i,j);
					}
				}
				//System.out.println(arr[i]);
			}
			return arr;
		}
		
		public void bubbleSortSort(int arr[]) {
			int k=0;
			for(int i=0;i<=arr.length-1;i++) {
				for(int j=i+1;j<arr.length-1-i;j++) {
					if(arr[j]>arr[j+1]) {
						swap(arr,i,j);
					}
				}
				System.out.println(arr[i]);
			}
		}
		
		public int [] insertionSort(int arr[]) {
			
			for(int i=1;i<arr.length;i++) {
				int value=arr[i];
				int index=i;
				while(index>0 && arr[index-i] > value) {
					arr[index] = arr[index-1];
					index--;
				}
				arr[index]= value;
			}
			return arr;
		}
		
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Selection_Sort s= new Selection_Sort();
			int arr[]={4,3,5,1,6,8,12,13,11};
			//int ar[]={4,1,6,8,12,13,11,40,33};

			
			//System.out.println(arr);
			System.out.println("After Selection Sorting...");
			int a[]=s.selectionSort(arr);
			for (int i : a) {
				System.out.println(i);
			}
			System.out.println("Aftre Bubble Sorting...");
			s.bubbleSortSort(arr);
			System.out.println("After Insertion Sort ...");
			int k[]= s.insertionSort(arr);
			for(int o:arr) {
				System.out.println(o);
			}
			
	}

}
