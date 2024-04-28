package ArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class AddTwoMatrix {
		public static void print(int[][] matrix) {
			for(int i=0;i<matrix.length;i++) {
				for(int j=0;j<matrix[i].length;j++) {
					System.out.print(matrix[i][j]+" ");
				}
				System.out.println();
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("for first array -");
		System.out.println("giver row number:");
		int r1=sc.nextInt();
		System.out.println("give column number:");
		int c1=sc.nextInt();
		//decelaration of first array.
		int [][] arr1=new int [r1][c1];
		//intialization of first array.
		System.out.println("give the values for array1");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		//printing the first array in console.
		print(arr1);
		
		
		System.out.println("for second array");
		System.out.println("give row of second array:");
		
		int r2=sc.nextInt();
		System.out.println("give column of second array:");
		int c2=sc.nextInt();
		//declaration second array.
		int [][]arr2=new int [r2][c2];
		//for intialization of second array.
		System.out.println("give the values for second array");
		for(int i=0;i<r2;i++) {
			for (int j=0;j<c2;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		print (arr2);
		
		//decelaration of result named sum array.
		int [][] sum=new int [r1][c1];
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				sum[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		
		if(r1!=r2 || c1!=c2) {
			System.out.println("your sum may be lost");
		}
		//print sum array.
		System.out.println("sum is");
		print(sum);
		
		
		
	}
	

}
