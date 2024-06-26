import java.util.Arrays;

public class SquareSortedOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {-4,-1,0,3,10};
		sorting(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void sorting(int []nums) {
		for(int i=0;i<nums.length;i++) {
			nums[i]=nums[i]*nums[i];
		}
				
	}
	public void sort(int []nums) {
		int right1=nums[nums.length-1];
		int right2=nums[nums.length-1];
		while(right2>=0) {
			right1--;
			if(right1>right2) {
				int temp=right1;
				right1=right2;
				right2=right1;
				right2--;f
			}
		}
	}
}
