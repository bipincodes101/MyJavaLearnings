package ArrayQuestion;

public class RotationArrayProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr= {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		transposeMatrix(arr);
		
		changeColumn(arr);
		printArray(arr);
	}
	static public void transposeMatrix(int [][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr[i].length;j++) {
				int temp=arr[i][j];
				arr[i][j]= arr[j][i];
				arr[j][i]=temp;
			}
		}
	}
	 static public void changeColumn(int [][]arr) {
		 for(int i=0;i<arr.length;i++) {
		 int left=0;
		 int right=arr.length-1;
		 while(left<right) {
			 int temp=arr[i][left];
			 arr[i][left]=arr[i][right];
			 arr[i][right]=temp;
			 left++;
			 right--;
		 }
		 
		 }
	 }
 static public void printArray(int [][]arr) {
	 for(int i=0;i<arr.length;i++) {
		 for(int j=0;j<arr[i].length;j++) {
			 System.out.print(arr[i][j]+" ");
		 }
		 System.out.println();
	 }
 }
 
}
