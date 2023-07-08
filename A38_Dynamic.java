// Dynamic top down
public class A38_Dynamic{
	public int fib(int n){
		int[] table = new int[n+1];	// 0 -> N
		table[0] = 0;
		table[1] = 1;
		for(int i=2; i<=n; i++){
			table[i] = table[i-1] + table[i-2];
		}
		return table[n];
	}
	public int fib(int[] memo, int n){
		// 0 to 6
		if(memo[n] == 0){
			if(n < 2){
				memo[n]=n; // 0 and 1
			} else {
				// The currnet number is um of its preceding two numbers
				int left = fib(memo, n-1); 
				int right = fib(memo, n-2);
				memo[n] = left + right;
			}
		}
		return memo[n];
	}
	public static void main(String[] args){
		A38_Dynamic dy = new A37_Dynamic();
		System.out.println("The 6th fibonacci number is - " + dy.fib(new int[6+1], 6));
	}
}