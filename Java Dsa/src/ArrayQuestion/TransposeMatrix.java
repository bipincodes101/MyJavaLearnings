package ArrayQuestion;

import java.util.Arrays;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr=new int[][] {
			{0,2,3},
			{4,-4,6},
			{7,10,9}
		};
		int [][]tMatrix=new int [3][3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				tMatrix[j][i]=arr[i][j];
			}
		}
		for(int i=0;i<tMatrix.length;i++) {
			for(int j=0;j<tMatrix[i].length;j++) {
				System.out.print(tMatrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
