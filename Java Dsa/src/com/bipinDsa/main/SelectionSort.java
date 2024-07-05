package com.bipinDsa.main;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,9,3,7,0,11};
		sorting(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void sorting(int []nums) {
		for(int i=0;i<nums.length;i++) {
			int min=i;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[j]<nums[min]) {
					min=j;
				}	
			}
			if(min!=i) {
				int temp=nums[min];
				nums[min]=nums[i];
				nums[i]=temp;
			}
		}
	}
}
