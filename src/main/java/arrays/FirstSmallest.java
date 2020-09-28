package arrays;

public class FirstSmallest {

	
	public int firstsmallest(int[] arr) {
		
		int len=arr.length;
		int fsmallest=Integer.MAX_VALUE;
		
		if(len<2)
			return 0;
		for(int i=0;i<len;i++) 
			if(arr[i]<fsmallest)
				fsmallest=arr[i]; 
		  return fsmallest;
		
	}
	
	public static void main(String[] args) {
		FirstSmallest obj= new FirstSmallest();
		int[] arr= {4,5,2,7,4};
		int rslt=obj.firstsmallest(arr);
		System.out.print(rslt);
	}
}
