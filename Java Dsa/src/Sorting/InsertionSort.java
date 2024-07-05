package Sorting;
import java.util.Arrays;

import com.bipinDsa.main.Methods;
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {4,2,9,12,3,1,5,1};
		System.out.println(Arrays.toString(nums));
		sort(nums);
		System.out.println(Arrays.toString(nums));		
	}
	private static void sort(int[] nums) {
			for(int i=0;i<nums.length;i++) {
				int j=i;
				while(j>0 && nums[j]<nums[j-1]) {
					Methods.swap(nums,j-1,j);
					j--;
				}
			}
		
	}	
}


