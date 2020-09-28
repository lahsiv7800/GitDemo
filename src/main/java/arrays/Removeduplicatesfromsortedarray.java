package arrays;

public class Removeduplicatesfromsortedarray {

	public int removeduplicate(int[] arr) {
		int len=arr.length;
		int temp[]=new int[len];
		int j=0;
		if(len==0)
		 return 0;	
		
		for(int i=0;i<len-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			}
		}
		 temp[j++]=arr[len-1];
		 return temp.length-1;
	}
	
	public int removeDuplicates(int[] nums) {
	    if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    return i + 1;
	}
	
	
	public static void main(String[] args) {
		Removeduplicatesfromsortedarray distinctele=new Removeduplicatesfromsortedarray();
		int arr[]= {1,2,2,3,4,5};
	    //int rslt=distinctele.removeduplicate(arr);
		int rslt=distinctele.removeDuplicates(arr);
	    System.out.println(rslt);
	}
	
}
