package ArrayQuestion;
import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3,2,4};
		
		int[] result = display(nums,6);
		System.out.println(Arrays.toString(result));

	}

	static int[] display(int[] nums, int target) {
		
		int i=0;
		int j=0;
		for ( i=i; i< nums.length; i++) {
			for ( j=i;j < nums.length; j++) {
				if(nums[j-i]+nums[j]==target) {
					return new int[] {j-i,j};
				}
				}
			
			}
	
		
		return new int[] {-1,-1};
		}
		
		

	}

