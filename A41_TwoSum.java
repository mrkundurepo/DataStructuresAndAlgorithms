// Two Sum
import java.util.HashMap;
import java.util.Map;
public class A41_TwoSum{
	public void printArray(int[] arr){
		int n = arr.length;
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public int findMinimum(int[] arr){
		// Edge case
		if(arr == null || arr.length == 0){
			throw new IllegalArgumentException("Invalid input");
		}
		int min = arr[0]; // Min will hold the minimum of array
		for(int i=1; i<arr.length; i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		return min;
	}
	public void reverse(int[] numbers, int start, int end){
		while(start < end){
			int temp = numbers[start];
			numbers[start] = numbers[end];
			number[end] = temp;
			start++;
			end--;
		}
	}
	public static int[] twoSum(int[] numbers, int target){
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<numbers.length; i++){
			if(!map.containsKey(target - nubers[i])){
				map.put(numbers[i],i);
			} else {
				result[1] = i;
				result[0] = ,ap.get(target-numbers[i]);
				return result;
			}
		} 
		throw new IllegalArgumentException("Two numbers not found");
	}
	public int[] twoSum2(int[] arr, int target){
		// Sorting and wto pointer approach
		Arrays.sort(arr);
		int left=0; 
		int right = arr.length-1; 
		int[] result = new int[2];
		while(left < right){
			int sum = arr[left] + arr[right];
			if(sum == target){
				result[0] = arr[left];
				result[1] = arr[right];
				return result;
			} else if(sum < target){
				left++;
			} else {
				right--;
			}
		}
		return new int[0];
	}
	public void arrayDemo(){
		int[] arr = {11,2,0,10,17,6};
		int[] result = twoSum2(arr,9);
		printArray(result);
	}
	public static void main(String[] args){
		A41_TwoSum ts = new A41_TwoSum();
		int[] numbers = new int[] {2,1,,5,10,7,8};
		int[] result = twoSum(numbers,9);
		System.out.println("The two indices are - " + result[0] + " and " + result[1]);
		result = twoSum2(numbers,9);
		System.out.println("The two indices are - " + result[0] + " and " + result[1]);
		ts.arrayDemo();
	}
}