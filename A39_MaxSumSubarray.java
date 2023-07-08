// Maximum sum subarray
public class A39_MaxSumSubarray{
	public static int A39_MaxSumSubarray(int[] arr){
		int maxSoFar = arr[0];
		int currentMax = arr[0];
		for(int i=1; i<arr.length; i++){
			currentMax = currentMax + arr[i];
			// Q1: Element becomes part of current subarray
			if(currentMax < arr[i]){
				currentMax = arr[i];
			}
			// Q2: Element decides to start its own subarray
			if(maxSoFar < currentMax){
				maxSoFar = currentMax;
			}
		}
		return maxSoFar;
	}
	public static void main(String[] args){
		// A39_MaxSumSubarray mss = new A39_MaxSumSubarray();
		int[] arr = {4,3,-2,6,12,-11,7,-1,45};
		System.out.println(A39_MaxSumSubarray(arr));
	}
}