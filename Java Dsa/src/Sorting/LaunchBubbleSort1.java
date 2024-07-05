package Sorting;

import java.util.Arrays;

public class LaunchBubbleSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {4,6,1,2,9,1,23,5,6,7,3,1,0};
		
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
	public static void sort(int []arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}
