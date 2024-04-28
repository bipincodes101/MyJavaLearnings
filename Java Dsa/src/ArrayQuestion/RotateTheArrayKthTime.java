package ArrayQuestion;

import java.util.Arrays;

public class RotateTheArrayKthTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,4,6,9,10,12};
		
		int k=3%arr.length;
		while(k>0) {
			int i=arr.length-2;
			int j=arr.length-1;
			int temp=arr[arr.length-1];
			while (i>=0 && j>=0) {
				arr[j]=arr[i];
				j--;
				i--;
			}
			arr[0]=temp;
			k--;
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
