package implementation_of_Data_Structure;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class CyclicOrNot {
	
	class Node{
		int data;
		Node next;
		Node(int val){
			data= val;
			next=null;
			
		}
	}
	
	public boolean hasCycle(Node head) {
		
		Set<Node> NodesSeen= new HashSet<>();
		
		while(head !=null) {
			if(NodesSeen.contains(head))
				return true;
			else
			  NodesSeen.add(head);
		      head=head.next;
		}
		return false;
	}
	
	public boolean hasCycle2(Node head) {
		
		Node slow=head;
		Node fast=head.next;
		
		while(slow!=fast) {
			if(fast==null || fast.next==null) 
			  return false;
			slow=slow.next;
			fast=fast.next.next;
		}
		return true;
	}
	
	public static void main(String args[]) {
		
	LinkedList list = new LinkedList();
	
		
	}
}

