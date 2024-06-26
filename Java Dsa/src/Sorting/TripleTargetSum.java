package bubblesort;

public class TripleTargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 4, 5, 6, 3, 7 };
		int target = 12;
		System.out.println(targetSum(arr,target));
	}

	public static int targetSum(int[] arr, int target) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == target) {
						count++;
						System.out.println("this is i: " + i + "this is j: " + j + "this is k:" + k);
					}
				}
			}
		}
		return count;
	}
}
