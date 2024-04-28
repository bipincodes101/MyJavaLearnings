package ArrayQuestion;

import java.util.Scanner;

public class MultiplyTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		//for first array.
		System.out.println("For first array");
		//enter the first row  array.
		System.out.println("enter the first arrat row :");
		int r1=sc.nextInt();
		//enter the first array column.
		System.out.println("enter the first array column :");
		int c1=sc.nextInt();	
		//for taking input in first array.
		System.out.println("give value for first array:");
		int [][]arr1=new int [r1][c1];
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		//for printing first array.
		print(arr1);
		System.out.println("for second array");
		System.out.println("give row of second array:");
		int r2=sc.nextInt();
		System.out.println("give column of second array:");
		int c2=sc.nextInt();
		int [][]arr2=new int[r2][c2];
		//for taking input in second array.
		System.out.println("give value for second array:");
		for(int i=0;i<r2;i++) {
			for(int j=0;j<c2;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		//for printing second array.
		print(arr2);
		System.out.println("");
		//result array.
		int [][]mul=new int[r1][c2];
		if (c1!=r2) {
			System.out.println("wrong array size ");
			return ;
		}
		for(int i =0;i<r1;i++) {//count row.
			for(int j=0;j<c2;j++) {//count column.
				for(int k=0;k<r1;k++) {//count number of multiply times.
					mul[i][j]+=arr1[i][k]*arr2[k][j];
				}
			}
		}
		System.out.println("the result is");
		print (mul);
		
	}		
	//method for printing the array.
			public static void print(int[] []matrix) {
				for(int i=0;i<matrix.length;i++ ) {
					for(int j=0;j<matrix[i].length;j++) {
						System.out.print(matrix[i][j]+" ");
					}
					System.out.println();
				}
			}
			
	

}
