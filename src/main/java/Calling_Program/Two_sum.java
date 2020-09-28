package Calling_Program;

import org.junit.Test;

import coding_Practice.Two_Sum;


public class Two_sum 
{	
	@Test
	public void call()
	{
		
	int[] rslt = new int[4];	
	int[] nums = new int[] {3,1,3};
	Two_Sum sum = new Two_Sum();
	 rslt = sum.twoSum(nums, 6);
	
	
	for(int i=0; i<rslt.length ;i++)
	  System.out.println(rslt[i]);
	}
}
