// Array
public class A02_ArrayUtil{
	// Print an array in Java
	public void printArray(int[] arr){
		int n = arr.length;
		for(int i = 0; i<=n; i++){
			System.out.println(arr[i] + "");}
		}
		System.out.println();
	}
	public void arrayDemo(){
		int[] myArray = new int[5];
		// Default Values
		printArray(myArray);
		myArray[0] = 5;
		myArray[1] = 1;	
		myArray[2] = 8;
		myArray[3] = 2;
		myArray[4] = 10;
		printArray(myArray);
		myArray[2] = 9;
		printArray(myArray);
		// myArray[5] = 7;
		System.out.println(myArray.length);
		System.out.println(myArray[myArray.length-1]);
		int [] arr = {5,1,8,19}
		printArray(arr);
 	}
 	public static void main(String[] args){
 		A02_ArrayUtil arrUtil = new A02_ArrayUtil();
 		arrUtil.arrayDemo();
 		arrUtil.printArray(new int[] {5,1,2,9,10});

 	}
}