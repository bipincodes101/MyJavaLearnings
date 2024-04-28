package ArrayQuestion;

import java.util.Arrays;

public class PrefixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5,6,7,0,-3,-7,19,10,20};
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
			
		}
		System.out.println(Arrays.toString(arr));
   }
}
