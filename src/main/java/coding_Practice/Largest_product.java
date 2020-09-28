package coding_Practice;

import org.junit.Test;

public class Largest_product  {
	
	
	int currprod;
	int prevprod = 0;
	int[] rslt = new int[2];
	
	@Test
	public int[] largest_Product(int[] arr)
	{
		int len = arr.length;
		int actlen = len +1;
		for(int i=0;i<=actlen;i++){
			 
			 currprod = arr[i] * arr[i+1];
			 if(currprod > prevprod) {
				 rslt[0] = i;
				 rslt[1] = i=i+1;
				 }
			   prevprod = currprod;
			 }
		return rslt;
			
		
		
	}

}
