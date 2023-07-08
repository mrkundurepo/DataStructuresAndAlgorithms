// Minimum of an Array
public class A05_MinArray {
	public int findMinimum(int[] arr){
		if(arr == null || arr.length == 0){
			throw new IllegalArgumentException("Invalid Input");
		}
		int min = arr[0];
		for(int i=1; i<arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		} return min;
	}
	// Second Maximum value in an array
	public int findSecondMax(int[] arr){
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++){
			if (arr[i] > max){
				secondMax = max;
				max = arr[i];
			} else if (arr[i] > secondMax && arr[i] != max){
				secondMax = arr[i]
			}			
		} return secondMax;
	}

	public static void main(String[] args){
		int[] arr = {5,9,3,15,1,2};
		A05_MinArray ma = new A05_MinArray
		System.out.println("Min: " + ma.findMinimum(arr));
		System.out.println(ma.findMinimum(null));
		System.out.println(ma.findMinimum(new int[0]));
		System.out.println("Second Max: " + ma.findSecondMax(arr));

	}
}