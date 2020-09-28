package coding_Practice;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Longest_common_substring {
	
	
	@Test
	public void longestCommonPrefix(String[] strs) {
			Map<Integer,String> common = new HashMap<>();

			for(int i=0;i<strs.length;i++){
             common.put(i,strs[i]); 
             System.out.println(common);
            }
	       }
          }
