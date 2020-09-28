package Calling_Program;

import org.junit.Test;

import coding_Practice.Longest_common_substring;

public class Longest_commn_Substring {
	
	
	@Test
	public void display() {
	
	String[] subs = new String[] {"flower","flow","flight"};
	
	Longest_common_substring lcs = new Longest_common_substring();
	
	lcs.longestCommonPrefix(subs);
	}
}
