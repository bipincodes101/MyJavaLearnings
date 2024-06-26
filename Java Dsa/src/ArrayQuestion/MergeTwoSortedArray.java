package ArrayQuestion;

import java.util.Arrays;
/*
 time complexity=O(m+n)+O(m+n);
 space complexity=O(n);
 */
public class MergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr1= {1,3,5,7};
		int []arr2= {0,2,6,8,9};
		int m=arr1.length;
		int n=arr2.length;;
		int []arr3=new int [m+n];
		int []result=merging(arr1,arr2,arr3,m,n);
		System.out.println(Arrays.toString(result));
		int []firstArray=leftBack(arr1,arr3);
		System.out.println(Arrays.toString(firstArray));
		int []secondArray=rightBack(arr2,arr3,arr1);
		System.out.println(Arrays.toString(secondArray));
		
	}
	public static int [] merging(int[]arr1,int []arr2,int []arr3 ,int m,int n) {
		int left=0;
		int right=0;
		int temp=0;
		while(left<m && right<n) {//checking both array during comparison.
			if(arr1[left]<=arr2[right]) {
				arr3[temp]=arr1[left];
				left++; 
				temp++;
			}else {
				arr3[temp]=arr2[right];
				temp++;
				right++;
			}
		}
		while(left<m) {//if arr1 is remaining put the elements into arr3 array.
			arr3[temp]=arr1[left];
			temp++;
			left++;
		}
		while(right<n) {//if in arr2 element is remaining put into arr3;
			arr3[temp]=arr2[right];
			temp++;
			right++;
		}
		return arr3;
	}
	public static int[] leftBack(int[]arr1,int[]arr3) {
		int left=0;
		int count=0;
		int right=0;
		while(left<arr1.length) {
			arr1[left]=arr3[count];
			count++;
			left++;
		}
		return arr1;
	}
	public static int []rightBack(int []arr2,int []arr3,int []arr1){
		int right=0;
		int count=arr1.length;
		while(right<arr2.length) {
			arr2[right]=arr3[count];
			count++;
			right++;
		}
		return arr2;
		
	}
}
