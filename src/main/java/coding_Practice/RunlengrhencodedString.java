package coding_Practice;

public class RunlengrhencodedString {
	
	public void encodedString(String norString) {
		
		int len=norString.length();
		
		for(int i=0;i<len;i++) {
		int count=1;
		String rslt;
		while(i<len-1 && norString.charAt(i)==norString.charAt(i+1)) {
		i++;
		count++;
		}
		
		
		
		
		
	}
		
			
		}
	public static void main(String[] args) {
		
		RunlengrhencodedString rslt = new RunlengrhencodedString();
		rslt.encodedString("aavvddddd");
	}

}
