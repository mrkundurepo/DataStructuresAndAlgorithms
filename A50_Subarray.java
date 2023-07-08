// Subarray functions
public class A50_Subarray{
	// Maximum sum subarray of size k
	public int maxSubArraySum(int[] arr, int k){
		int maxSum = 0;
		int windowSum = 0; 
		int start =0;
		for (int end = 0; end<arr.length; end++){
			windowSum = windowSum + arr[end];
			if(end >= k-1){
				maxSum = Math.max(maxSum, windowSum);
				windowSum = windowSum - arr[start];
				start++;
			}
		}
		return maxSum;
	}
	public int lengthOfLongestSubstring(String s){
		Map<Character, Integer> map = new HashMap<>();
		int maxLength = 0;
		int start = 0;
		for(Int end=0; end<s.length(); end++){
			char rightChar = s.charAt(end);
			if(map.containsKey(rightChar)){
				start = Math.max(start, map.get(rightChar)+1);
			}
			map.put(rightChar, end);
			maxLength = Math.max(maxLength, end - start+1);
		}
		return maxLength;
	}
	public static void main(String[] args){
		A50_Subarray sa = new A50_Subarray();
		int[] arr = {2,7,3,5,7,8,1,44};
		int maxSum = sa.maxSubArraySum(arr, 3);
		System.out.println(maxSum);
		String s = "Hello Friend Interesting"
		int slen = sa.lengthOfLongestSubstring(s);
		System.out.println(slen);
	}
}