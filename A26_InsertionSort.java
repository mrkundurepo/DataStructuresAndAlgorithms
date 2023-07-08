// Insertion sort
public class A26_InsertionSort {
	public vpid printArray(int[] arr){
		int n = arr.length;
		for(int i=0; i<n; i++){
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
	public void sort(int[] arr){
		int n = arr.length;
		for(int i=1; i<n; i++){
			// Unsorted part
			int temp = arr[i];
			int j = i-1;
			// Sorted part
			while(j>=0 && arr[j]>temp){
				arr[j+1]=arr[j];
				// Shifting larger elements to temp by 1 position
				j=j-1;
			}
			arr[j+1]=temp;
		}
	}
	public static void main(String[] args){
		A26_InsertionSort is = new A26_InsertionSort();
		int[] arr = new int[]{5,1,2,9,10};
		is.printArray(arr);
		is.sort(arr);
		is.printArray(arr);
	}
}