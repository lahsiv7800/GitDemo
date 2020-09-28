package coding_Practice;

public class Split_function {
	
	public static void main(String[] args) {
		String str = "geekss:";
		String[] rslt = str.split(":");
		int len=rslt.length;
		System.out.println(len);
		for(int i=0;i<len;i++) {
			System.out.println(rslt[i]);
		}
		
	}
}
