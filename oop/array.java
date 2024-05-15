package oop;

public class array {
	public static void main(String[] args) {
		// single dimensional array
		int [] num= {12,13,14,15};
		
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		// multi-dimensional array
		int [][] matrix = {{1,2,3,4},{5,6,7,8}};
		
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0; j<matrix[0].length;j++) {
				System.out.println(matrix[i][j]);
			}
			System.out.println("\n");
		}
		
	}

}
