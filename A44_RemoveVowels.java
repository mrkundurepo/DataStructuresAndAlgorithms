// Remove Vowels 
public class A44_RemoveVowels{
	public static String removeVowels(String str){
		Set<Character> vowels = Set.of('a','e','i','o','u');
		StringBuilder sb = new StringBuilder();
		for (Character ch: charArray){
			if(!vowels.contains(ch)){
				// C J B K
				sb.append(ch);
			}
		}
		return sb.toString();
	}
	public static void main(String[] args){
		// A44_RemoveVowels rv = new A44_RemoveVowels();
		System.out.println(removeVowels("icecream"));
	}
}