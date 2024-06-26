package Sorting;

public class TargetSum {

	public static void main(String[] argsm) {
		// TODO Auto-generated method stub
		int []arr= {4,5,3,6,8,9,3,3};
		int target =7;
		System.out.println(targetSum(arr,target));
	}
	public static int targetSum(int []arr,int target) {
		int count =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					count++;
				}
			}
		}
		return count;
	}
}
