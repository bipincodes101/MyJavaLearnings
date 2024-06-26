package ArrayQuestion;

public class PalindromeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,3,2,1};
		int flag=0;
		for(int i=0;i<arr.length/2;i++) {
			if(arr[i]==arr[arr.length-i-1]) {
				flag=1;
			}
		}
		if(flag==0) {
			System.out.println("not palindrome");
		}else {
			System.out.println("palindrome");
		}
	}

}
