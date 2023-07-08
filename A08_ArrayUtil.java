// Find missing number in array
import java.util.Arrays;
public class A08_ArrayUtil{
	public static int findMissingNumber(int[] arr){
		int n = arr.length + 1;
		int sum = n * (n+1)/2;
		for(int num: arr){
			sum = sum - num;
		} return sum;
	}
	public void arrayDemo(){
		int[] arr = {8,1,0,2,1,0,3};
		System.out.println(findMissingNumber(arr));
	}
	public static void main(String[] args){
		A08_ArrayUtil arrUtil = new A08_ArrayUtil();
		arrUtil.arrayDemo();
	}

}