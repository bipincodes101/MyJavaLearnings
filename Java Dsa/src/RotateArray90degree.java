import java.util.Arrays;
import java.util.Scanner;

public class RotateArray90degree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("enter the number");
				arr[i][j] = sc.nextInt();
			}
		}
		// for printing 2d array.
//		System.out.println(Arrays.deepToString(arr));
		System.out.println("this is input matrix");
		printing(arr);
		System.out.println("your 90 degree rotated array");
		rotateMatrix(arr);
		printing(arr);
	}

	// for transpose matrix.
	static void transposeMatrix(int arr[][]) {
	 for(int i=0;i<arr.length;i++) {
		 for(int j=i;j<arr[i].length;j++) {
			int temp=arr[i][j];
			arr[i][j]=arr[j][i];
			arr[j][i]=temp;
		 }
	 }
	
	 
  }
	
	static void printing(int arr[][]) {


	 for(int i=0;i<arr.length;i++){
		 for(int j=0;j<arr[i].length;j++) {
			 System.out.print(arr[i][j]+" ");
			 
	 }
		 System.out.println();
   }
	 
		
 }
	static void reverseArray(int[] arr) {
		int i=0;
		int j=arr.length-1;
		 while(i<j) {
			 int temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
			i++;
			j--;
		 }
	 }
	static void rotateMatrix(int [][]arr) {
		
		//transpose the matrix
		transposeMatrix(arr);
		//reverse the array.
		for(int i=0;i<arr.length;i++) {
			reverseArray(arr[i]);
		}
	}
}
