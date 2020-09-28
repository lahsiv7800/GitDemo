package coding_Practice;

public class lastwordLength {
	
	public int lastwrdlength(String str) {
		//char[] c=str.toCharArray();
		boolean lastchar=true;
		int count=0;	
		int len=str.length();
		if (str.length()==0) 
		return 0;
		for(int i=len-1;i>=0;i--) {
			if(str.charAt(i)!= ' ') {
				count++;
				lastchar=false;
			}else {
			  if(!lastchar) {
				break;
			   }
			}
		}
		return count;	
			
	}
	
	public static void main(String[] args) {
		lastwordLength wrdlen=new lastwordLength();
		int rslt=wrdlen.lastwrdlength("Hello world     ");
		System.out.println(rslt);
				
	}
}
