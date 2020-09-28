package implementation_of_Data_Structure;

public class DesignOfHashMapUsingLinkedList {
	
	private class HashNode{
		int key;
		int value;
		HashNode next;
		HashNode(int key,int value,HashNode next){
			this.key=key;
			this.value=value;
			this.next=next;
		 }
	    }	
		
		
		HashNode hashArray[];
		int N;
		
		DesignOfHashMapUsingLinkedList(){
			this.N=10000;
			hashArray= new HashNode[N];
			
		}
		
		public int getIndex(int key) {
			return Integer.hashCode(key) & (N-1);
		}
		
		public int get(int key) {
			return key;
			
		}
		
		public void put(int key,int value) {
			
		}
		
		public void remove(int key) {
				
		}
	
	

}
