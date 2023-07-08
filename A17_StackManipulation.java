// Using stack
import java.util.stack;
public class A17_StackManipulation{
	// Reverse string
	public static reverseString(String str){
		Stack <Character> stack = new Stack<>();
		char[] chars = str.toCharArray();
		for(char c: chars){
			stack.push(c);
		}
		for(int i=0; i<str.length(), i++){
			chars[i] = stack.pop();
		}
		return new String(chars);
	}
	// Next Greater element
	public int[] nextGreaterElement(int[] arr){
		int[] result = new int[arr.length];
		Stack<Integer> stack = new Stack<>();
		for(int i = arr.length-1; i>=0; i--){
			if(!stack.isEmpty()){
				while(!stack.isEmpty() && stack.peek() <= arr[i]){
					stack.pop();
				}
			} 
			if(stack.isEmpty()){
				result[i] = -1;
			} else {
				result[i] = stack.peek();
			}
			stack.push(arr[i]);
		} 
		return results;
	}	
	// Check parentheses
	public boolean isValid(String s){
		Stack<Character> stack = new Stack<>();
		for (char c: s.toCharArray()){
			if(c == '(' || c == '{' || c == '['){
				stack.push(c);
			} else {
				char top = stack.peek();
				if((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')){
					stack.pop();
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	public static void main(String[] args){
		A17_StackManipulation revStr = A17_StackManipulation();
		String str = "ABCD";
		System.out.println("Before reverse -" + str);
		System.out.println("After reverse -" + revStr.reverseString(str));
	}
}