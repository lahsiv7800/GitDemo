package coding_Practice;

import java.util.HashMap;
import java.util.Map;

public class Twosum_with_hashmap1 {
	
	public int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        map.put(nums[i], i);
	        System.out.println(map);
	    
	        int complement = target - nums[i];
	        //System.out.println(map.containsKey(complement));
	        //System.out.println(map.get(complement));
	        if (map.containsKey(complement) && map.get(complement) != i) {
	            return new int[] { i, map.get(complement) };
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");

}
}
