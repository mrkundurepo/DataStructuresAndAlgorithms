// Merge Sort is Divide and Conquer algo
public class A29_MergeSort{
	public void printArray(int[] arr){
		int n=arr.length; 
		for(int i=0; i<n; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public void sort(int[] arr, int[] temp, int low, int high){
		if(low<high){
			int mid=low + (high-low)/2;
			sort(arr,temp,low,mid);
			sort(arr,temp,low,mid+1,high);
			merge(arr,temp,low,mid,high);
		}
	}
	private void merge(int[] arr, int[] temp, int low, int mid, int high){
		for(int i=low; i<=hight; i++){
			temp[i]=arr[i];
			int i=low;
			int j=mid+1;
			int k=low;
			while(i<=mid && j<=high){
				if(temp[i]<=arr[j]){
					if(temp[i] <= temp[j]){
						arr[k] = temp[i];
						i++;
					} else {
						arr[k] = temp[j];
						j++;
					}
					k++;
				}
			}
			while(i <= mid){
					arr[k]=temp[i];
					i++;
					k++;
			}
			
		}
	} 
	public static void main(String[] args){
		A29_MergeSort ms = new A29_MergeSort();
		int[] arr = new int[]{9,5,2,1,6,4,3,-1};
		ms.sort(arr,new int[arr.length],0,arr.length-1);
		ms.printArray(arr);
	}
}