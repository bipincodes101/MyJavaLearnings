package ArrayQuestion;

public class MissingNumberProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5,6,7,9,10};
//		int result =missing(arr);
//		System.out.println(result);
		int result=missingElement(arr);
		System.out.println(result);
	}
	/*Approach -1*/
//	static int missing(int []arr) {
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i+1]!=arr[i]+1) {
//				return arr[i]+1;
//			}
//			
//		}
//		return 0;
//	}
	//Approach -2;
	
		
	
  static int missingElement(int[] arr) {
	int sum=0;
	int n=arr.length;
	int uniSum=(n+1)*(n+2)/2;
	for(int i=0;i<arr.length;i++) {
		sum+=arr[i];
	}
	int missingNumber=uniSum-sum;
	return missingNumber;

}
  }
