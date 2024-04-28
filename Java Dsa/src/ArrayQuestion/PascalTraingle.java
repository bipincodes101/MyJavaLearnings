package ArrayQuestion;

import java.util.Scanner;

public class PascalTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		int [][]arr=new int [n][];
		for(int i=0;i<n;i++) {
			//column size is row +1;
			arr[i]=new int [i+1];
			//last and first element is 1.
			arr[i][0]=arr[i][i]=1;
			for(int j=1;j<i;j++) {				
				//property of Pascal triangle.
				arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
				
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
