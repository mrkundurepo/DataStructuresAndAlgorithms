// First non repeating character
public class A43_NonRepeating {
	public static int firstNonRepeatingCharacter(String str){
		Map<Character, Integer> CharacterFrequencyMap = new HashMap<>();
		char[] chars = str.toCharArray();
		for(char ch: chars){
			CharacterFrequencyMap.put(ch, CharacterFrequencyMap.getOrDefault(ch,0) + 1);
		}
		for(int i=0; i<char.length; i++){
			char ch = chars[i];
			if(CharacterFrequencyMap.get(ch)==1){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		System.out.println(firstNodeRepeatingCharacter("racercars"));
		System.out.println(firstNodeRepeatingCharacter("ababab"));
		System.out.println(firstNodeRepeatingCharacter("abababe"));
		System.out.println(firstNodeRepeatingCharacter("abafbab"));

	}
 }