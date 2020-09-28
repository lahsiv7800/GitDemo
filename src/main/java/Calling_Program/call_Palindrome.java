package Calling_Program;

import org.junit.Test;

import coding_Practice.Palindrome_Number;


public class call_Palindrome {
	
	@Test
	public void call()
	{
		Palindrome_Number num  = new Palindrome_Number();
		boolean Palin = num.Palindrome_num(121);
		System.out.println(Palin);
		
	}
	
}
