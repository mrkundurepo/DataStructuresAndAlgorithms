// MoveZeror to the end of an array 
public class A06_MoveZeros{
	public static void printArray(int[] arr){
		int n = arr.length;
		for(int i = 0; i<=n; i++){
			System.out.println(arr[i] + "");}
		}
		System.out.println();
	}	
	public void arrayDemo(){
		int[] arr = {8,1,0,2,1,0,3};
		printArray(arr);
		moveZeros(arr, arr.length);
		printArray(arr);
	}
	public void moveZeros(int[] arr, int n){
		int j=0;
		for(int i=0; i<n; i++){
			if(arr[i] != 0 && arr[j]==0){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[i] = temp;
			}
			if(arr[j] != 0){
				j++
			}
		}
	}
	public static void main(String[] args){
		A06_MoveZeros arrUtil = new A06_MoveZeros();
		arrUtil.arryDemo();
	}
}