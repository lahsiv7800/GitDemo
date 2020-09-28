package recursion;

public class Fibonacci_Series {
	
	public int Fibonacci(int n) {
		if(n==0)
			return 0;
		else if(n==1 || n==2) 
			return 1;
		
		else{
		 int series = Fibonacci(n-1) + Fibonacci(n-2);
		 return series;
		}
	}
	
	public int Iterfinonacci(int n1) {
		
		int prev =0;
		int curr = 1;
		
		for(int i=1;i<=n1;i++){
			int next = prev + curr;
			prev = curr;
			curr = next;
			
		}
			return curr;
	}
	
	public static void main(String args[]){
		
		Fibonacci_Series obj = new Fibonacci_Series();
		
		
		int rslt = obj.Iterfinonacci(5);
		
		System.out.println(rslt);
	}
	

}
