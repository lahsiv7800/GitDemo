package Calling_Program;

import org.junit.Test;

import coding_Practice.Twosum_with_hashmap;

public class twosumwith_map {
	
	@Test
	public void call()
	{
		int[] nums = new int[] {2,7,11,15};
		Twosum_with_hashmap hmap = new Twosum_with_hashmap();
		int[] rslt = hmap.twoSum(nums, 9);
		
		
		for(int i =0;i<rslt.length;i++) {
		//System.out.println("  ");	
		System.out.println(" ");
		System.out.println(rslt[i]);
		}
		
		
				
	}

}
