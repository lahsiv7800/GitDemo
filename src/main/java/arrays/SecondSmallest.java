package arrays;

public class SecondSmallest {
	
	   public int scndSmallest(int[] arr) {
		int len=arr.length;
		int fsmlst,scmlst;
		fsmlst=scmlst=Integer.MAX_VALUE;
		for(int i=0;i<len;i++) {
		  //to get largest element
		  if(arr[i]<fsmlst) { 
		  scmlst=fsmlst;
		  fsmlst=arr[i];
		       }
		  //to get secondLargest element
		  if(arr[i]>fsmlst && arr[i]<scmlst)
		  scmlst=arr[i];
		  }
		  return scmlst;
	     }
	
	  public static void main(String[] args) {
	    SecondSmallest scndsmlest= new SecondSmallest();
		int[] arr= {2,5,3,1,0};
		int rslt=scndsmlest.scndSmallest(arr);
		System.out.println(rslt);
	   }
  }
