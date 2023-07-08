// Resize array 
public class A07_ArrayUtil{
	public void printArray(int[] arr){
		int n = arr.length;
		for(int i = 0; i<=n; i++){
			System.out.println(arr[i] + "");}
		}
		System.out.println();
	}	
	public int[] resize(int[] arr, int capacity){
		int[] temp = new int[capacity];
		for(int i=0; i<arr.length; i++){
			temp[i] = arr[i];
		}
		arr = temp;
		return arr;
	}
	public static void main(String[] args){
		A07_ArrayUtil arrUtil = new A07_ArrayUtil();
		// arrUtil.printlArray(new int[] {5,1,2,9,10});
		int[] original = new int[]{5,1,2,9,10};
		System.out.println("This resize of original array - " + original.length);
		original = arrUtil.resize(orginal,10);
		System.out.println("This resize of original array resized - " + original.length);
		
	}
}