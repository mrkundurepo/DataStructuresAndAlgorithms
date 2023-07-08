// Dynamic Programming (Fibonnaci)
public class A37_Dynamic {
	public int fib(int n){
		int[] table = new int[n+1];	// 0 -> N
		table[0] = 0;
		table[1] = 1;
		for(int i=2; i<=n; i++){
			table[n] = table[i-1] + table[i-2];
		} 
		return table[n];
	}
	public static void main(String[] args){
		A37_Dynamic dy = new A37_Dynamic();
		System.out.println("The 6th Fibonnacci number is - " + dy.fib(6));
	}
}