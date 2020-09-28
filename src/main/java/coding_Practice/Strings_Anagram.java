package coding_Practice;

import java.util.HashMap;

public class Strings_Anagram {
public int minSteps(String s, String t) {
	int count=0;
	HashMap<Character,Integer> counter = new HashMap<>();
	for(int i=0;i<s.length();i++){
		char curr = s.charAt(i);
		counter.put(curr,counter.getOrDefault(curr,0)+1);
	}
	for(int j=0;j<t.length();j++) {
		char curr = t.charAt(j);
		Integer  charCount = counter.get(curr);
		if(charCount != null && charCount > 0) {
			charCount --;
			counter.put(curr,charCount);
			}
		else {
			count ++;
		}
	   }
      return count;  
    }

public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
        return false;
    }
    int[] counter = new int[26];
    for (int i = 0; i < s.length(); i++) {
        counter[s.charAt(i) - 'a']++;
        counter[t.charAt(i) - 'a']--;
       }
    for (int count : counter) {
        if (count != 0) {
            return false;
        }
    }
    return true;
}

    public static void main(String[] args) {
    	Strings_Anagram vm = new Strings_Anagram();
    	String s = "abc";
    	String t = "cab";
    	boolean Diff = vm.isAnagram(s, t);
    	System.out.println(Diff);
    }
   }
