package recursion;

public class First_non_repaeting_charater {
	
	int NO_OF_CHAR = 256;
	char[] count = new char[NO_OF_CHAR];
	
	public void getCharAt(String str) {
		for(int i=0;i<str.length();i++){
			 count[str.charAt(i)]++;
		}
		
		
		for(int i=0;i<str.length();i++) {
			
		}
	}
	
	
	public static void main(String args[]) {
		String str = "geeksforgeeks";
		First_non_repaeting_charater obj1 = new First_non_repaeting_charater();
		obj1.getCharAt(str);
		
		
	}


}
