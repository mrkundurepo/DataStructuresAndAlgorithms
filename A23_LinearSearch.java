// Linear Search
public class A23_LinearSearch{
	public int search(int[] arr, int n, int x){
		for(int i=0; i<n; i++){
			if(arr[i] == x){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		A23_LinearSearch ls = new A23_LinearSearch();
		int[] arr = {5,1,9,2,10,15,20};
		System.out.println(ls.search(arr, arr.length, 10));
		System.out.println(ls.search(arr, arr.length, 50));
	}
}