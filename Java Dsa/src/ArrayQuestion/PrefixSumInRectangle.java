package ArrayQuestion;

import java.util.Scanner;

public class PrefixSumInRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row of matrix:");
		int row=sc.nextInt();
		System.out.println("enter the column of matrix:");
		int column=sc.nextInt();
		int [][]matrix=new int [row][column];
		System.out.println("enter the values for matrix:");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("tell the boundries in matrix:");
		System.out.println("value of l1 :");
		int l1=sc.nextInt();
		System.out.println("value of r1 :");
		int r1=sc.nextInt();
		System.out.println("value of l2 :");
		int l2=sc.nextInt();
		System.out.println("value of r2 :");
		int r2=sc.nextInt();
		System.out.println("this is original matrix");
		print(matrix);
		System.out.println("this is prefix sum in rectangle");
		System.out.println();
		int result1=prefixSumInRectangle(matrix,l1,r1,l2,r2);
		System.out.println("total sum is : "+result1);
		System.out.println("result using 2nd method");
		int result2=sum2(matrix,l1,r1,l2,r2);
		System.out.println(result2);
		
	}
	//for printing the matrix.
	static void print(int [][]matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	/*approach -1*/
	//method for rectangle  sum.
	static int prefixSumInRectangle(int [][]matrix,int l1,int r1,int l2,int r2) {
		int sum=0;
		for(int i=l1;i<=l2;i++) {
			for(int j=r1;j<=r2;j++) {
				sum+=matrix[i][j];
			}
		}
		return sum;
	}
	
	/*approach -2*/
	
	//method for prefix sum.
	static void prefixSum(int [][]matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=1;j<matrix[i].length;j++) {
			matrix[i][j]+=matrix[i][j-1];
			}
		}
	}
	//method for caculating sum in rectangle .
	static int sum2(int[][] matrix,int l1,int r1,int l2,int r2) {
		prefixSum(matrix);
		int sum=0;
		for(int i=l1;i<=l2;i++) {
			if(r1>0) {
				sum+=matrix[i][r2]-matrix[i][r1-1];
			}
			else {
				sum+=matrix[i][r2];
			}
		}
		return sum;
	}
	
}
