package chapter07;

public class TwoDimension {

	public static void main(String[] args) {
		int i, j, k = 0;
		int matrix[][] = new int[4][];
		matrix[0] = new int[1];
		matrix[1] = new int[2];
		matrix[2] = new int[3];
		matrix[3] = new int[4];
		/* for (i=0; i<matrix.length; i++)
				matrix[i] = new int[i+1];
		¿Í °°´Ù. */
		
		for (i = 0; i < matrix.length; i++)
			for (j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = k;
				k++;
			}
		
		for (i = 0; i < 4; i++){
			for (j = 0; j < i+1; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}//main

}//program
