package ArrayQuestion;

public class FindingLowerAndHIghBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {6,6,6,6,8,10,10,10,10,11};
		int target=10;
		int result =lowerBound(arr,target);
		System.out.println("index is : "+result);
	}
	public static int lowerBound(int []arr,int target) {
		int low  =0;
		int high=arr.length-1;
		int result =0;
		while (low<=high) {
			int mid=(low + high)/2;
			if (target==arr[mid]) { 
				 result =mid;
				 high=mid-1;
			}
			else if(target <arr[mid] ) {
				high=mid-1;
			}
			else if (target > arr[mid]) {
				low =mid+1;
			}
			
		}
		return result ;
	}
	
}
