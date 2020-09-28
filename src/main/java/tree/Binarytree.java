package tree;

public class Binarytree {
	static class Node{
	  int key;
	  Node left,right;
	  Node(int value){
		  key=value;
		  left=right=null;
		  }
	     }
	Node root; 
	// Constructors 
	    Binarytree(int key){ 
	    root = new Node(key); 
	    }
	    Binarytree(){ 
	    root = null; 
	    } 
	    
	 public static void main(String[] args) {
		 	
	 }

}
