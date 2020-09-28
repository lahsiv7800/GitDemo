package Calling_Program;

import org.junit.Test;

import coding_Practice.Largest_product;

public class LargestProd  {
	
	
	@Test
	public void product()
	{ 
		Largest_product obj = new Largest_product();
		
		int[] input = new int[] {4,2,7,1};
		int[] rslt1 = obj.largest_Product(input);
		
		
		System.out.println(rslt1);
	}

}
