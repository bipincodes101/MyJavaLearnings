package ArrayQuestion;

import java.util.Arrays;

public class ReverseAnArray {
//reversing an array without extra space.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,4,5,6,7,8,9,10,11,12,13,14,15
				};
		int count=arr.length/2;
		for(int i=arr.length-1;i>count-1;i--) {
			int temp=arr[i];
			arr[i]=arr[(arr.length-1)-i];
			arr[(arr.length-1)-i]=temp;				
		}
		System.out.println(Arrays.toString(arr));
	}

}
