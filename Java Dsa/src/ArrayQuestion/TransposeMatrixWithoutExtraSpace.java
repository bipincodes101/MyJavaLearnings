package ArrayQuestion;

public class TransposeMatrixWithoutExtraSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr=new int[][] {
			{0,2,3},
			{4,-4,6},
			{7,10,9}
		};
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr[i].length;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;				
			}			
		}	
		printing(arr);
	
	}
		static void printing(int [][]arr) {
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
	
		
		

