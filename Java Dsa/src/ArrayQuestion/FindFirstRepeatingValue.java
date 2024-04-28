package ArrayQuestion;

public class FindFirstRepeatingValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,3,5,4,3,7,6,6};
		System.out.println(Find(arr));
	}
	static int Find(int []arr) {
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==1) {
				return arr[i];				
			}
			
		}
		return -1;
	}
}
