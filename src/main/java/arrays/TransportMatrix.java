package arrays;

public class TransportMatrix {
	
	public int[][] transpose(int[][] mat){
		int row=mat.length;
		int col=mat[0].length;
		int[][] ans=new int[row][col];
		 
		for(int i=0;i<row;i++)
		 for(int j=0;j<col;j++) {
			 ans[i][j]=mat[j][i];
		 }
		return ans;
	}
	
	public static void main(String args[]) {
		int[][] matrix= {{1,2},{3,4}};
		TransportMatrix trns=new TransportMatrix();
		int[][] rslt=trns.transpose(matrix);
		for(int i=0;i<rslt.length;i++)
			for(int j=0;j<rslt[0].length;j++)
		System.out.println(rslt[i][j]);
		
		
	}

}
