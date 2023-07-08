// Binary Search (sorted)
public class A24_BinarySearch{
	public int binarySearch(int[] nums, int key){
		int low=0; 
		int high=nums.lenght-1;
		while(low <= high){
			int mid = (high+low)/2;
			if(nums[mid]==key) return mid;
			if(key<nums[mid]){
				high = mid-1;
			} else {
				low = mid+1;
			}
		}
		return -1;
	}
	// Search insert
	public int searchInsert(int[] arr, int target){
		int low = 0;
		int high = arr.length-1;
		while(low <= high){
			int mid = low + (high-low)/2;
			if(arr[mid] == target){				
				return mid;
			}
			if(target < arr[mid]){
				high = mid-1;
			} else {
				low = mid + 1;
			}
		}
		return low;
	}
	public static void main(String[] args){
		A24_BinarySearch bs = new A24_BinarySearch();
		int[] nums = {1,10,20, 47, 59, 65,75, 88, 99};
		System.out.println(bs.binarySearch(nums, 65));
		System.out.println(bs.binarySearch(nums,100));
		System.out.println(bs.searchInsert(nums,66));
		System.out.println(bs.binarySearch(nums,66));
	}
}