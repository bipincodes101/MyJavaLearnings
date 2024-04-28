package ArrayQuestion;

import java.util.Arrays;

public class SortOddEvenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {0,1,3,2,4,5,6,7,8,9,10,-5,-6};
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
