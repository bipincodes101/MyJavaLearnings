package ArrayQuestion;

import java.util.Arrays;

public class ReverseArrayProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,4,6,-3,7};
		int []result=reverse(arr);
		System.out.println(Arrays.toString(result));
		
	}
	static int [] reverse(int arr[]) {
		for(int i=0;i<arr.length/2;i++) {
			int temp=arr[arr.length-1-i];
			arr[arr.length-1-i]=arr[i];
			arr[i]=temp;
		}
		return arr;
		
	}

}
