package ArrayQuestion;
import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int result=removeDuplicates(arr);
		System.out.println(result);
		
			System.out.println(Arrays.toString(arr));
		
	}
	static int removeDuplicates(int arr[]){
		int i=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[i]!=arr[j]) {
				arr[++i]=arr[j];
			}
		}
		return ++i;
	}
}
