// Merge Sorted Array
public class A28_MergeSortedArray{
	public void printArray(int[] arr){
		int n = arr.length;
		for(int i=0; i<n; i++){
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
	public int[] merge(int[] arr1, int[] arr2, int n, int m){
		int[] result = new int[n+m];
		int i=0; // Traverse ARR1 
		int j=0; // Traverse ARR2
		int k=0; // Traverse result
		while(i<n && j<m){
			// Boundary condition
			if(arr1[1]<arr2[j]){
				result[k] = arr1[i];
				i++;
			} else {
				result[k]=arr2[j];
				j++;
			}
			k++;
		}
		// Either arr1 got exhausted or arr2 got exhausted
		while(i<n){
			// Arr2 got exhausted
			result[k]=arr1[i];
			i++;
			k++;			
		}
		while(j<m){
			// Arr1 got exhausted 
			result[k]=arr2[j];
			j++
			k++
		}
		return result;	
			
	}
	public static void main(String[] args){
		A28_MergeSortedArray msa = new A28_MergeSortedArray();
		int[] arr1 = {0,1,8,10};
		int[] arr2 = {2,4,11,15,20};
		msa.printArray(arr1);
		msa.printArray(arr2);
		int[] result = ms.merge(arr1, arr2, arr.length, arr2.length);
		msa.printArray(result);		
	}
}