package ArrayQuestion;

import java.util.Arrays;

public class ZeroLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,0,4};
		int []result=show(arr);
		System.out.println(Arrays.toString(result));
	}
	public static int[]show(int[]arr){
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
		}
		return arr;
	}

}
