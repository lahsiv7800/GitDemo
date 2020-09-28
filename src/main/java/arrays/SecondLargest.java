package arrays;

public class SecondLargest {
	public int secondLargest(int arr[]) {
		int len=arr.length;
		int largest,secondLargest;
		largest=secondLargest=Integer.MIN_VALUE;
		for(int i=0;i<len;i++) {
		 //to get largest element
		 if(arr[i]>largest) {
		   secondLargest=largest;
		   largest=arr[i];
				     }
		 //to get secondLargest element
		 if(arr[i]<largest && arr[i]>secondLargest) {
			secondLargest=arr[i];
			} 
		}
		return secondLargest;
	}
	
	public static void main(String[] args) {
		SecondLargest scndsmlest= new SecondLargest();
		int[] arr= {2,5,3,1,0};
		int rslt=scndsmlest.secondLargest(arr);
		System.out.println(rslt);
	   }
  }
	
	
	


