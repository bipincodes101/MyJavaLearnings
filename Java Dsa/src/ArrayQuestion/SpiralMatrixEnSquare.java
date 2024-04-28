package ArrayQuestion;
import java.util.Scanner;
public class SpiralMatrixEnSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value:");
		int value =sc.nextInt();
		int [][]arr=new int [value][value];
		spiralMatrix(value,arr);
		print(arr);
	}
 static int[][] spiralMatrix(int value,int [][]arr) {
	 int topRow=0,bottomRow=value-1,leftCol=0,rightCol=value-1;
	int count=1;
	 while(count<=value*value) {
		//topRow ->leftCol to rightCol
		 for(int j=leftCol;j<=rightCol && count<=value*value;j++) {
			 arr[topRow][j]=count++;
		 }
		 topRow++;
		 //rightCol-> topRow to bottomRow
		 for(int i=topRow;i<=bottomRow && count<=value*value;i++) {
			 arr[i][rightCol]= count++;
		 }
		 rightCol--;
		 //bottomRow->rightCol to leftCol
		 for(int j=rightCol;j>=leftCol && count<=value*value;j--) {
			 arr[bottomRow][j]=count++;
		 }
		 bottomRow--;
		 //leftCol->bottomRow to topRow
		 for(int i=bottomRow;i>=topRow && count<=value*value;i--) {
			 arr[i][leftCol]=count++;
		 }
		leftCol++;
	 }
	 return arr;
 }
//method for printing the array.
 static void print(int [][]arr) {	
	
	 	for(int i=0;i<arr.length;i++) {
	 		for(int j=0;j<arr[i].length;j++) {
	 			System.out.print(arr[i][j]+" ");
	 		}
	 		System.out.println();
	 	}
 }
 	
}
