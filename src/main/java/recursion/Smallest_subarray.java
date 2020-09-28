package recursion;

public class Smallest_subarray{
	public int subarray(int[] arr,int sum,int n) {
		
		int min_len = n+1;
		int arrlen =  arr.length;		
		for(int start=0;start<arrlen;start++) {
			int arr_sum =  arr[start];
			    if(arr_sum > sum)
				return 1;
			
		for(int end=start+1;end<arrlen;end++){
				 arr_sum = arr_sum + arr[end];
				 if(arr_sum > sum && (end-start+1)<min_len) {
					 min_len = end-start+1;
				 }
				}
		       }return min_len;
		      }
	
	public static void main(String[] args) {
		
		int[] rslt = new int[] {1,4,45,6,0,19};
		int arrlen = rslt.length;
		Smallest_subarray obj1 = new Smallest_subarray();
		int size = obj1.subarray(rslt, 49, arrlen);
		if(size == arrlen+1)
			System.out.println("Subarray is not found");
		else
		    System.out.println(size);
		}
	   }
