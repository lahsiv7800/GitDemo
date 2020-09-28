package implementation_of_Data_Structure;

import java.util.Map;

public class DesignOfMap {
	
	/** Initialize your data structure here. */
    public int[] hashArray=new int[1000000];
    public DesignOfMap() {
        for(int i=0;i<hashArray.length;i++)
               hashArray[i]=-1;
        }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        hashArray[key]=value;
      }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return hashArray[key];
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        hashArray[key]=-1;
        
    }
    
    public static void main(String[] args) {
    	DesignOfMap newMap= new DesignOfMap();
    	newMap.put(0,5);
    	newMap.put(1,2);
    	newMap.put(4,5);
    	int rslt=newMap.get(1);
    	newMap.remove(0);
    	System.out.println(newMap.get(7));
    	
    	
    }
    
   }
