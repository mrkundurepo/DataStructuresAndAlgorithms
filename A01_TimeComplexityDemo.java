/*
	Introduction to Algorithms
	Analysis of Algorithms
	Time Complexity
*/

public class A01_TimeComplexityDemo { 
	public static void main(String[] args){
		double now  = System.currentTimeMillis();
		A01_TimeComplexityDemo demo = new A01_TimeComplexityDemo();
		System.out.println(demo.findSum(9999999));
		System.out.println("Time Taken - " + (System.currentTimeMillis() - now) + " millisecs.");
		now  = System.currentTimeMillis();
		System.out.println(demo.findSum2(9999999));
		System.out.println("Time Taken - " + (System.currentTimeMillis() - now) + " millisecs.");

	}
	// FindSum is faster than FindSum2
	public int findSum (int n){
		System.out.println("This is findSum1");
		return n * (n+1)/2;
	}
	public int findSum2 (int n){
		System.out.println("This is findSum2");
		int sum=0;
		for(int i=1; i<=n; i++){
			sum = sum + i;
		}
		return sum;
	}
}
