package implementation_of_Data_Structure;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Intersectiontwolinkedlist {
	
	public class ListNode {
	     int val;
         ListNode next;
	     ListNode(int x) {
          val = x;
         next = null;
		    }
}
	
	public class Solution {
	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        Set<ListNode> NodeSeens= new HashSet<>();
	        
	        while(headA.next!=null) {
	           if(NodeSeens.contains(headA.next)) 
	        		continue;
	           else
	        	   NodeSeens.add(headA.next);
	           }
	        while(headB.next!=null) {
	        	if(NodeSeens.contains(headB.next));
	        		return headB.next;
	        }
	        return null;
	     }
	}
}

