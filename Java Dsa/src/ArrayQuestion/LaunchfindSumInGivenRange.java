package ArrayQuestion;
import java.util.Scanner;
public class LaunchfindSumInGivenRange {
	//this is row-vise prifixSum.
	public static void rowPrifixSum(int [][]arr,int row,int column) {
		for(int i=0;i<row;i++) {
			for(int j=1;j<column;j++)
				arr[i][j]=arr[i][j]+arr[i][j-1];	
		}
	}
	//this is column wise prefix sum.
	public static void columnPrefixSum(int [][]arr,int row ,int column) {
		for(int j=0;j<column;j++) {
			for(int i=1;i<row;i++) {
				arr[i][j]=arr[i][j]+arr[i-1][j];
			}
		}
	}
	public static void print(int [][] arr,int row,int column) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}	
	//sum of given range.
	public static int sumRange(int [][]arr) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first row :");
		int r1=sc.nextInt();
		System.out.println("enter the first column");
		int c1=sc.nextInt();
		System.out.println("enter the last row: ");
		int r2=sc.nextInt();
		System.out.println("enter the last column :");
		int c2=sc.nextInt();
		if(r1==0 && c1==0) {
			return arr[r2][c2];
		}else if(r1==0) {
			return arr[r2][c2-1];
		}else if (c1==0) {
			return arr[r2-1][c2];
		}
		else {
		int left=arr[r2][c1-1];
		int upper=arr[r1-1][c2];
		int common=arr[r1-1][c1-1];
		int totalSum=arr[r2][c2];
		int finalSum=totalSum-left-upper+common;
		return finalSum;	
	} 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row :");
		int row =sc.nextInt();
		System.out.println("enter the column :");
		int column =sc.nextInt();
		int [][]arr=new int [row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.println("enter the values: ");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("row prefix method called :");
		rowPrifixSum(arr,row,column);
		print(arr,row,column);
		System.out.println("column prefix method called:");
		columnPrefixSum(arr,row,column);
		print(arr,row,column);
		System.out.println("final sum method getting called:");
		int netSum=sumRange(arr);
		System.out.println("sum is :"+netSum);	
	}
}
