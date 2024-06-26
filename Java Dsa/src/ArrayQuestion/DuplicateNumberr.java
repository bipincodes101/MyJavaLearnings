package ArrayQuestion;

public class DuplicateNumberr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,6,4,1,3,1,5};
		System.out.println(duplicate(arr));
	}
	public static int duplicate(int []arr) {
		int slow=arr[0];
		int fast =arr[0];
		do {
			slow=arr[slow];
			fast=arr[arr[fast]];
		}while(slow!=fast);
		slow=arr[0];;
		while(slow!=fast) {
			slow=arr[slow];
			fast =arr[fast];
		}
		return slow;
	}
	

}
