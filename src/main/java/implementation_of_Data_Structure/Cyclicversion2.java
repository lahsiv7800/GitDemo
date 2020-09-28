package implementation_of_Data_Structure;

import java.util.HashMap;
import java.util.Map;

public class Cyclicversion2 {
	
	class Node{
		int data;
		Node next;
		Node(int val){
			data= val;
			next=null;
			
		}
	}
	
	public Node hasCycle(Node head) {
		
		Map<Node,Integer> NodesSeen= new HashMap<>();
		int i=0;
		
		while(head !=null) {
			if(NodesSeen.containsKey(head))
				return head;
			else
			  NodesSeen.put(head, i++);
		      head=head.next;
		}
		return null;
	}

}
