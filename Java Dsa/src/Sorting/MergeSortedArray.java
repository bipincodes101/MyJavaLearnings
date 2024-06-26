package Sorting;

import java.util.Arrays;

public class MergeSortedArray {
	public static void main(String []args) {		
	int []nums1= {1,2,3};
	int []nums2= {2,5,6};
	int []result=new int[6];	
	int [] demo=sorting(nums1,nums2,result);
	System.out.println(Arrays.toString(demo));
     }
	
	static public int[] sorting(int []nums1,int[]nums2,int []result) {
		int i=0,j=0,k=0;
		while(i<nums1.length && j<nums2.length) {
			if(nums1[i]<nums2[j]) {
				result[k++]=nums1[i++];
			}
			else
				result[k++]=nums2[j++];
		}
		for( ;i<nums1.length;i++) {
			result[k++]=nums1[i];
		}
		for( ;j<nums2.length;j++) {
			result[k++]=nums2[j];
		}
		return result;
		
	}
}	