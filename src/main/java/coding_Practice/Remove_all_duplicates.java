package coding_Practice;

import java.util.ArrayList;
import java.util.Stack;

public class Remove_all_duplicates {
	Stack<Character> stack = new Stack<>();
	int count=1;
	   public String removeDuplicates(String S) {
		 for(int i=0;i<S.length();i++) {
			 if(!(stack.isEmpty())&&stack.peek()==S.charAt(i)) {
				stack.pop();
                count++;}			 
                else {
			   stack.push(S.charAt(i));
               count=1;	}		 
			 }
		 StringBuilder st = new StringBuilder();
		 while(!stack.empty())
		   st.append(stack.pop());
		 return st.reverse().toString();
	 }
	 
	 public static void main(String[] args) {
		 Remove_all_duplicates obj = new Remove_all_duplicates();
		 String duplicate =  "baaaacaaaa";
		 String rslt = obj.removeDuplicates(duplicate);
		 System.out.println(rslt);
	 }

}
