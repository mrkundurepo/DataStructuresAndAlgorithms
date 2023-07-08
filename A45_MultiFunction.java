// MultiFunction
public class A45_MultiFuction{
	// Reverse an integer
	public long reverse(int number){
		boolean isNegative = number < 0;
		if(isNegative){
			number = number*-1;
		}
		long reverse = 0; // overflow
		int lastDigit;
		while(number > 0){
			lastDigit = number % 10;
			revese = reverse*10+lastDigit;
			number = number/10;
		}
		return isNegative?reverse*-1:reverse;
	}
	// Three Sum problem 184 31
	public void threeSum(int[] arr, int target){
		Arrays.sort(arr);
		for(int i=0; i<arr.length-2; i++){
			int j = i+1;
			int k = arr.length-1;
			while(j<k){
				int sum = arr[i] + arr[i] + arr[k];
				if(sum == target){
					System.out.println(arr[i] + "," + arr[j] + "," + arr[k]);
					j++;
					k--;
				}
				else if(sum < target){
					j++;
				} else {
					k--;
				}
			}
		}
	}
	// product of array except self
	int[] findProduct(int[] arr){
		int temp = 1;
		int[] result = new int[arr.length];
		for(int i=0; i<arr.length; i++){
			result[i] = temp;
			temp = temp*arr[i];
		}
		temp=1;
		for(int i=arr.length-1; i>=0; i--){
			result[i] = result[i]*temp;
			temp =temp*arr[i];
		}
		return result;
	}
	// Sliding window maximum
	public List<Integer> maxSlidingWindow(int[] arr, int k){
		int[] ngeArr = nextGreatElement(arr);
		List<Integer> result = new ArrayList<>();
		for(int i=0; i<= arr.length-k; i++){
			int j=i;
			while(ngeArr[j] < i+k){
				j=ngeArr[j];
			}
			result.add(arr[j]);
		}
		return result;
	}
	public static void main(String[] args){

	}
}