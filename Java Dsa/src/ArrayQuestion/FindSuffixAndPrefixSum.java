package ArrayQuestion;

public class FindSuffixAndPrefixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {5,9,2,6,1,5};
		boolean answer=result(arr);
		System.out.println(answer);
	}
	//for finding total sum array.
	static int findTotalSum(int []arr) {
		int totalSum=0;
		for(int i=0;i<arr.length;i++) {
			totalSum+=arr[i];
		}
		return totalSum;
	}
	static boolean result(int []arr) {
		int totalSum=findTotalSum(arr);
		int prefix=0;
		for(int i=0;i<arr.length;i++) {
			prefix+=arr[i];
			int suffix=totalSum-prefix;
			if(prefix==suffix) {
				return true;
			}
			
		}
		return false;
	}

}
