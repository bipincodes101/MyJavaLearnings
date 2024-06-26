package ArrayQuestion;

import java.util.HashMap;

public class SubArrayEqualsk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,-3,1,1,1,4,2,-3};
		int target = 3;
		int result = subArray(arr, target);
		System.out.println(result);
	}
	
	
	public static int subArray(int[] arr, int target) {
//		int count = 0;
//		for (int i = 0; i < arr.length; i++) {
//			int sum=0;
//			for (int j = i; j < arr.length; j++) {
//				for (int k = i; k <= j; k++) {
//					 sum = sum + arr[k];				
//					if (sum == total) {
//						count++;
//						
//					}
//				}
//				
//			}
//		}
//		return count;
	
		///THIS IS BETTER SOLUTION.--
//		int count =0;
//		for(int i=0;i<arr.length;i++) {
//			int sum=0;
//			for(int j=i;j<arr.length;j++) {
//				sum=sum+arr[j];
//				if(sum==total) {
//					count ++;
//				}
//			}
//		}
//		return count ;
		
			///THIS IS OPTIMAL SOLUTION--
	 int count =0;
	 HashMap<Integer,Integer>maps= new HashMap<>();
	 maps.put(0,1);
	int prefixSum=0;
	for(int i=0;i<arr.length;i++) {
		prefixSum+=arr[i];
		if(maps.containsKey(prefixSum-target)) {
			count+=maps.get(prefixSum-target);
		}
		maps.put(prefixSum, maps.getOrDefault(prefixSum,0)+1);
	   }
	return count;
	}
}
