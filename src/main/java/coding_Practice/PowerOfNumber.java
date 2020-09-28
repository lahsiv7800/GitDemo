package coding_Practice;

public class PowerOfNumber {
	
	public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }
	 
	
	public static void main(String[] args) {
		PowerOfNumber pow=new PowerOfNumber();
		boolean rslt=pow.isPowerOfThree(27);
		System.out.println(rslt);
		
	}

}
