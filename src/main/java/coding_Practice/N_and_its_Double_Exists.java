package coding_Practice;

import java.util.HashSet;
import java.util.Set;

public class N_and_its_Double_Exists {
	public boolean checkIfExist(int[] arr){
		 Set<Integer> set = new HashSet<>();
		 for(int num: arr) {
			 if(set.contains(num*2)){
			     if(set.contains(num/2))
			     return true;
			 }
			 set.add(num);
			}return false;
        }
	
	   public static void main(String[] args) {
		   int[] arr = new int[] {3,1,7,11};
		   N_and_its_Double_Exists obj = new N_and_its_Double_Exists();
		   boolean rslt = obj.checkIfExist(arr);
		   System.out.println(rslt);
	   }
       }