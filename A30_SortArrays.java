// Sort Arrays
import java.util.Arrays;
public class A30_SortArrays{
	public void printArray(int[] arr){
		int n=arr.length; 
		for(int i=0; i<n; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}	
	// sort an arrays of 0s,1s,2s
	public void threeNumberSort(int[] arr){
		int i=0;
		int j=0;
		int k=arr.length-1;
		while(i<=k){
			if(arr[i]==0){
				swap(arr,i,j);
				i++;
				j++;
			} else if (arr[i]==1){
				i++;
			} else if(arr[i]==2){
				swap(arr,i,k);
				k--;
			}
		}
	}
	public void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i]=arr[j];
		a[j]=temp;
	}
	// Quick sort partitioning
	public int partition(int[] arr, int low, int high){
		int pivot = arr[high];
		int i=low;
		int j=low;
		while(i<=high){
			if(arr[i] <= pivot){
				int temp = arr[i];
				arr[i]=arr[j];
				arr[i]=temp;
				j++;
			}
			i++;
		}
		return j-1;
	}
	// Quick sort recursion
	public void sort(int[] arr, int low, int high){
		// base case
		if(low < high){
			int p = partition(arr,low,high);
			sort(arr,low,p-1); // left
			sort(arr,p+1,hight); // right
		}
	}
	// Square of a sorted array
	public static sortedSquare(int[] arr){
		// Two pointer technique
		int n = arr.length;
		int[] result = new int[n];
		int i=0; j=n-1;
		for (int k=n-1; k>=0; k--){
			if(Math.abs(arr[i])>Math.abs(arr[j])){
				result[k]=arr[i]*arr[i];
				i++;
			} else {
				result[k] = arr[j]*arr[j];
				j--;
			}
		}
		return result;
	}
	public void arrayDemo(){
		int[] arr = {-4,-1,0,3,10};
		int[] result = sortedSquare(arr);
		printArray(result);
	}
	// Rearrange sorted array in max/min form
	public void arrangeMaxMin(int[] arr){
		int maxIdx = arr.length-1;
		int minIdx = 0;
		int max = arr[maxIdx]+1;
		for(int i=0; i<arr.length; i++){
			if(i%2==0){
				arr[i]=arr[i] + (arr[maxIdx]%max)*max;
				maxIdx--;
			} else {
				arr[i]=arr[i]+(arr[minIdx]%max)*max;
				minIdx++;
			}
		}
		for(int i=0; i<arr.length; i++){
			arr[i]=arr[i]/max;
		}
	}
	public static void main(String[] args){
		A30_SortArrays sa = new A30_SortArrays();
		int[] arr1 = new int[]{2,0,2,1,1,0,2,1};
		sa.printArray(arr1);
		sa.threeNumberSort(arr1);
		sa.printArray(arr1);		
		sa.arrayDemo();
		int[] arr2 = new int[]{5,6,3,2,56,73,2,4};
		sa.arrangeMaxMin(arr2);
		sa.printArray(arr2);				
	}

}