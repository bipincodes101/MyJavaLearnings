package Sorting;

public class UniqueValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int []arr= {1,2,4,-2,3,4,2,1,3};
				System.out.println(uniqueElement(arr));
	}
	public static int uniqueElement(int[]arr) {
		
		for(int i=0;i<arr.length;i++) {
			int count =0;
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					count++;
				}	
			}
			if(count<=0) {
				return arr[i];
			}
			
			
		}
		return -1;
	}

}
