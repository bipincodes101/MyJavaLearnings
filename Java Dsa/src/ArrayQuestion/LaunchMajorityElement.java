package ArrayQuestion;
//using moore's voting algorithm
public class LaunchMajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,1,1,1,1,3,4,4,};
		int result =majorityElement(arr);
		System.out.println(result);
		
	}
	public static int majorityElement(int []arr) {
		int majority =arr[0];
		int votes=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==majority) {
				votes++;
			}else if(votes==0){
				majority=arr[i];
				votes++;;
			}else {
				votes--;
			}
		}
		return majority;
	}

}
