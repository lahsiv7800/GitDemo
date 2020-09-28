package coding_Practice;

public class Palindrome_Number {
	
	public boolean Palindrome_num(int x){
		
		if(x < 0 || x%10 == 0 && x != 0)
			return false;
		
		int revertnum = 0;
		while(x>revertnum)
		{
			revertnum = revertnum * 10 + x%10;
			x /= 10;
		}
		
		return x == revertnum || x == revertnum/10;
			
		
	}
	

}
