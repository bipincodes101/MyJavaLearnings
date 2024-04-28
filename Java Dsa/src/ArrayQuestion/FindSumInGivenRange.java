package ArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class FindSumInGivenRange {

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int []arr=new int [6];
		//for taking input in the array.
		for(int i=1;i<arr.length;i++) {
			System.out.println("enter the array value:");
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		//for finding prefix sum.
	
		for(int i=1;i<arr.length;i++) {
			arr[i]=arr[i]+arr[i-1];
			
		}
		System.out.println("enter number of query :");
		int q=sc.nextInt();
		while(q-->0) {
		System.out.println("enter the l value:");
		 int l=sc.nextInt();
		 System.out.println("enter the r value:");
		 int r=sc.nextInt();
		System.out.println(Arrays.toString(arr));
		//for finding sum in given range l to r.
		int sum =arr[r]-arr[l-1];
		System.out.println("sum is: "+sum);
	}
 }
}
