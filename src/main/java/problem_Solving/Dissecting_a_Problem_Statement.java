package problem_Solving;


public class Dissecting_a_Problem_Statement {
	
	public int highest_Price(int No_of_items,int[] priceList)
	{   int highest_price = 0;
		//Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < priceList.length; i++) {
	    //map.put(i,priceList[i]);
        //System.out.println(map);
		int curr_Price = priceList[i];
		if(curr_Price>highest_price){
		   highest_price=curr_Price;
		    }
		  }
		   return highest_price;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
		int[] priceList = new int[] {10,20,30,15,200}; 
		Dissecting_a_Problem_Statement Ps = new Dissecting_a_Problem_Statement();
		int highest_price = Ps.highest_Price(4, priceList); 
		System.out.println(highest_price);
		}
      }