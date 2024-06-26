package ArrayQuestion;

import java.util.Arrays;

public class MergingWithoutExtraSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums1= {1,3,5,7};
		int []nums2= {0,2,6,8,9};
		exchange(nums1,nums2);
		sorting(nums1);
		sorting(nums2);
		System.out.println("left array");
		System.out.println(Arrays.toString(nums1));
		System.out.println("right array");
		System.out.println(Arrays.toString(nums2));	
	}
	public static void exchange(int []nums1,int []nums2) {
		int left=nums1.length-1;
		int right=0;
		while(left>0) {//exchange the value by comparing.
			if(nums1[left]>nums2[right]) {
				int temp=nums1[left];
				nums1[left]=nums2[right];
				nums2[right]=temp;
				left--;
				right++;
			}
			else {
				left--;
				right++;
			}
		}
	}
	public static void sorting(int []nums) {
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]>nums[j]) {
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
	}
	
}

