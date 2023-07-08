// Subsequence
public class A42_Subsequence{
	public static boolean isSubsequence(String str, String seq){
		int i=0;	// Traverse str "ABCDE"
		int j=0;	// Traverse str "ACE"
		while(i<str.length() && j<seq.length()){
			if(str.charAt(i) == seq.charAt(j)){
				j++;
			}
			i++;
		}
		return j = seq.length();
	}
	public static void main(String[] args){
		System.out.println(isSubsequence("abcde","ace"));
		System.out.println(isSubsequence("abcde","aec"));
	}
}