package problem_Solving;

import java.util.ArrayList;


public class Product_of_last_k_numbers {
	
	ArrayList<Integer> A;
	
	public Product_of_last_k_numbers(){
		add(0);
        }
	
	public void add(int num) {
		  if(num > 0)
		  A.add(A.get(A.size()-1)*num);
		  else {
		  A = new ArrayList<>();
		  A.add(1);
		}
	   }	  
    public int getProduct(int k){
    	int n = A.size();
    	return n>k ? A.get(n-1)/A.get(n-1-k):0;
		}
    
    public static void main(String[] args) {
    	Product_of_last_k_numbers obj = new Product_of_last_k_numbers();
    	obj.add(5);
    	obj.add(2);
    	obj.add(8);
    	int rslt = obj.getProduct(4);
    	System.out.println(rslt);
    }
	}
 
