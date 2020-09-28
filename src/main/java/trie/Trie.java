package trie;

import java.util.HashMap;
import java.util.Map;

public class Trie {

	private class TrieNode{
		int terminating;
		final TrieNode[] trienode = new TrieNode[26];
		public TrieNode() {
			children =  new HashMap<>();
			endOfWord = false;
			}
	   }
    private final  TrieNode root;
	   public Trie(){
		   root = new TrieNode();
	   }
	   
	   /**
	    * Iterative implementation of insert into trie
	    */
	   
	   public void Insert(String word) {
		   TrieNode current = root;
		   
		   for(int i=0;i<word.length();i++) {
			   char ch = word.charAt(i);
			   TrieNode node = current.children.get(ch);
			   if(node == null){
				   node = new TrieNode();
				   node.children.put(ch, node);
			   }current = node;
			  }current.endOfWord = true;
		     }
	   
	   public int Search(String word) {
		   TrieNode current = root;
		   
		   for(int i=0;i<word.length();i++) {
			   if(current == null) {
			   return 0;
			   		   }return current.endOfWord;
		   
	   }
	   
	  
	   
	   public static void main(String args[]) {
		   Trie node  = new Trie();
		   node.Insert("a");
		   System.out.println(node.Search("a"));
		   
	   }
	  }
