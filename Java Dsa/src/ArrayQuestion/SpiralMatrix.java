package ArrayQuestion;
import java.util.Scanner;
public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your row  ");
		int r=sc.nextInt();
		System.out.println("enter your column");
		int c=sc.nextInt();
		int [][]arr=new int[r][c];
		System.out.println("enter total "+r*c +" elements");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				 arr[i][j]=sc.nextInt();
			}
		}
		//print the original matrix.
		System.out.println("this is original matrix");
		print(arr,r,c);
		System.out.println();
		//call the spiralMatrix Method.
		System.out.println("this is spiral matrix");
		spiralMatrix(arr,r,c);
	
		
	}
	//method for printing the array.
 static void print(int [][]arr,int r,int c) {
	 for(int i=0;i<r;i++) {
		 for(int j=0;j<c;j++) {
			 System.out.print(arr[i][j]+" ");
		 }
		 System.out.println();
	 }
	
 }
 //method for spiral matrix.
 static void spiralMatrix(int [][]arr,int row,int column) {
	 int topRow=0,bottomRow=row-1,leftColumn=0,rightColumn=column-1;
	 int totalElements=0;
	 while(totalElements<row*column) {
		//1.topRow->leftColumn->rightColumn.
		 for(int j=leftColumn;j<=rightColumn&&totalElements<row*column;j++) {
			 System.out.print(arr[topRow][j]+" ");
			 totalElements++;
		 }
		 topRow++;
		 
		 //2.rightColumn->topRow to bottomrow.
		 for(int i=topRow;i<=bottomRow&&totalElements<row*column;i++) {
			 System.out.print(arr[i][rightColumn]+" ");
			 totalElements++;
		 }
		 rightColumn--;
		
		//3.bottomRow->rightColumn to LeftColumn.
		for(int j=rightColumn;j>=leftColumn&&totalElements<row*column;j--) {
			System.out.print(arr[bottomRow][j]+" ");
			 totalElements++;
		}
		bottomRow--;
		
		//4.leftColumn->bottomRow to topRow.
		for(int i=bottomRow;i>=topRow&&totalElements<row*column;i--) {
			System.out.print(arr[i][leftColumn]+" ");
			totalElements++;
	 }
		leftColumn++;
		
	}
 }

}
