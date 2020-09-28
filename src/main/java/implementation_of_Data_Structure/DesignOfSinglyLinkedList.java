package implementation_of_Data_Structure;

public class DesignOfSinglyLinkedList {
	
	Node head;
	
	public  class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	//Adding a node in the 
	public void push(int data) {
		
		//Creating new Node
		Node newNode=new Node(data);
		
		//Checking whether Linked list empty or not
		newNode.next=head;
		
		head=newNode;
	}
	
	public void insertAfter(Node prev,int data,int position) {
		if(prev==null)
		  System.out.println("The given previous node cam not be null");
		
		
		Node newNode=new Node(data);
		Node curr=head;
		int index=0;
		
		while(index<position-1) {
			curr=curr.next;
			index++;
		}
		newNode.next=curr.next;
		curr.next=newNode;	
		}
	
	public void atTheEnd(int newData) {
		
		//Creating new Node
		Node newNode=new Node(newData);
		newNode.next=null;
		
		if(head==null) {
		  newNode=head;
		}
		
		Node last= head;
		while(last.next!=null) {
			last=last.next;
		}
		last.next=newNode;
		
		
    }
	
	public void insert(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
		}
		
		Node tempNode=head;
		while(tempNode.next!=null) {
			tempNode=tempNode.next;
		}
		tempNode.next=newNode;	
	}
	
	public void insertNth(int data,int position) {
		//Create new Node
		Node newNode=new Node(data);
		newNode.next=null;
		if(head==null) {
			if(position!=0) {
				System.out.println("Invalid Insertion Kindly add Node to first location");
			    return;}
			else
			 head=newNode;
		}
		if(head != null && position==0) {
			newNode.next=head;
			head=newNode;
			return;
		}
		
		Node current=head;
		Node prev;
		int i=0;
		
		while(i<position) {
			prev=current;
			current=current.next;
			if(current==null) {
				break;
			}
			i++;	
           }
	}
	
	public void display() {
		
		if(head==null) {
			return;
		}
		Node curr=this.head;
		while(curr!=null) {
			System.out.println("Current data is "+curr.data);
			curr=curr.next;
			}
	}
	
	public static void main(String args[]) {
		DesignOfSinglyLinkedList linkedList= new DesignOfSinglyLinkedList();
		linkedList.insert(10);
		linkedList.insert(30);
		
		linkedList.display();
	}
}
