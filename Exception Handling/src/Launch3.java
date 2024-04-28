import java.util.Scanner;
public class Launch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int []arr = null;
		int element=0;
		//try box for handling arithmetic exception.
		try {
			System.out.println("enter the number which divides 100");
			int num=sc.nextInt();
			int divide=100/num;
		}
		catch(ArithmeticException a1){
			System.out.println("denometer is wrong");
		}
		//for handling negative size array.
		try {
			System.out.println("enter the size of array:");
			int size =sc.nextInt();
		  arr=new int [size];	
		}
		catch(NegativeArraySizeException a2){
			System.out.println("array size in negative that is not possible give positive");
		}
		//default excetion.
		
		try {
			 System.out.println("enter the array position where you want to put the element");
				int postion =sc.nextInt();
				arr[postion]=element;
		}
		catch(ArrayIndexOutOfBoundsException a4){
			System.out.println("your array is out of bound");
		}
		catch(NullPointerException a5) {
			System.out.println("fool your array is null");
		}
		try {
			  System.out.println("enter ther array element:");
			     element =sc.nextInt();
		}
		catch(Exception e) {
			System.out.println("be careful");
		}
		System.out.println("program is successful");
	 
	  
	}

}
