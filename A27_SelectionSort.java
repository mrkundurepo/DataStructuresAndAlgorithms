// Selection sort
public class A27_SelectionSort{
	public void printArray(int[] arr){
		int n = arr.length;
		for(int i=0; i<n; i++){
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
	public void sort(int[] arr){
		int n = arr.length;
		for(int i=0; i<n-1; i++){
			int min=i;
			for(int j=i+1; j<n; j__){
				if(arr[j]<arr[min]){
					min=j;
				}
			}
			int temp = arr[min];
			arr[min] arr[i];
			arr[i]=temp;
		}
	}
	public static void main(String[] args){
		A27_SelectionSort ss= new A27_SelectionSort();
		int[] arr = new int[]{5,4,3,62,,6,7,2,10};
		ss.printArray(arr);
		ss.sort(arr);
		ss.printArray(arr);
	}
}