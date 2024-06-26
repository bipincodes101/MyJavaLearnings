package ArrayQuestion;
import java.util.Scanner;
public class LaunchPrefixSum {
	public static void print(int [][] arr,int row,int column) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows: ");
		int row =sc.nextInt();
		System.out.println("enter the column :");
		int column =sc.nextInt();
		int [][]arr=new int [row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.println("enter the values");
				arr[i][j]=sc.nextInt();
			}
		}
		//array is printed.
		print(arr,row,column);
		System.out.println("sum method getting called");
		prefixSum(arr);
		
		
	}
	public static void prefixSum(int [][]arr) {
		Scanner sc=new Scanner(System.in);
		System.out.println("give the  first row  :");
		int row1=sc.nextInt();
		System.out.println("give the  first column:");
		int column1=sc.nextInt();
		System.out.println("give the last row :");
		int row2=sc.nextInt();
		System.out.println("give the last column:");
		int column2=sc.nextInt();
		
		int sum=0;
		for(int i=row1;i<=row2;i++) {
			for(int j=column1;j<=column2;j++) {
				sum+=arr[i][j];
			}
		}
		System.out.println("sum is :"+sum);		
	}

}
