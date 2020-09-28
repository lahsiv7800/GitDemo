package coding_Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Nonrepaeting_characters {
	
	public void nonrepeatingchar(String word) {
		Map<Character,Integer> charcount = new HashMap<>();
		char[] strArray = word.toCharArray();
		for(char c: strArray) {
		 if(charcount.containsKey(c)) {
		 charcount.put(c,charcount.get(c)+1);
		 }else{
			charcount.put(c,1);
			  }
		     }
		
		for(char c : strArray) {
			if(charcount.get(c)==1) {
				System.out.println("First Non-Repeated Character In '"+word+"' is '"+c+"'");
				break;
	       }
		  }
		for(char c:strArray) {
			if(charcount.get(c)>1) {
				System.out.println("First Repeated Character In '"+word+"' is '"+c+"'");
				break;
			}
		}
	     }
	
	  public static void main(String[] args){
		  Nonrepaeting_characters charcount = new Nonrepaeting_characters();
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the string :");
		  
 		  
	         
	        String input = sc.next();
	         
	        charcount.nonrepeatingchar(input);
		  
		
	}

}
